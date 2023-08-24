package io.github.cursomicroservice.msavaliadorcredito.application.exception;

public class DadosClienteNotFoundException extends Exception {
    public DadosClienteNotFoundException() {
        super("Dados do Cliente não encontrado para o CPF informado.");
    }
}
