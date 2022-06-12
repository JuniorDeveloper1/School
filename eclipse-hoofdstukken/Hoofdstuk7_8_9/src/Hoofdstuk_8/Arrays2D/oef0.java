package Hoofdstuk_8.Arrays2D;

public class oef0 {
	public static void main(String[] args) {
        String[][] adressen = new String [4][3];
        adressen [0][0] = "peters";
        adressen [0][1] = "pol";
        adressen [0][2] = "brugge";
        adressen [1][0] = "Janssens";
        adressen [1][1] = "sofie";
        adressen [1][2] = "oostkamp";
        adressen [2][0] = "Vandenberghe";
        adressen [2][1] = "jan";
        adressen [2][2] = "Blankenberghe";
        adressen [3][0] = "willems";
        adressen [3][1] = "Elien";
        adressen [3][2] = "kortrijk";

        for(int i = 0 ; i<adressen.length ; i++) {
            for(int j = 0 ; j<adressen[0].length ; j++) {
            	
            
                System.out.print(adressen[i][j]+ " ");
                
              
            }

        System.out.println();
        }


    }

}
		


	


