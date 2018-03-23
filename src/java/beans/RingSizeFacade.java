/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import entities.RingSize;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author NATSAMA
 */
@Stateless
public class RingSizeFacade extends AbstractFacade<RingSize> implements RingSizeFacadeLocal {
    @PersistenceContext(unitName = "ProjectTestPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RingSizeFacade() {
        super(RingSize.class);
    }
    
}
