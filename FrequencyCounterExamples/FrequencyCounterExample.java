import java.lang.*;
import java.util.*;

public class FrequencyCounterExample {
	public boolean sameFrequencyOfNumbers(Integer num1, Integer num2){
		Map<Character, Integer> counterMap = new HashMap<>();
		for(char a : num1.toString().toCharArray()){
			if(counterMap.containsKey(a)){
				counterMap.put(a, counterMap.get(a)+1);
			} else {
				counterMap.put(a, 1);
			}
		}
		for(char a : num2.toString().toCharArray()){
			if(counterMap.containsKey(a)) counterMap.put(a, counterMap.get(a) -1);
			else return false;
			if(counterMap.get(a) == 0) counterMap.remove(a);
		}
		return true;
	}
	public static void main(String args[]){
		FrequencyCounterExample f = new FrequencyCounterExample();
		System.out.print(f.sameFrequencyOfNumbers(1234, 43231));
	}
}


