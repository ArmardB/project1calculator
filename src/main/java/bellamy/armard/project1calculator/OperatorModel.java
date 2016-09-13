package bellamy.armard.project1calculator;

/**
 * Created by armardbellamy on 9/10/16.
 */
public class OperatorModel {

    public double addOperator(double state, double number){
        return state += number;
    }

    public double subtractOperator(double state, double number){
        return state -= number;
    }

    public double multiplicationOperator(double state, double number){
        return state *= number;
    }

    public double divisionOperator(double state, double number){
        if (number == 0){
            System.out.println("ERR: CANNOT DIVIDE BY 0");
        }else{
            return state /= number;
        }
        return 0;
    }

    public double squaredOperator (double base){
        return Math.pow(base, 2);
    }

    public double exponentOperator(double base, double exponent){
        return  base * exponent;
    }

    public double squareRootOperator(double number){
        return  Math.sqrt(number);
    }

    public double sineOperator(double number){
        return Math.sin(number);
    }

    public double cosineOperator(double number){
        return Math.cos(number);
    }

    public double tangentOperator(double number){
        return Math.tan(number);
    }

    public double inverseSineOperator(double number){
        return  Math.asin(number);
    }

    public double inverseCosineOperator(double number){
        return Math.acos(number);
    }

    public double inverseTangentOperator(double number){
        return Math.atan(number);
    }

    public double logOperator(double number){
        return Math.log10(number);
    }

    public double inverseLogOperator(double number){
        return Math.exp(number);
    }

    public double naturalLogOperator(double number){
        return Math.log(number);
    }

    public double inverseNaturalLog(double number){
        return Math.pow(Math.E, number);
   }

    public double factorial(double number){
        if (number == 1){
            return 1;
        }
        return number * factorial(number - 1);
    }

    public double absoluteValueOperator(double number){
        return Math.abs(number);
    }

    public double cubeRootOperator(double number){
        return Math.cbrt(number);
    }

    public double switchSign(double number){
        return number *= 1;
    }
}
