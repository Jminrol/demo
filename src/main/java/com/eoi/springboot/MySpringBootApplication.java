package com.eoi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * La Clase MySpringBootApplication, clase padre de la aplicaci&oacute;n SpringBoot
 */
@SpringBootApplication
@RestController
public class MySpringBootApplication {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
    }

    /**
     * Hello main  string.
     *
     * @return el string por defecto "Main Class" para testear la aplicación
     */
    @GetMapping("/")
    String helloMain() {
        return "Main class";
    }

    /**
     * The type Controlador usuarios.
     */
    @RestController
    public static class  ControladorUsuarios {
        /**
         * Hellow string.
         *
         * @return the string
         */
        @RequestMapping("/")
        String hellow() {
            return "Hello World!";
        }

        /**
         * Holam string.
         *
         * @return the string
         */
        @RequestMapping("/hola")
        String holam() {
            return "Hola mundo!";
        }

        /**
         * Medicacion string.
         *
         * @return the string
         */
        @RequestMapping("/mimedicacion")
        String medicacion() {
            return "Tomate las pastillas!";
        }
    }
}

