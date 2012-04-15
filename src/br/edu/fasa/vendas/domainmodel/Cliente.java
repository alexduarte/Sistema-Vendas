/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainmodel;

import javax.persistence.*;

/**
 *
 * @author Alexsander Duarte Pimenta
 */
@Entity
@Table(name="clientes")
public class Cliente {
    
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="pk_cod")
   private int cod;
    
   @Column(name="nome")
   private String nome;

    
    public int getCod() {
        return cod;
    }

   

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    
    
    
}
