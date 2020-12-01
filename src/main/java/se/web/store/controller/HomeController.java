package se.web.store.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public ResponseEntity<String> firstMessage() {
        return ResponseEntity.ok("This is a testmessage");
    }

}
