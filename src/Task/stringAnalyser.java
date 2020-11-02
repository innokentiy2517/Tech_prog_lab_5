package Task;

import Input.Input;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringAnalyser {

    String analysedString = "";
    ArrayList<Integer> extractedNumbers = new ArrayList<>();
    ArrayList<Integer> sumOfDigits = new ArrayList<>();

    public stringAnalyser() {
        setAnalysedString();
    }

    //String test = "123,45,78,456,156,789,12,3489,123,7,9,45,1,5,777111.";
    private void setAnalysedString() {
        this.analysedString = Input.inputString("Input string");
    }

    public void extractNumber(){
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(analysedString);
        while (matcher.find()){
            extractedNumbers.add(Integer.parseInt(matcher.group()));
        }
    }

    public void analyseExtractedNumbers(){
        for (int number: extractedNumbers) {
            int sum = 0;
            while (number != 0){
                sum += (number % 10);
                number /= 10;
            }
            sumOfDigits.add(sum);
        }
    }

    public String outputSumOfDigits(){
        return sumOfDigits.toString();
    }

    public String outputExtractedNumbers(){
        return extractedNumbers.toString();
    }

    public void performAnalyses(){
        this.extractNumber();
        this.analyseExtractedNumbers();
    }
}
