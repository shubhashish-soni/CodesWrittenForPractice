import java.util.*;
class FrequencyCounter {
    public boolean validAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        Map<Character, Integer> frequencyCounter = new HashMap<>();
        for(char a: str1.toCharArray()){
            if(frequencyCounter.containsKey(a)){
                frequencyCounter.put(a, frequencyCounter.get(a)+1);
            } else {
                frequencyCounter.put(a, 1);
            }
        }
        for(char a : str2.toCharArray()){
            if(!frequencyCounter.containsKey(a)) return false;
            frequencyCounter.put(a, frequencyCounter.get(a)-1);
        }
        return true;
    }
}

class HelloWorld {
    public static void main(String[] args) {
        FrequencyCounter f = new FrequencyCounter();
        System.out.println(f.validAnagram("anagram","nagaram"));
    }
}
