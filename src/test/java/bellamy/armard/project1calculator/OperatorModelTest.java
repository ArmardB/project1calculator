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
        operatorModel = new OperatorModel();
    }

    @Test
    public void addOperatorTest(){
        double expectedValue = 8.0;
        double actualValue = operatorModel.addOperator(4.0, 4.0);
        Assert.assertEquals("Should return 4", expectedValue, actualValue, .0001);

    }

    @Test
    public void subtractOperatorTest(){
        double expectedValue = 6;
        double actualValue = operatorModel.subtractOperator(4, 10);
        Assert.assertEquals("Should return 6", expectedValue, actualValue, .0001);
    }

    @Test
    public void multiplicationOperatorTest(){
        double expectedValue = 40;
        double actualValue = operatorModel.multiplicationOperator(10,4);
        Assert.assertEquals("Should return 40", expectedValue, actualValue, .0001);
    }

    @Test
    public void divisionOperatorTest(){
        double expectedValue = 5;
        double actualValue = operatorModel.divisionOperator(4, 20);
        Assert.assertEquals("Should return 5", expectedValue, actualValue, .0001);
    }

    @Test
    public void exponentOperatorTest(){
        double expectedValue = 100;
        double actualValue = operatorModel.exponentOperator(10,10);
        assertEquals("Should return 100", expectedValue, actualValue, .0001);

    }

    @Test
    public void squaredOperatorTest(){
        double expectedValue = 16;
        double actualValue = operatorModel.squaredOperator(4.0);
        assertEquals("Should return 16", expectedValue, actualValue, .0001);
    }

    @Test
    public void squareRootOperatorTest(){
        double expectedValue = 10;
        double actualValue = operatorModel.squareRootOperator(100);
        assertEquals("Should return 10", expectedValue, actualValue, .0001);
    }

    @Test
    public void sineOperatorTest(){
        double expectedValue = -0.27941549819;
        double actualValue = operatorModel.sineOperator(6);
        assertEquals("Should return 0.104528", expectedValue, actualValue, .05);
    }

    @Test
    public void cosineOperatorTest(){
        double expectedValue = -0.44807361612;
        double actualValue = operatorModel.cosineOperator(90);
        assertEquals("Should return -0.44807361612", expectedValue, actualValue, .05);
    }

    @Test
    public void tangentOperatorTest(){
        double expectedValue = 1.61977519054;
        double actualValue = operatorModel.tangentOperator(45);
        assertEquals("Should return 1.61977519054", expectedValue, actualValue, .05);
    }

    @Test
    public void inverseSineOperatorTest(){
        double expectedValue =  0.43896189;
        double actualValue = operatorModel.inverseSineOperator(.425);
        assertEquals("Should return 25.15066341", expectedValue, actualValue, .05);
    }

    @Test
    public void inverseCosineOperatorTest(){
        operatorModel.inverseCosineOperator(90);
        double expectedValue = 1.13183444;
        double actualValue = operatorModel.inverseCosineOperator(.425);
        assertEquals("Should return 64.84933659", expectedValue, actualValue, .05);
    }

    @Test
    public void inverseTangentOperatorTest(){
        double expectedValue = 0.40187065;
        double actualValue = operatorModel.inverseTangentOperator(.425);
        assertEquals("Should return 23.02549201", expectedValue, actualValue, .05);
    }

    @Test
    public void logOperatorTest(){
        double expectedValue = -0.3716110699;
        double actualValue = operatorModel.logOperator(.425);
        assertEquals("Should return 1", expectedValue, actualValue, .0001);
    }

    @Test
    public void inverseLogOperatorTest(){
        double expectedValue = 1.28402541668;
        double actualValue = operatorModel.inverseLogOperator(.25);
        assertEquals("Should return 0.4342944819", expectedValue, actualValue, .001);
    }
//
    @Test
    public void naturalLogOperatorTest(){
        double expectedValue = 3.806662489;
        double actualValue = operatorModel.naturalLogOperator(45);
        assertEquals("Should return 4.60517018599", expectedValue, actualValue, .5);
    }

    @Test
    public void inverseNaturalLogTest(){
        double expectedValue = 1;
        double actualValue = operatorModel.inverseNaturalLog(0.0);
        assertEquals("Should return ###", expectedValue, actualValue, .001);
    }

    @Test
    public void factorial(){
        double expectedValue = 120;
        double actualValue = operatorModel.factorial(5);
        assertEquals("Should return 120", expectedValue, actualValue, .001);
    }

    @Test
    public void absoluteValueTest(){
        double expectedValue = 10;
        double actualValue = operatorModel.absoluteValueOperator(-10);
        assertEquals("Should return 10", expectedValue, actualValue, .001);
    }

    @Test
    public void cubeRootOperatorTest(){
        double expectedValue = 2.154435;
        double actualValue =  operatorModel.cubeRootOperator(10);
        assertEquals("Should return 2.154435", expectedValue, actualValue, .001);
    }

    @Test
    public void switchSign(){
        double expectedValue = 1;
        double actualValue = operatorModel.switchSign(-1);
    }

}
