package javaoops;

public class Carr {
	private boolean engine;
	private int speed;
	private int fuellevel;
 
	public void setEngine(boolean eng ) {
		engine= eng;
	}
	 void setSpeed( int speed) {
		this.speed= speed;
	}
	 void setFuelLevel( int fuellevel) {
		this.fuellevel = fuellevel;
	}
	
	public boolean getEngine() {
		return engine;
	}
	public int getSpeed() {
		return speed;
	}
	public int getFuelLevel() {
		return fuellevel;
	}

	




 
	public static void main(String[] args) {
		Carr c = new Carr();
		
		c.setEngine(true);
		c.setSpeed(50);
		c.setFuelLevel(70);
		
		System.out.println("Engine status :" + c.getEngine());
		System.out.println("Speed" + c.getSpeed());
		System.out.println("FuelLevel" + c.getFuelLevel());
	}
}