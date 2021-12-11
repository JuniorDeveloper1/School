package Fifa.StatsManager;

public class TotalSkills {
	
	//Alle class getters in een gemiddelde gezet.

	
private static int defTot;
private static int balTot;
private static int pasTot;
private static int phyTot;
private static int shootTot;

public static int ballSkills() { return  balTot = (BallSkills.getBallcontrol() + BallSkills.getDribbeling()) / 2;}

 public static int defence() { return defTot = (Defence.getMarking() + Defence.getSlideTackle() + Defence.getStandTackle())  / 3; }
 
 public static int passing() { return pasTot = (Passing.getLongPass() + Passing.getPassing() + Passing.getShortPass() ) / 3;}
 
 public static int physical() { return phyTot = (Physical.getAcceleration() + Physical.getStamina() + Physical.getStrenght()) / 3;}
 
 public static  int shooting () {   return shootTot = (Shooting.getFinishing() + Shooting.getHeading() + Shooting.getShotPower()) /3; }
 
 
 
 
 
}
