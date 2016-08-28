/**
 * Datum 27-08-2016
 */
package nl.programIt.web;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import nl.programIt.LoaderClass;
import nl.programIt.service.impl.WerknemerServiceImpl;

import nl.programIt.service.interfaces.IWerknemerService;

//@Component
public class MedwerkerServlet extends HttpServlet{
		//doGet url (zichbaar in URI)
		//doPost onzichbaar in URI als wachtwoord
	    //do + ctrl +space
		
		//HttpServletRequest vraag
		//HttpServletResponse aantworden
	   	//LoaderClass lod =new LoaderClass();
	   	private IWerknemerService werknemerService=LoaderClass.getWerknemerService();
	  
	   
		//@Autowired is niet van toepassing
		//private IWerknemerService werknemerService;
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			/*String naam=req.getParameter("parindex1");//komt vant index.html naam=par1="Ilias.Hamid"
			int leeftijd =Integer.valueOf(req.getParameter("parindex2"));//komtvan index.html leeftijd=par2=120
			//System.out.println(naam + leeftijd);
			req.setAttribute("parhome1", naam);
			req.setAttribute("parhome2",leeftijd );*/			
			//System.out.println(werknemerService.findAllWerknemers().size());
			req.setAttribute("listWerknemers", werknemerService.findAllWerknemers());
			req.getRequestDispatcher("home.jsp").forward(req, resp);		
						
		}
}
