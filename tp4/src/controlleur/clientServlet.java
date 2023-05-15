package controlleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.clientBean;

/**
 * Servlet implementation class clientServlet
 */
@WebServlet("/clientServlet")
public class clientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String tel = request.getParameter("num");
		String email = request.getParameter("email");
		
		//hawni a9wwaaaa fediiiiii hahahaha asyde asma3ni tkamli tchoufli fazet springboot oudhkhly li spring okk 
		clientBean c = new clientBean();
		  
		c.setNom(nom);
		c.setPrenom(prenom);
		c.setAdresse(adresse);
		c.setTel(tel);
		c.setEmail(email);
		
		
		request.setAttribute("c", c);
		this.getServletContext().getRequestDispatcher("/client.jsp").forward(request, response);		
		request.setAttribute("c" ,c ); 
		
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
