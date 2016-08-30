/**
 * Datum 27-08-2016
 */
package nl.programIt.web;
import java.io.IOException;
import java.text.Format;
import java.text.ParseException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import nl.programIt.LoaderClass;
import nl.programIt.entities.Werknemer;
import nl.programIt.service.impl.WerknemerServiceImpl;
import nl.programIt.service.interfaces.IWerknemerService;

import java.text.SimpleDateFormat;

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
	   	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	   		throws ServletException, IOException {
	   		if(req.getParameter("action").equals("saveWerknemer")){
	   			String voornaam=req.getParameter("voornaamI");
	   			String achternaam=req.getParameter("achternaamI");	   			
	   			String email=req.getParameter("emailI");
	   			String functie=req.getParameter("functieI");
	   			String wachtwoord= req.getParameter("pswdI"); 
	   			//Date naar string converteren
	   			SimpleDateFormat format = new SimpleDateFormat ( ) ;
	   			Date datum=new Date();
			try { datum = format.parse(req.getParameter("datumI"));} 
			catch (ParseException e) {}  	   			 	   			
	   			Werknemer werk=new Werknemer();
	   			werk.setVoorNaam(voornaam);
	   			werk.setAchterNaam(achternaam);
	   			werk.setGeboorteDatum(datum);;
	   			werk.setEmail(email);
	   			werk.setWachtwoord(wachtwoord);
	   			werk.setFunctie(functie);	   			
	   			werknemerService.AddWerknemer(werk);	   			
	   			req.getRequestDispatcher("Index.html").forward(req, resp);				
			}	   	
	   	}
	   	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			/*String naam=req.getParameter("parindex1");//komt vant index.html naam=par1="Ilias.Hamid"
			int leeftijd =Integer.valueOf(req.getParameter("parindex2"));//komtvan index.html leeftijd=par2=120
			//System.out.println(naam + leeftijd);
			req.setAttribute("parhome1", naam);
			req.setAttribute("parhome2",leeftijd );*/			
			//System.out.println(werknemerService.findAllWerknemers().size());
			if(req.getParameter("action").equals("list")){						
				req.setAttribute("listWerknemers", werknemerService.findAllWerknemers());
				req.getRequestDispatcher("home.jsp").forward(req, resp);			
				}
			if(req.getParameter("action").equals("addWerknemer")){
				//req.getAttribute("addWerknemer",werknemerService.AddWerknemer(??));
				req.getRequestDispatcher("add.jsp").forward(req, resp);
			}
			if(req.getParameter("action").equals("remove")){
				long id=Long.valueOf(req.getParameter("idWerknemer")); 
				werknemerService.deleteWerknemer(id);				
				req.getRequestDispatcher("Index.html").forward(req, resp);
			}
		
   }
}
