package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FormationDAO;
import dao.IFormationDAO;
import model.Lieu;

/**
 * Servlet implementation class ListFormationServlet
 */
@WebServlet("/ListFormationServlet")
public class ListFormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListFormationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/View/ListFormation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IFormationDAO dao = new FormationDAO();
		Lieu lieu = new Lieu();
		lieu.setVille(request.getParameter("ville"));
		
		request.setAttribute("listes", dao.getFormationByLoacl(lieu));
		this.getServletContext().getRequestDispatcher("/WEB-INF/View/ListFormation.jsp").forward(request, response);
	}

}
