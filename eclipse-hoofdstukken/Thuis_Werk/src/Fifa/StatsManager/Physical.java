package Fifa.StatsManager;

public class Physical {
	
	static int acceleration = 0;
	static int stamina = 0;
	static int strenght = 0;
	
	public static int getAcceleration() {
		return acceleration;
	}
	public static int getStamina() {
		return stamina;
	}
	public static int getStrenght() {
		return strenght;
	}
	public static final void setAcceleration(int acceleration) {
		Physical.acceleration = acceleration;
	}
	public static final void setStamina(int stamina) {
		Physical.stamina = stamina;
	}
	public static final void setStrenght(int strenght) {
		Physical.strenght = strenght;
	}
	
	

	

}
