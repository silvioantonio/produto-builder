/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silvio.exercicio.builder;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author silvio
 */
@Getter
@Setter
public class Vendedor {
    private String nome;

    @Override
    public String toString() {
        return "Vendedor{" + "nome=" + nome + '}';
    }
    
    
    
}
