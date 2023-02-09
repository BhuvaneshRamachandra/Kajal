package com.ingenity.topspins;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
  @GetMapping("/example")
  public ResponseEntity<String> example() {
    return ResponseEntity.ok("Hello World!");
  }

  @PostMapping("/example2")
  public ResponseEntity<String> example(@RequestBody ExampleRequest request) {
    String message = "Hello " + request.getName() + "!";
    return ResponseEntity.ok(message);
  }

}