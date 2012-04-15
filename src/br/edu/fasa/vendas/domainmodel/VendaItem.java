/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainmodel;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author cliente
 */
@Entity
@Table(name="venda_itens")
public class VendaItem implements Serializable {
    private static long serialVersionUID = 1L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="pk_cod")
    private Long cod;
    
    @ManyToOne(cascade=CascadeType.PERSIST,targetEntity=Venda.class)
    @JoinColumn(name="fk_venda", referencedColumnName="pk_cod")
    private Venda venda;
    
    @ManyToOne(cascade= CascadeType.PERSIST,targetEntity=Produto.class)
    @JoinColumn(name="fk_produto",referencedColumnName="pk_cod")
    private Produto produto;
    
    @Column(name="quantidade")
    private int quantidade;
    
    @Column(name="valor_unitario")
    private float valorUnitario;

    public Long getCod() {
        return cod;
    }

    public void setId(Long cod) {
        this.setCod(cod);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getCod() != null ? getCod().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendaItem)) {
            return false;
        }
        VendaItem other = (VendaItem) object;
        if ((this.cod == null && other.cod != null) || (this.cod != null && !this.cod.equals(other.cod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.fasa.vendas.domainmodel.VendaItem[ id=" + cod + " ]";
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(Long cod) {
        this.cod = cod;
    }

    /**
     * @return the venda
     */
    public Venda getVenda() {
        return venda;
    }

    /**
     * @param venda the venda to set
     */
    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valorUnitario
     */
    public float getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitario to set
     */
    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
}
