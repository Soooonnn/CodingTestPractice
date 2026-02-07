import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int first_index = 0;
        int last_index = people.length-1;
        for(int i=0; i<people.length; i++){
            int first = people[first_index];
            int last = people[last_index];
            if(first + last <= limit){
                answer += 1;
                first_index++;
                last_index--;
            }else{
                answer += 1;
                last_index--;
            }
            if(first_index > last_index){
                break;
            }
        }
        return answer;
    }
}