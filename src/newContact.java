

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.DAOContact;


/**
 * Servlet implementation class newContact
 */
public class newContact extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
		
		String fistName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String street = request.getParameter("street");
		String city = request.getParameter("city");
		String zip = request.getParameter("zip");
		String country = request.getParameter("country");
		String phoneNumber = request.getParameter("phonenumber");
		String phoneKind = request.getParameter("phonekind");
		String groupeName = request.getParameter("groupename");
		String entrepriseCheck = request.getParameter("entreprisecheck");
		String numSiret = request.getParameter("numsiret");
		DAOContact daoContact= new DAOContact();
		System.out.println(entrepriseCheck);
		
		try{
			daoContact.addContact(fistName, lastName, email,street,city,zip,country,phoneNumber,phoneKind,groupeName,entrepriseCheck,numSiret);
			out.println("<title>Error !</title>" +
		       "<body bgcolor=FFFFFF>");
			out.println("<h2> Succés : le contact : { " + fistName + " " + lastName + " } a été bien inserré ! </h2>");
			
		}
		catch (Exception e) {
			// TODO: handle exception
			out.println("<title>Error !</title>" +
		       "<body bgcolor=FFFFFF>");
		    out.println("<h2> Erreur : le contact : { " + fistName + " " + lastName + " } n'a pas être inserré ! </h2>");
		} 
		
	    

	}

}
