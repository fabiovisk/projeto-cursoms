package io.github.cursomicroservice.mscartoes.application.representation;

import io.github.cursomicroservice.mscartoes.domain.BandeiraCartao;
import io.github.cursomicroservice.mscartoes.domain.Cartao;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartaoSaveRequest {
    private String nome;
    private BandeiraCartao bandeira;
    private BigDecimal renda;
    private BigDecimal limite;

    public Cartao toModal(){
        return new Cartao(nome, bandeira, renda, limite);
    }
}
