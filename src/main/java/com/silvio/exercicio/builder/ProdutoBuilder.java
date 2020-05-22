package com.silvio.exercicio.builder;

import java.time.LocalDate;


public class ProdutoBuilder {

    String titulo;
    String descricao;
    double preco;
    LocalDate dataCadastro;
    LocalDate dataUltimaAtualizacao;
    String categoria;
    Vendedor vendedor;
    LocalDate ld = LocalDate.now();

    public ProdutoBuilder() {
    }

    public ProdutoBuilder titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public ProdutoBuilder descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoBuilder preco(double preco) {
        if(preco > 0)
            this.preco = preco;
        else
            throw new IllegalArgumentException("Preço deve ter valor maior que zero!!!");
        return this;
    }

    public ProdutoBuilder dataCadastro(LocalDate dataCadastro) {
        if(dataCadastro.equals(ld))
            this.dataCadastro = dataCadastro;
        else
            throw new IllegalArgumentException("A data nao pode ser menor que a data atual!");
        return this;
    }

    public ProdutoBuilder dataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        if(this.dataCadastro.equals(ld))
            this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        else
            throw new IllegalArgumentException("A data nao pode ser menor que a data atual");
        return this;
    }

    public ProdutoBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProdutoBuilder vendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        return this;
    }

    public Produto createProduto() {
        return new Produto(this);
    }
    
}
