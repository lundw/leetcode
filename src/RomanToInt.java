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

        if(s.length() == 1){
            return map.get(s.charAt(0));
        }

        for(int i=1; i < s.length(); i++){
            int done = s.length()-1;
            int val1 = map.get(s.charAt(i-1));
            int val2 = map.get(s.charAt(i));

            if(val1>=val2){
                result += val1;
                if(i == done){
                    result += val2;
                }
            } else {
                result += (val2 - val1);
                i++;
                if (i == done){
                    result += map.get(s.charAt(i));
                }
            }
        }
        return result;
    }
}
