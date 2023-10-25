package bj.dgb.finances.domiciliation.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundExeption extends RuntimeException {
    private String message;
    public ResourceNotFoundExeption(String message) {

        super(message);
        this.message = message;

    }
}
