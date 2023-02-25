package LeetCode;

import java.util.HashMap;
import java.util.Map;

/*
    https://leetcode.com/problems/roman-to-integer/description/
 */
public class RomanToInteger {

    public int romanToInt(String s) {

        Map<Character,Integer> romanMap = new HashMap<>();

        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        String name = s;

        int sum = 0;
        int start = 0;
        while(start < name.length()-1){
            char ch1 = name.charAt(start);
            char ch2 = name.charAt(start+1);
            //System.out.println("Comparing : "+ch1 + " & "+ch2+" : Sum = "+sum);
            if(romanMap.get(ch1) >= romanMap.get(ch2)){
                sum += romanMap.get(ch1);
                start++;

            }else{
                sum+= romanMap.get(ch2) - romanMap.get(ch1);
                start+=2;
            }
        }

        if(start == name.length()-1){
            sum+= romanMap.get(name.charAt(start));
        }

        return sum;
    }
}
