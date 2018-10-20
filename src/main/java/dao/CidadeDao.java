/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Cidade;

/**
 *
 * @author rogeriocarmine
 */
public class CidadeDao {

    private EntityManager em;
    
    public CidadeDao(EntityManager em) {
        this.em=em;
    }
    
    public List<Cidade> listar(){
        String jpql="select c from Cidade c";
        Query query=em.createQuery(jpql);
        List<Cidade> lista=query.getResultList();
        return lista;
    }
    
}
