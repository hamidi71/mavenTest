package nl.programIt.test;
//test is gemaakt door Baddi op 17-08-2012

import static org.junit.Assert.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import nl.programIt.entities.Werknemer;
import nl.programIt.service.interfaces.IWerknemerService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//Declare la relation entre spring et Junit
@RunWith(SpringJUnit4ClassRunner.class)
//charger context
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class WerknemerServieceImplTest {
	@Autowired
	private IWerknemerService werknemer;
		
	@Test
	public void findAllPesoonTest(){
		//assertNull(pers.findAllPesoon());	
		assertNotEquals(0, werknemer.findAllWerknemers().size());
	}
	
	@Test
	public void AddWerknemerTest(){
		try {
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		//bij deze datum wordt:3092-07-10 
		Werknemer p1=new Werknemer("Ilias","Hamidi", new Date(2002, 06, 10),"Web Developer","ilias@gmail.com");
		//bij deze  de datum is 2002-06-10
		Werknemer p2=new Werknemer("Ilias","Hamidi",df.parse("2002-06-10"),"Web Developer","ilias@gmail.com");
		Werknemer p3=new Werknemer("Baddi","Hamidi",df.parse("1971-07-01"),"php programmeur","Baddi@gmail.com");
		Werknemer p4=new Werknemer("Bilal","Hamidi",df.parse("2004-12-15"),"c# programmeur","Bilal@gmail.com");
		//bij deze de datum is datum van(het systeem) vandaag
		Werknemer p5=new Werknemer("Mohammed","Hamidi", new Date(),"Java programmeur","mohammed@gmail.com");
		werknemer.AddWerknemer(p1);
		werknemer.AddWerknemer(p2);
		werknemer.AddWerknemer(p3);
		werknemer.AddWerknemer(p4);
		werknemer.AddWerknemer(p5);
		
		assertTrue(true);
			
		} catch (Exception e) {
			assertFalse(false);
			
		}
	}

}
