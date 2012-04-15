/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import br.edu.fasa.vendas.domainmodel.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author cliente
 */
public class Main {
    
    public static void main(String args[]){
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("VendasPU");
        EntityManager manager = factory.createEntityManager();
        Cliente cli = new Cliente();
        cli.setNome("Alex2");
        EntityTransaction tran = manager.getTransaction();
        tran.begin();
        manager.persist(cli);
        tran.commit();
        
        

    }
    
}
