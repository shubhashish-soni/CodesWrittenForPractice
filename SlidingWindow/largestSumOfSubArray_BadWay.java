// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.lang.*;
import java.util.*;
class SlidingWindow {
    public int largestSum(List<Integer> list, Integer sizeOfSubArray){
        Integer maxSum = Integer.MIN_VALUE;
        Integer temp;
        for(int i = 0; i<list.size()-sizeOfSubArray+1; i++){
            temp = 0;
            for(int j = 0; j<sizeOfSubArray; j++){
                temp+=list.get(i+j);
            }
            maxSum = Math.max(temp,maxSum);
        }
        return maxSum;
    }
}

class Main {
    public static void main(String args[]){
        SlidingWindow s = new SlidingWindow();
        List<Integer> list = List.of(1,2,3,4,3,2,4,2,11,12);
        System.out.println(s.largestSum(list,new Integer(4)));
    }
}
