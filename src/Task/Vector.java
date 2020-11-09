package Task;

import Input.Input;

import java.util.Arrays;
import java.util.Scanner;

public class Vector {

    private int n, T;
    private int[] vectorC;
    private int[] vectorB;

    public Vector (){
        getInput();
    }

    private void getInput () {
        boolean check_n = false;
        while (!check_n) {
            this.n = Input.inputInteger("Input n:");
            if (n <= 12) {check_n = true;}
            else {System.out.println("Incorrect input. Try again");}
        }
        this.T = Input.inputInteger("Input T:");
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
