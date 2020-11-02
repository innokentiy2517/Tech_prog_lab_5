package Task;

import Input.Input;

public class MonthNumber {
    private int n;

    public MonthNumber(){
        this.n = Input.inputInteger("Input month number");
    }

    public String outMonth(){
        switch (n){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "No such month";
        }
    }
}
