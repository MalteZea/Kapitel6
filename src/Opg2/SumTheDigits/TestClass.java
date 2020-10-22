package Opg2.SumTheDigits;

import zunit.TestSuite;

public class TestClass extends TestSuite {
    public static void main(String[] args) {
        new TestClass().runTestSuite();
    }

    @Override
    public void testMethodList() {
        testSumOfThreeDigitsNumber();
    }
    public void testSumOfThreeDigitsNumber(){
        assertEquals(11,Calculation.sumDigits(452));
    }
}
