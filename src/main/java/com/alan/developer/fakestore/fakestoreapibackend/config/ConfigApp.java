package com.alan.developer.fakestore.fakestoreapibackend.config;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.sleuth.SpanAdjuster;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {

    @Value("${spring.application.name}")
    private String appName;
    @Bean
    SpanAdjuster adjusterOne() {

        return span -> span.toBuilder().name(appName).build();
    }
    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
