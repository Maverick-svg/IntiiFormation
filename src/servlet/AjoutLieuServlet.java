package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ILieuxDAO;
import dao.LieuDAO;
import model.Lieu;

/**
 * Servlet implementation class AjoutLieuServlet
 */
@WebServlet("/AjoutLieuServlet")
public class AjoutLieuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutLieuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/View/lieu.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Lieu l = new Lieu();
		l.setVille(request.getParameter("ville"));
		l.setAdresse(request.getParameter("Adresse"));
		
		ILieuxDAO dao = new LieuDAO();
		dao.createLocal(l);
		this.getServletContext().getRequestDispatcher("/WEB-INF/View/lieu.jsp").forward(request, response);
	}

}
