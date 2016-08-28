/**
 * Datum 27-08-2016
 */
package nl.programIt.web;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
  *<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Test</title>
</head>
<body>
	<h1>Test eerste Servlet voor dat ik ga verder</h1>
	<h3>nog een keer testen</h3>		  
	<a href="medwerker?parindex1=mohammedBaddi&parindex2=1200">Home</a>
</body>
</html> */
public class MedwerkerServlet extends HttpServlet{
		//doGet url (zichbaar in URI)
		//doPost onzichbaar in URI als wachtwoord
	    //do + ctrl +space
		@Override
		//HttpServletRequest vraag
		//HttpServletResponse aantworden
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			String naam=req.getParameter("parindex1");//komt vant index.html naam=par1="Ilias.Hamid"
			int leeftijd =Integer.valueOf(req.getParameter("parindex2"));//komtvan index.html leeftijd=par2=120
			//System.out.println(naam + leeftijd);
			req.setAttribute("parhome1", naam);
			req.setAttribute("parhome2",leeftijd );
			req.getRequestDispatcher("home.jsp").forward(req, resp);		
			/*home.jsp
			 * <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
			    pageEncoding="ISO-8859-1"%>
			<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
			<html>
	 		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<title>Home Jsp</title>
			</head>
			<body>
				<h2>Nom:<%=request.getAttribute("parhome1")%> Age:<%=request.getAttribute("parhome2")%></h2>
			</body>
			</html>*/			
		}
}
