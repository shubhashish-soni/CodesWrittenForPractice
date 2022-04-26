// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.Map.*;
class FrequencyCounter {
    public Character nonRepeatableCharacter(String str1){
       if(str1.length() == 1){
           return str1.charAt(0);
       }
       str1 = str1.toLowerCase();
       Map<Character, Integer> frequencyCounter = new LinkedHashMap<>();
       for(char a : str1.toCharArray()){
           if(frequencyCounter.containsKey(a)){
               frequencyCounter.put(a, frequencyCounter.get(a)+1);
           } else {
               frequencyCounter.put(a, 1);
           }
       }
       for(Entry<Character,Integer> e : frequencyCounter.entrySet()){
           if(e.getValue() == 1){
               return e.getKey();
           }
       }
       return null;
    }
}

class HelloWorld {
    public static void main(String[] args) {
        FrequencyCounter f = new FrequencyCounter();
        System.out.println(f.nonRepeatableCharacter("This is something we are excited"));
    }
}
