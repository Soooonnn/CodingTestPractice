import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> set = new HashSet<>();
        for(String number : phone_book){
            set.add(number);
        }
        for(String number : phone_book){
            for(int i=1; i<number.length(); i++){
                String pre = number.substring(0,i);
                if(set.contains(pre)){
                    return false;
                }
            }
        }
        return answer;
    }
}