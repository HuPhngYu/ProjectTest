/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import entities.Variant;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author NATSAMA
 */
@Stateless
public class VariantFacade extends AbstractFacade<Variant> implements VariantFacadeLocal {
    @PersistenceContext(unitName = "ProjectTestPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VariantFacade() {
        super(Variant.class);
    }
    
}
