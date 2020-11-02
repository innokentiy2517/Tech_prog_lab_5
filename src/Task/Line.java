package Task;

import Input.Input;

public class Line {

    private double a,b,x,y;

    public Line (double x, double y){
        this.y = y;
        setA();
        this.x = x;
        setB();
    }

    private void setA(){
        this.a = Input.inputDouble("Input a");
    }

    private void setB() {
        this.b = Input.inputDouble("Input b");
    }


    //метод для уравнения с положительным b
    public String isCrossPos(){
        return (y == ((a * x) + b)) ? ("Принадлежит линии y=" + a + "x+" + b) : ("Не принадлежит линии y=" + a + "x+" + b);
    }

    //метод для уравнения с отрицательным b
    public String isCrossNeg(){
        return y == ((a * x) - b) ? "Принадлежит линии y=" + a + "x-" + b : "Не принадлежит линии y=" + a + "x-" + b;
    }

}
