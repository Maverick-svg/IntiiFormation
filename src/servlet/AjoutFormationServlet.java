package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FormationDAO;
import dao.IFormationDAO;
import dao.ILieuxDAO;
import dao.LieuDAO;
import model.Formation;
import model.Lieu;

/**
 * Servlet implementation class AjoutLieuServlet
 */
@WebServlet("/AjoutFormationServlet")
public class AjoutFormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutFormationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/View/formation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Formation f = new Formation();
		f.setTheme(request.getParameter("theme"));
		Lieu l = new Lieu();
		l.setIdLieu(Integer.parseInt(request.getParameter("lieu")));
		f.setLieu(l);
		
		
IFormationDAO xx = new FormationDAO();
		xx.saveFormation(f);
		this.getServletContext().getRequestDispatcher("/WEB-INF/View/formation.jsp").forward(request, response);
	}

}
