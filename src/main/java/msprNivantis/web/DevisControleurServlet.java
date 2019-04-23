package msprNivantis.web;

import java.io.IOException;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class DevisControleurServlet
 */
@WebServlet("/devis")
public class DevisControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name = "nivantis")
	private DataSource dataSource;
	
	@PersistenceUnit(unitName="nivantis")
	private EntityManagerFactory entityManagerFactory;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DevisControleurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/devis.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
