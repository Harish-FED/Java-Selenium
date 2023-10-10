package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {

	public void transportForm() {
		System.out.println("Types of Transports");
	}
	
	public static void main(String[] args) {
		Transport tr = new Transport();
		Road rd = new Road();
		Air ar = new Air();
		Water wr = new Water();
		
		tr.transportForm();
		//Road
		rd.cycle();
		rd.bike();
		rd.car();
		rd.bus();
		//Air
		ar.aeroPlane();
		ar.heliCopter();
		//Water
		wr.boat();
		wr.ship();
		
	}
}
