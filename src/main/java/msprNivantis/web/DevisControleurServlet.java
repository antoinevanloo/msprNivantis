package msprNivantis.web;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import msprNivantis.modele.Produit;
import msprNivantis.modele.ProduitDao;

/**
 * Servlet implementation class DevisControleurServlet
 */
@WebServlet("/devis")
public class DevisControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name = "nivantis")
	private DataSource dataSource;
	
	@PersistenceContext(unitName="nivantis")
	private EntityManager em;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DevisControleurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	ProduitDao pDao = new ProduitDao(em);
    	
    	List<Produit> produits = pDao.get();
    	
    	req.setAttribute("produits", produits);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/devis.jsp");
		rd.forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pId = req.getParameter("produits");
		
	}

}
