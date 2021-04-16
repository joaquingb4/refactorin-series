package refactorin;

import java.util.ArrayList;
import java.util.Date;

public class Lloguer {
	
	private Date data;
	private int dies;
	private Vehicle vehicle;
	
	public Lloguer(Date data, int dies, Vehicle vehicle) {
		this.data=data;
		this.dies=dies;
		this.vehicle=vehicle;
	}
	public Date getData() {
		return data;
	}
	public int getDies() {
		return dies;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
}
