/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ku.piii2019.worksheet3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author James
 */
@Ignore
@RunWith(Parameterized.class)
public class TesterForQuestions1and2 {

    @Parameterized.Parameters
    public static Collection<Object[]> instancesToTest() {
        
        Collection<Object[]> listOfInstances = new ArrayList<>();
        // for Question 1:
        listOfInstances.add(new Object[]{new OldSchoolPowerCalc()});
        // for Question 2: 
//        listOfInstances.add(new Object[]{new Java8PowerCalc()});
        
        return listOfInstances;
    }
    
    PowerCalc instance = null;
          
    public TesterForQuestions1and2(PowerCalc testThisOneNext) {
       instance =  testThisOneNext;
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getListOfIntegers method, of classes implementing the PowerCalc interface
     */
    @Test
    public void testGetListOfIntegers() {
        System.out.println("getListOfIntegers");
        int start = 5;
        int finish = 9;
        List<Integer> expResult = Arrays.asList(5,6,7,8,9);
        List<Integer> result = instance.getListOfIntegers(start, finish);
        assertEquals(expResult, result);
    }

    /**
     * Test of printThisList method, of classes implementing the PowerCalc interface
     */
    @Test
    public void testPrintThisList() {
        System.out.println("printThisList");
        List<Integer> thisList = Arrays.asList(5,6,7,8,9);

        instance.printThisList(thisList);
        
        // to test this we can use the System.setOut() method
        // contributions welcome! 
        
    }

    /**
     * Test of getEvenNumbers method, of classes implementing the PowerCalc interface
     */
    @Test
    public void testGetEvenNumbers() {
        System.out.println("getEvenNumbers");
        List<Integer> inThisList = Arrays.asList(5,6,7,8,9);

        List<Integer> expResult = Arrays.asList(6,8);
        List<Integer> result = instance.getEvenNumbers(inThisList);
        assertEquals(expResult, result);

        List<Integer> checkOriginalNotChanged = Arrays.asList(5,6,7,8,9);
        assertEquals(checkOriginalNotChanged, inThisList);

    }

    /**
     * Test of getOddNumbers method, of classes implementing the PowerCalc interface
     */
    @Test
    public void testGetOddNumbers() {
        System.out.println("getOddNumbers");
        List<Integer> inThisList = Arrays.asList(5,6,7,8,9);

        List<Integer> expResult = Arrays.asList(5,7,9);
        List<Integer> result = instance.getOddNumbers(inThisList);
        assertEquals(expResult, result);

        List<Integer> checkOriginalNotChanged = Arrays.asList(5,6,7,8,9);
        assertEquals(checkOriginalNotChanged, inThisList);
    }

    /**
     * Test of getNumbersBiggerThan method, of classes implementing the PowerCalc interface
     */
    @Test
    public void testGetNumbersBiggerThan() {
        System.out.println("getNumbersBiggerThan");
        int thisNumber = 7;
        List<Integer> fromThisList = Arrays.asList(5,6,7,8,9);

        List<Integer> expResult = Arrays.asList(8,9);
        List<Integer> result = instance.getNumbersBiggerThan(thisNumber, fromThisList);
        assertEquals(expResult, result);

        List<Integer> checkOriginalNotChanged = Arrays.asList(5,6,7,8,9);
        assertEquals(checkOriginalNotChanged, fromThisList);

    }

    /**
     * Test of getSum method, of classes implementing the PowerCalc interface
     */
    @Test
    public void testGetSum() {
        System.out.println("getSum");
        List<Integer> inThisList = Arrays.asList(5,6,7,8,9);

        int expResult = 35;
        int result = instance.getSum(inThisList);
        assertEquals(expResult, result);

        List<Integer> checkOriginalNotChanged = Arrays.asList(5,6,7,8,9);
        assertEquals(checkOriginalNotChanged, inThisList);

    }

    /**
     * Test of getRange method, of classes implementing the PowerCalc interface
     */
    @Test
    public void testGetRange() {
        System.out.println("getRange");
        List<Integer> inThisList = Arrays.asList(5,6,7,8,9);

        int expResult = 4;
        int result = instance.getRange(inThisList);
        assertEquals(expResult, result);

        List<Integer> checkOriginalNotChanged = Arrays.asList(5,6,7,8,9);
        assertEquals(checkOriginalNotChanged, inThisList);

    }

    /**
     * Test of isPresent method, of classes implementing the PowerCalc interface
     */
    @Test
    public void testIsPresent() {
        System.out.println("isPresent");
        List<Integer> inThisList = Arrays.asList(5,6,7,8,9);
        int thisNumber = 0;
        boolean expResult = false;
        boolean result = instance.isPresent(thisNumber, inThisList);
        assertEquals(expResult, result);
        thisNumber = 9;
        expResult = true;
        result = instance.isPresent(thisNumber, inThisList);
        assertEquals(expResult, result);

        List<Integer> checkOriginalNotChanged = Arrays.asList(5,6,7,8,9);
        assertEquals(checkOriginalNotChanged, inThisList);

    }
}
