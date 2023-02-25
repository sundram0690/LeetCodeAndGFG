package LeetCode;

import java.util.*;

public class SortArrayByIncFrequency {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int num : nums){
            if(map.containsKey(num)){
                int val = map.get(num);
                map.put(num, val+1);
            }else{
                map.put(num,1);
            }
        }



        List<Integer> list = new ArrayList<Integer>(map.keySet());

        Collections.sort(list, (a, b) -> {
            if(map.get(a) == map.get(b)){
                return b-a;
            }else{
                return map.get(a) - map.get(b);
            }
        });

        System.out.println(Arrays.toString(list.toArray()));

        int[] result = new int[nums.length];

        int index = 0;
        for(int num : list){
            for(int i=0;i<map.get(num);i++){
                System.out.println(index +" -> "+num);
                result[index++] = num;
            }
        }

        return result;
    }
}
