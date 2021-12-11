package Fifa.StatsManager;

public class Passing {
	static int passing = 0;
	static int shortPass = 0;
	static int longPass = 0;
	public static int getPassing() {
		return passing;
	}
	public static int getShortPass() {
		return shortPass;
	}
	public static int getLongPass() {
		return longPass;
	}
	
	
	public static void setPassing(int passing) {
		Passing.passing = passing;
	}
	public static void setShortPass(int shortPass) {
		Passing.shortPass = shortPass;
	}
	public static void setLongPass(int longPass) {
		Passing.longPass = longPass;
	}
	
	

}
