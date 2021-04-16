package refactorin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");

		Vehicle vehicle1 = new Vehicle("Tata", "Vista", Vehicle.BASIC);
		Date date = dateFormat.parse("2/8/2013");
		Lloguer lloguer1 = new Lloguer(date, 2, vehicle1);
		
		Vehicle vehicle2 = new Vehicle("Mazda", "v3", Vehicle.GENERAL);
		date = dateFormat.parse("12/8/2006");
		Lloguer lloguer2 = new Lloguer(date, 2, vehicle2);
		
		Vehicle vehicle3 = new Vehicle("Audi", "Q7", Vehicle.LUXE);
		date = dateFormat.parse("2/10/2020");
		Lloguer lloguer3 = new Lloguer(date, 7, vehicle3);
		
		Client c = new Client("23232323Y","Leo Messi","56565656");
		c.afegeix(lloguer1);
		c.afegeix(lloguer2);
		c.afegeix(lloguer3);
		//System.out.print(c.informe());
		System.out.print(GestorLloguersLite(c));
		//System.out.println(dateFormat.format(lloguerBasic.getData()));
		
	}
	public static String GestorLloguersLite(Client c) {
		return c.informe();
	} 
	
}
