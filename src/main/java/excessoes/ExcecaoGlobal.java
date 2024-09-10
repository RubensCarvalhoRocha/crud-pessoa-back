package excessoes;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExcecaoGlobal {

    @ExceptionHandler(ExcecaoPessoaNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handlePessoaNotFoundException(ExcecaoPessoaNotFound ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleRuntimeException(RuntimeException ex) {
        return "Erro interno: " + ex.getMessage();
    }
}