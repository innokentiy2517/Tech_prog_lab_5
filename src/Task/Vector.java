package Task;

import java.util.Arrays;
import java.util.Scanner;

public class Vector {

    public Vector (){
        getInput();
    }

    private int n, T;
    private int[] vectorC;
    private int[] vectorB;

    private void getInput () {
        Scanner scan = new Scanner(System.in);
        boolean check_n = false;
        while (!check_n) {
            System.out.println("Input n:");
            this.n = scan.nextInt();
            if (n <= 12) {check_n = true;}
            else {System.out.println("Incorrect input. Try again");}
        }
        System.out.println("Input T:");
        this.T = scan.nextInt();
        scan.close();
    }

    public void initAndChangeVector (){
        vectorC = new int[n];
        int bCounter = 0;

        for (int i = 0; i < n; i++) {
            vectorC[i] = (int) (Math.random()*10);
            if ((vectorC[i] % T) == 0) {
                bCounter++;
            }
        }

        vectorB = new int[bCounter];
        int bIndex = 0;

        for (int i = 0; i < n; i++){
            if (vectorC[i] % T == 0 ){
                vectorB[bIndex] = vectorC[i];
                bIndex++;
            }
        }
    }

    public String getVectorC(){
        return Arrays.toString(vectorC);
    }

    public String getVectorB(){
        return Arrays.toString(vectorB);
    }
}
