/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ku.piii2019.worksheet3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author ku14009
 */
public class Java8PowerCalc implements PowerCalc{
    
    @Override
    public List<Integer> getListOfIntegers(int start, int finish)
    {
        Stream<Integer> s = IntStream.range(start, finish + 1).boxed();
        
        return s.collect(Collectors.toList());
    }

    @Override
    public void printThisList(List<Integer> thisList) {
        thisList.forEach(item-> System.out.println(item));
    }

    @Override
    public List<Integer> getEvenNumbers(List<Integer> inThisList) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Stream<Integer> s = inThisList.stream().filter(n -> n%2==0);
        return s.collect(Collectors.toList());
    }

    @Override
    public List<Integer> getOddNumbers(List<Integer> inThisList) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Stream<Integer> s = inThisList.stream().filter(n -> n%2!=0);
        return s.collect(Collectors.toList());
    }

    @Override
    public List<Integer> getNumbersBiggerThan(int thisNumber, List<Integer> fromThisList) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Stream<Integer> s = fromThisList.stream().filter(n -> n>thisNumber);
        return s.collect(Collectors.toList());
    }

    @Override
    public boolean isPresent(int thisNumber, List<Integer> inThisList) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        boolean result = inThisList.stream().anyMatch(n ->n==thisNumber);
        return result;
    }

    @Override
    public int getSum(List<Integer> inThisList) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int result = inThisList.stream().reduce(0,Integer::sum);
        return result;
    }

    @Override
    public int getRange(List<Integer> inThisList) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int max = inThisList.stream().max(Comparator.naturalOrder()).get();
        int min = inThisList.stream().min(Comparator.naturalOrder()).get();
        return max-min;
        
    }

    @Override
    public List<Integer> removeDuplicates(List<Integer> inThisList) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<Integer> result = inThisList.stream().distinct().collect(Collectors.toList());
        return result;
    }

    @Override
    public List<Integer> getSortedList(List<Integer> usingThisList, boolean biggestFirst) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<Integer> result = new ArrayList<>();
        if(biggestFirst==true){
            result = usingThisList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        }else if(biggestFirst==false){
            result = usingThisList.stream().sorted().collect(Collectors.toList());
        }
        return result;
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
