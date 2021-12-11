package Fifa.StatsManager;

public class Defence {
	static int marking = 0;
	static int slideTackle = 0;
	static int standTackle = 0;
	public static int getMarking() {
		return marking;
	}
	public static int getSlideTackle() {
		return slideTackle;
	}
	public static int getStandTackle() {
		return standTackle;
	}
	
	public static void setMarking(int marking) {
		Defence.marking = marking;
	}
	public static void setSlideTackle(int slideTackle) {
		Defence.slideTackle = slideTackle;
	}
	public static void setStandTackle(int standTackle) {
		Defence.standTackle = standTackle;
	}
	
	

}
