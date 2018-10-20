/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.CidadeDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Cidade;

/**
 *
 * @author rogeriocarmine
 */
@Stateless
public class CidadeService{
    
    @PersistenceContext    
    private EntityManager em;
    
    public List<Cidade> listar(){
        
        CidadeDao dao=new CidadeDao(em);
        
        return dao.listar();
        
    }
    
    
    
}
