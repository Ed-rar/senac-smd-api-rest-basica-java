package edu.senac.olamundo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

@Validated
public class Response {

    public Response(String message) {
        Message = message;
    }
    @JsonProperty("mensagem")
    private String Message;

}
