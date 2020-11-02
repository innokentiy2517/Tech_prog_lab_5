package Task;

import Input.Input;

public class Task {

    /**
     * Известны координаты точки M(x,y).
     * Определить принадлежит ли эта точка одной из прямых
     * line1: y=a1x+b1;
     * line2: y=a2x-b2.
     */
    public void ifTask(){
        double x = Input.inputDouble("Введит X: ");
        double y = Input.inputDouble("Введите У: ");
        Line line1 = new Line(x,y);
        Line line2 = new Line(x,y);
        System.out.println(line1.isCrossPos());
        System.out.println(line2.isCrossNeg());
    }

    /**
     * Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 —февраль и т. д.).
     * <br>Вывести название соответствующего времени года («зима», «весна», «лето», «осень»).
     */
    public void switchTask() {
        MonthNumber monthNumber = new MonthNumber();
        System.out.println(monthNumber.outMonth());
    }

    /**
     * Из элементов целочисленного вектора С(n), n£12, кратных   заданному целому числу T, сформировать вектор В.
     */
    public void forTask() {
        Vector Vector = new Vector();
        Vector.initAndChangeVector();
        System.out.println(Vector.getVectorC());
        System.out.println(Vector.getVectorB());
    }

    /**
     * Найти массив сумм цифр цифровых слов.
     */
    public void stringTask() {
        stringAnalyser analyser = new stringAnalyser();
        analyser.performAnalyses();
        System.out.println(analyser.outputExtractedNumbers());
        System.out.println(analyser.outputSumOfDigits());
    }
}
