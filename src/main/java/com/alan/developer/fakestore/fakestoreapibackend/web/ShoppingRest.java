package com.alan.developer.fakestore.fakestoreapibackend.web;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@Log
@RestController
@RequestMapping("store")
public class ShoppingRest {

    private final Random contandor;
    private final int max = 10000;

    ShoppingRest() {
        contandor = new Random(System.currentTimeMillis());
    }

    @GetMapping("shop")
    public String shop() {
        for (int i = 0; i < contandor.nextInt(max); i++) {
            log.info("Welcome");
            log.severe("No se puede encontrar el home");
        }
        return "Shpping";
    }

    @GetMapping("basket")
    public String basket() {
        for (int i = 0; i < contandor.nextInt(max); i++) {
            log.info("Consulta devuelta");
            log.severe("Servicio no encontrado");
        }
        return "Backet list";
    }
}
