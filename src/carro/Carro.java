package carro;

import java.util.ArrayList;
import java.util.List;

public class Carro {
	
	List<Motor> lmotor = new ArrayList<Motor>();
	List<Roda> lroda = new ArrayList<Roda>();
	
	public void montar(Motor motor, Roda roda) {
		lmotor.add(motor);
		lroda.add(roda);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Motor motor : lmotor) {
			builder.append(motor.toString());
		}
		
		for (Roda roda : lroda) {
			builder.append(roda.toString());
		}
		
		return builder.toString();
	}
	
	
	
	
}
