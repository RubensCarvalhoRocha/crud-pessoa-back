package excessoes;

public class ExcecaoPessoaNotFound extends RuntimeException  {
    public ExcecaoPessoaNotFound(Long id) {
        super("Pessoa não encontrada com o ID: " + id);
    }
}