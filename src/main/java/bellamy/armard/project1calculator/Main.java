package bellamy.armard.project1calculator;
import java.util.*;

/**
 * Created by armardbellamy on 9/11/16.
 */
public class Main {

    public static void main(String[] args){
        Calculator calculator = new Calculator(0);
        Display display = new Display();
        display.welcomeMessage();
        display.runCalculator();
    }
}
