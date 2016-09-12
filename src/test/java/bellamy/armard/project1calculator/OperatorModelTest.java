package bellamy.armard.project1calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by armardbellamy on 9/11/16.
 */
public class OperatorModelTest {

    OperatorModel operatorModel;

    @Before
    public void initialize(){
        operatorModel = new OperatorModel(10);
    }

    @Test
    public void addOperatorTest(){
        double expectedValue = 8.0;
        double actualValue = operatorModel.addOperator(4.0);
        Assert.assertEquals("Should return 4", expectedValue, actualValue, .0001);

    }

    @Test
    public void subtractOperatorTest(){
        operatorModel.subtractOperator(4);
        double expectedValue = 6;
        double actualValue = operatorModel.getCalculatorState();
        Assert.assertEquals("Should return 6", expectedValue, actualValue, .0001);
    }

    @Test
    public void multiplicationOperatorTest(){
        operatorModel.multiplicationOperator(4);
        double expectedValue = 40;
        double actualValue = operatorModel.getCalculatorState();
        Assert.assertEquals("Should return 40", expectedValue, actualValue, .0001);
    }

    @Test
    public void divisionOperatorTest(){
        operatorModel.divisionOperator(2);
        double expectedValue = 5;
        double actualValue = operatorModel.getCalculatorState();
        Assert.assertEquals("Should return 5", expectedValue, actualValue, .0001);
    }

    @Test
    public void exponentOperatorTest(){
        operatorModel.exponentOperator(operatorModel.getCalculatorState(), 3);
        double expectedValue = 1000;
        double actualValue = operatorModel.getCalculatorState();
        assertEquals("Should return 1000", expectedValue, actualValue, .0001);

    }

    @Test
    public void squaredOperatorTest(){
        operatorModel.squaredOperator(4);
        double expectedValue = 16;
        double actualValue = operatorModel.getCalculatorState();
        assertEquals("Should return 16", expectedValue, actualValue, .0001);
    }

    @Test
    public void squareRootOperatorTest(){
        operatorModel.squareRootOperator(100);
        double expetedValue = 10;
        double actualValue = operatorModel.getCalculatorState();
        assertEquals("Should return 10", expetedValue, actualValue, .0001);
    }

    @Test
    public void sineOperatorTest(){
        operatorModel.sineOperator(6);
        double expectedValue = -0.27941549819;
        double actualValue = operatorModel.getCalculatorState();
        assertEquals("Should return 0.104528", expectedValue, actualValue, .05);
    }

    @Test
    public void cosineOperatorTest(){
        operatorModel.cosineOperator(90);
        double expectedValue = -0.44807361612;
        double actualValue = operatorModel.getCalculatorState();
        assertEquals("Should return -0.44807361612", expectedValue, actualValue, .05);
    }

    @Test
    public void tangentOperatorTest(){
        operatorModel.tangentOperator(45);
        double expectedValue = 1.61977519054;
        double actualValue = operatorModel.getCalculatorState();
        assertEquals("Should return 1.61977519054", expectedValue, actualValue, .05);
    }

    @Test
    public void inverseSineOperatorTest(){
        operatorModel.inverseSineOperator(90);
        double expectedValue = 1.11857240716;
        double actualValue = operatorModel.getCalculatorState();
        assertEquals("Should return 1.11857240716", expectedValue, actualValue, .05);
    }

    @Test
    public void inverseCosineOperatorTest(){
        operatorModel.inverseCosineOperator(90);
        double expectedValue = -2.23177612786;
        double actualValue = operatorModel.getCalculatorState();
        assertEquals("Should return -2.23177612786", expectedValue, actualValue, .05);
    }

    @Test
    public void inverseTangentOperatorTest(){
        operatorModel.inverseTangentOperator(90);
        double expectedValue = -0.50120278338;
        double actualValue = operatorModel.getCalculatorState();
        assertEquals("Should return -0.50120278338", expectedValue, actualValue, .05);
    }

    @Test
    public void logOperatorTest(){
        operatorModel.logOperator(10);
        double expectedValue = 2.30258509299 ;
        double actualValue = operatorModel.getCalculatorState();
        assertEquals("Should return 1", expectedValue, actualValue, .0001);
    }

//    @Test
//    public void inverseLogOperatorTest(){
//        operatorModel.inverseLogOperator(10);
//        double expectedValue = 0.4342944819;
//        double actualValue = operatorModel.getCalculatorState();
//        assertEquals("Should return 0.4342944819", expectedValue, actualValue, .001);
//
//    }

    @Test
    public void naturalLogOperatorTest(){
        operatorModel.naturalLogOperator(100);
        double expectedValue = 4.60517018599;
        double actualValue = operatorModel.getCalculatorState();
        assertEquals("Should return 4.60517018599", expectedValue, actualValue, .5);
    }

//    @Test
//    public void inverseNaturalLogTest(){
//        operatorModel.inverseLogOperator(100);
//        double expectedValue = 0;
//        double actualValue = operatorModel.getCalculatorState();
//        assertEquals("Should return ###", expectedValue, actualValue, .001);
//    }

    @Test
    public void factorial(){
        double expectedValue = 120;
        double actualValue = operatorModel.factorial(5);
        assertEquals("Should return 120", expectedValue, actualValue, .001);
    }

    @Test
    public void absoluteValueTest(){
        operatorModel.absoluteValueOperator(-10);
        double expectedValue = 10;
        double actualValue = operatorModel.getCalculatorState();
        assertEquals("Should return 10", expectedValue, actualValue, .001);
    }

    @Test
    public void cubeRootOperatorTest(){
        operatorModel.cubeRootOperator(10);
        double expectedValue = 2.154435;
        double actualValue = operatorModel.getCalculatorState();
        assertEquals("Should return 2.154435", expectedValue, actualValue, .001);
    }

}
