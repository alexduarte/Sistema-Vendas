/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainmodel;


import java.util.Date;
import java.util.List;
import java.util.Timer;
import javax.persistence.*;

/**
 *
 * @author Alexsander Duarte Pimenta
 */
@Entity
@Table(name="vendas")
public class Venda {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="pk_cod")
    private int cod;
    
    
    @ManyToOne(cascade=CascadeType.PERSIST, targetEntity=Cliente.class)
    @JoinColumn(name="fk_cliente", referencedColumnName="pk_cod")
    private Cliente cliente;
    
    @OneToMany(cascade= CascadeType.ALL,targetEntity=VendaItem.class)
    private List<VendaItem> items;
    
    @Temporal(TemporalType.DATE)
    private Date data;

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    
    
    
}
