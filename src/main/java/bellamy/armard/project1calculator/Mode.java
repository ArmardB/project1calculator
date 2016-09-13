package bellamy.armard.project1calculator;

import java.util.Scanner;

/**
 * Created by armardbellamy on 9/13/16.
 */
public class Mode {

    public enum DisplayMode {BINARY, OCTAL, HEXADECIMAL, DECIMAL};
    private DisplayMode displayMode = DisplayMode.DECIMAL;
    Scanner scanner = new Scanner(System.in);

    public DisplayMode getDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(DisplayMode displayMode){
        this.displayMode = displayMode;
    }


    public void displayModeMenu(){
        System.out.println();
        System.out.println("*****************************************");
        System.out.println("[0]  Switch Mode");
        System.out.println("[1]  BINARY");
        System.out.println("[2]  DECIMAL");
        System.out.println("[3]  HEXADECIMAL");
        System.out.println("[4]  OCTAL");
        toggleUserDisplayMode();
    }

    public void toggleUserDisplayMode(){
        System.out.println("*****************************************");
        System.out.print("Enter option number: ");
        int userChoice = scanner.nextInt();

        switch(userChoice){
            case 1:
                setDisplayMode(DisplayMode.BINARY);
                break;
            case 2:
                setDisplayMode(DisplayMode.DECIMAL);
                break;
            case 3:
                setDisplayMode(DisplayMode.HEXADECIMAL);
                break;
            case 4:
                setDisplayMode(DisplayMode.OCTAL);
                break;
        }
    }

    public void autoToggleDisplayMode(){
        DisplayMode displayMode = getDisplayMode();
        switch(displayMode){
            case BINARY:
                setDisplayMode(DisplayMode.OCTAL);
        }
    }

    public String displayModeConversions(double number){
        switch (getDisplayMode()){
            case BINARY: return toBinary(number);
            case HEXADECIMAL: return toHexadecimal(number);
            case OCTAL: return toOctal(number);
            case DECIMAL: return ""+number;
        }
        return "";
    }

    public String toBinary(double number){
        Integer conversion = (int) number;
        return Integer.toBinaryString(conversion);
    }

    public String toHexadecimal(double number){
        Integer conversion = (int) number;
        return Integer.toHexString(conversion);
    }

    public String toOctal(double number){
        Integer conversion = (int) number;
        return Integer.toOctalString(conversion);
    }
}
