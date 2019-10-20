/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ku.piii2019.worksheet3;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author joshw
 */
public class BenchmarkTest {

    
    public static void main(String[] args) {
        PowerCalc[] both = new PowerCalc[] {new Java8PowerCalc(), new OldSchoolPowerCalc()};
        
        for(PowerCalc b : both){
            long start = System.nanoTime();
            for(int i=0;i<100000;i++){
                b.getRandomNumbers(1,100,10000);
            }
            long end = System.nanoTime();
            long result = TimeUnit.NANOSECONDS.toSeconds(end - start);
            
            System.out.println(b.toString() + " " + result + " seconds");
        }
    }
    
}
