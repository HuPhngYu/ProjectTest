package controllers;

import beans.CategoryFacadeLocal;
import entities.Category;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AddCategoryServlet", urlPatterns = {"/AddCategoryServlet"})
public class AddCategoryServlet extends HttpServlet {
    @PersistenceContext(unitName = "ProjectTestPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;
    @EJB
    private CategoryFacadeLocal categoryFacade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String name = request.getParameter("catName");
            int parent = Integer.parseInt(request.getParameter("parent"));
            Category parentCat = categoryFacade.find(parent);
            Category newCat;
            if (parent == 0) {
                newCat = new Category(name, null);
            } else {
                newCat = new Category(name, parentCat);
                parentCat.addChildToParent(newCat);
            }
            categoryFacade.create(newCat);
            response.sendRedirect("ShowCategoryServlet");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public void persist(Object object) {
        try {
            utx.begin();
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }

}
