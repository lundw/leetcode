//Made by Will Lund
import java.util.HashMap;

public class RomanToInt {
    public int romanToInt(String s){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int result = 0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        //exit right away with the value if only 1 roman numeral in the string
        if(s.length() == 1){
            return map.get(s.charAt(0));
        }

        //iterate through in O(n)
        for(int i=1; i < s.length(); i++){
            int done = s.length()-1;
            int val1 = map.get(s.charAt(i-1));
            int val2 = map.get(s.charAt(i));

            //checks to make sure we are not representing a subtraction pattern (only one lower
            // before higher) and adds the first value
            if(val1>=val2){
                result += val1;
                //checks to see if we are done after these 2 values only then adds the second value
                if(i == done){
                    result += val2;
                }
            } else {
                //now we need to subtract the lower value from the higher value
                result += (val2 - val1);
                //we iterate past our subtraction in the loop
                i++;
                //checks to see if we only have one more roman numeral if so add it to the result
                if (i == done){
                    result += map.get(s.charAt(i));
                }
            }
        }
        return result;
    }
}
