/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ku.piii2019.worksheet3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author ku14009
 */
public class OldSchoolPowerCalc implements PowerCalc {

    @Override
    public List<Integer> getListOfIntegers(int start, int finish) {
        List<Integer> output = new ArrayList<>();
        for (int i = start; i <= finish; i++) {
            output.add(i);
        }
        return output;
    }

    @Override
    public void printThisList(List<Integer> thisList) {
        for (int n : thisList) {
            System.out.println(n);
        }
    }

    @Override
    public List<Integer> getEvenNumbers(List<Integer> inThisList) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<Integer> result = new ArrayList<>();
        for(Integer x : inThisList){
            if(x%2==0){
                result.add(x);
            }
        }
        System.out.println(result);
        return result;
    }

    @Override
    public List<Integer> getOddNumbers(List<Integer> inThisList) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<Integer> result = new ArrayList<>();
        for(Integer x : inThisList){
            if(x%2!=0){
                result.add(x);
            }
        }
        System.out.println(result);
        return result;
    }

    @Override
    public List<Integer> getNumbersBiggerThan(int thisNumber, List<Integer> fromThisList) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<Integer> result = new ArrayList<>();
        for(Integer x : fromThisList){
            if(x>thisNumber){
                result.add(x);
            }
        }
        System.out.println(result);
        return result;
    }

    @Override
    public boolean isPresent(int thisNumber, List<Integer> inThisList) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        boolean result = false;
        for(Integer x : inThisList){
            if(x==thisNumber){
                result = true;
            }
        }
        System.out.println(result);
        return result;
    }

    @Override
    public int getSum(List<Integer> inThisList) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int result = 0;
        for(Integer x : inThisList){
            result = result + x;
        }
        System.out.println(result);
        return result;
    }

    @Override
    public int getRange(List<Integer> inThisList) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int result = 0;
        int biggest = inThisList.get(0);
        int smallest = inThisList.get(0);
        for(Integer x : inThisList){
            if(x>biggest){
                biggest = x;
            }
            if(x<smallest){
                smallest = x;
            }
        }
        result = biggest-smallest;
        System.out.println(result);
        return result;
    }

    @Override
    public List<Integer> removeDuplicates(List<Integer> inThisList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Integer> getSortedList(List<Integer> usingThisList, boolean biggestFirst) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumOccurrences(int thisNumber, List<Integer> inThisList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Integer> addTwoLists(List<Integer> listA, List<Integer> listB) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<Integer, Integer> mapTheseLists(List<Integer> listOfKeys, List<Integer> listOfValues) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Integer> getRandomNumbers(int smallest, int biggest, int thisMany) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
