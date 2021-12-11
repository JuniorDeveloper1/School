package Fifa.StatsManager;

public class Shooting {
	
	static int heading = 0;
	static int shotPower = 0;
	static int finishing = 0;
	
	public static int getHeading() {
		return heading;
	}
	public static int getShotPower() {
		return shotPower;
	}
	public static int getFinishing() {
		return finishing;
	}
	
	public static final void setHeading(int heading) {
		Shooting.heading = heading;
	}
	public static final void setShotPower(int shotPower) {
		Shooting.shotPower = shotPower;
	}
	public static final void setFinishing(int finishing) {
		Shooting.finishing = finishing;
	}
	
	

	

}
