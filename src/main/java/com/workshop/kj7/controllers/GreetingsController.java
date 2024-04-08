package com.workshop.kj7.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kj7
 */
@RestController
@RequestMapping("api/v1/greeting")
public class GreetingsController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from our API");
    }

    @GetMapping("/say-good-bye")
    public ResponseEntity<String> sayGoodBye(){
        return ResponseEntity.ok("Good bye ans see you later");
    }
}
