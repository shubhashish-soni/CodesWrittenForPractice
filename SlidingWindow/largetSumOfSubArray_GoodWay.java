import java.lang.*;
import java.util.*;
class SlidingWindow {
    public int largestSum(List<Integer> list, Integer sizeOfSubArray){
        Integer maxSum = Integer.MIN_VALUE;
        Integer temp = 0;
        for(int i = 0; i<sizeOfSubArray; i++) {
            temp += list.get(i);
        }
        for(int i = sizeOfSubArray; i < list.size(); i++){
            temp = temp + list.get(i) - list.get(i-sizeOfSubArray);
            maxSum = Math.max(temp, maxSum);
        }
        return maxSum;
    }
}

class Main {
    public static void main(String args[]){
        SlidingWindow s = new SlidingWindow();
        List<Integer> list = List.of(1,2,3,4,122,2,4,2,11,12);
        System.out.println(s.largestSum(list,new Integer(4)));
    }
}
