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
public class TesterForQuestions3and4 {

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
          
    public TesterForQuestions3and4(PowerCalc testThisOneNext) {
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
     * Test of getListOfIntegers method, of class PowerCalc.
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
     * Test of printThisList method, of class PowerCalc.
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
     * Test of getRandomNumbers method, of class PowerCalc.
     */
    @Test
    public void testGetRandomNumbers() {
        System.out.println("getRandomNumbers");
        int smallest = -10;
        int biggest = -5;
        int thisMany = 100000;

        float expMean = (smallest+biggest)/2.0f;
        List<Integer> rndNum = instance.getRandomNumbers(smallest, biggest, thisMany);
        float mean = rndNum.stream().mapToInt(i -> i.intValue()).sum()/(float)thisMany;

        assertTrue(Math.abs((expMean-mean)/mean)<0.1f);
        assertEquals(rndNum.size(), thisMany);
        
    }

    /**
     * Test of removeDuplicates method, of class PowerCalc.
     */
    @Test
    public void testRemoveDuplicates() {
        System.out.println("removeDuplicates");
        List<Integer> inThisList = Arrays.asList(5,5,7,6,5,7);

        List<Integer> expResult = Arrays.asList(5,7,6);
        List<Integer> result = instance.removeDuplicates(inThisList);
        assertEquals(expResult, result);

        List<Integer> checkOriginalNotChanged = Arrays.asList(5,5,7,6,5,7);
        assertEquals(checkOriginalNotChanged, inThisList);

    }

    /**
     * Test of getSortedList method, of class PowerCalc.
     */
    @Test
    public void testGetSortedList() {
        System.out.println("getSortedList");
        List<Integer> usingThisList = Arrays.asList(5,6,7,4,3);
        List<Integer> checkOriginalNotChanged = Arrays.asList(5,6,7,4,3);

        boolean biggestFirst = false;
        List<Integer> expResult = Arrays.asList(3,4,5,6,7);
        List<Integer> result = instance.getSortedList(usingThisList, biggestFirst);
        assertEquals(expResult, result);
        assertEquals(checkOriginalNotChanged, usingThisList);

        biggestFirst = true;
        expResult = Arrays.asList(7,6,5,4,3);
        result = instance.getSortedList(usingThisList, biggestFirst);
        assertEquals(expResult, result);
        assertEquals(checkOriginalNotChanged, usingThisList);
    }

    /**
     * Test of getNumOccurrences method, of class PowerCalc.
     */
    @Test
    public void testGetNumOccurrences() {
        System.out.println("getNumOccurrences");
        List<Integer> inThisList = Arrays.asList(7,4,7,6,7);
        int thisNumber = 7;
        int expResult = 3;
        int result = instance.getNumOccurrences(thisNumber, inThisList);
        assertEquals(expResult, result);

        thisNumber = 8;
        expResult = 0;
        result = instance.getNumOccurrences(thisNumber, inThisList);
        assertEquals(expResult, result);

        List<Integer> checkOriginalNotChanged = Arrays.asList(7,4,7,6,7);
        assertEquals(checkOriginalNotChanged, inThisList);

    }

    /**
     * Test of addTwoLists method, of class PowerCalc.
     */
    @Test
    public void testAddTwoLists() {
        System.out.println("addTwoLists");
        List<Integer> listA = Arrays.asList(101,102,103,104,105);
        List<Integer> listB = Arrays.asList(1,2,3,4,5);
        List<Integer> emptyList = new ArrayList<>();

        List<Integer> expResult = Arrays.asList(102,104,106,108,110);
        List<Integer> result = instance.addTwoLists(listA, listB);
        assertEquals(expResult, result);

        result = instance.addTwoLists(listA, emptyList);
        assertEquals(listA, result);
        
        result = instance.addTwoLists(emptyList, listB);
        assertEquals(listB, result);

        List<Integer> checkListANotChanged = Arrays.asList(101,102,103,104,105);
        assertEquals(checkListANotChanged, listA);
        
        List<Integer> checkListBNotChanged = Arrays.asList(1,2,3,4,5);
        assertEquals(checkListBNotChanged, listB);
               
    }

    /**
     * Test of mapTheseLists method, of class PowerCalc.
     */
    @Test
    public void testMapTheseLists() {
        System.out.println("mapTheseLists");
        List<Integer> listOfKeys = Arrays.asList(101,102,103,104,105);;
        List<Integer> listOfValues = Arrays.asList(1,2,3,4,5);

        Map<Integer, Integer> expResult = new HashMap()
        {{
            put(101, 1);
            put(102, 2);
            put(103, 3);
            put(104, 4);
            put(105, 5);
        }};
        Map<Integer, Integer> result = instance.mapTheseLists(listOfKeys, listOfValues);
        assertEquals(expResult, result);
        
        
    }
}
