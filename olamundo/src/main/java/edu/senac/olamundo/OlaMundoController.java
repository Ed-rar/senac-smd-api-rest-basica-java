package edu.senac.olamundo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

//endereço http://localhost:8080/v1/olaMundo
@RequestMapping(value = "/v1")
public class OlaMundoController {

    //
    @GetMapping(value = "/olaMundo", produces = { "application/json" })
    public ResponseEntity<Response> helloWorldGet(){
        Response response = new Response("Ola Mundo get");
        return ResponseEntity.ok(response);
    }

    //
    @PostMapping(value = "/olaMundo", produces = { "application/json" })
    public ResponseEntity<Response> helloWorldPost(){
        Response response = new Response("Ola Mundo post");
        return ResponseEntity.ok(response);
    }

    //
    @PutMapping(value = "/olaMundo", produces = { "application/json" })
    public ResponseEntity<Response> helloWorldPut(){
        Response response = new Response("Ola Mundo put");
        return ResponseEntity.ok(response);
    }

    //
    @DeleteMapping(value = "/olaMundo", produces = { "application/json" })
    public ResponseEntity<Response> helloWorldDelete(){
        Response response = new Response("Ola Mundo delete");
        return ResponseEntity.ok(response);
    }
}
