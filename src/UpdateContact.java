

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.DAOContact;

/**
 * Servlet implementation class UpdateContact
 */
public class UpdateContact extends HttpServlet {
	
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String fistName = request.getParameter("firstname");
	String lastName = request.getParameter("lastname");
	String email = request.getParameter("email");
	String id = request.getParameter("id");
	DAOContact daoContact= new DAOContact();
	daoContact.updateContact(id, fistName, lastName, email);

	
}

}
