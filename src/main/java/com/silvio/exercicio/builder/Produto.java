package com.silvio.exercicio.builder;

import java.time.LocalDate;
import lombok.Getter;

/**
 *
 * @author silvio
 */
@Getter
public class Produto {
    
    private long id;
    private String titulo;
    private String descricao;
    private String marca;
    private String modelo;
    private int estoque = 0;
    private double preco;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private String urlFoto;
    private String categoria;
    private Vendedor vendedor;
    private double peso;
    private double altura;
    private double profundidade;

    Produto(ProdutoBuilder produtoBuilder) {
        this.titulo = produtoBuilder.titulo;
        this.descricao = produtoBuilder.descricao;
        this.preco = produtoBuilder.preco;
        this.dataCadastro = produtoBuilder.dataCadastro;
        this.dataUltimaAtualizacao = produtoBuilder.dataUltimaAtualizacao;
        this.categoria = produtoBuilder.categoria;
        this.vendedor = produtoBuilder.vendedor;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        if ( !this.getMarca().isEmpty() )
            this.modelo = modelo;
        else
            System.err.println("O modelo so pode ser adicionado caso tenha uma marca!");
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", titulo=" + titulo + ", descricao=" +
                descricao + ", marca=" + marca + ", modelo=" + getModelo() + ", estoque=" +
                estoque + ", preco=" + preco + ", dataCadastro=" + dataCadastro +
                ", dataUltimaAtualizacao=" + dataUltimaAtualizacao + ", urlFoto=" +
                urlFoto + ", categoria=" + categoria + ", vendedor=" + vendedor +
                ", peso=" + peso + ", altura=" + altura + ", profundidade=" +
                profundidade + '}';
    }
    
}
