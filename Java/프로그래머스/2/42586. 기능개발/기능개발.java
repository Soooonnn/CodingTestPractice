import java.util.Stack;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> days = new Stack<>();
        Stack<Integer> answer = new Stack<>();
        int day = 0;
        for(int i = 0;  i < progresses.length; i++){
            while(i < progresses.length && progresses[i] + speeds[i] * day < 100){
                day++;
                }
            days.push(day);
        }
        for(int j=0; j<days.size();){
            answer.push(1);
            int k = j+1;
            for(; k<days.size(); k++){
                if(days.get(j) >= days.get(k)){
                    int top = answer.pop();
                    answer.push(top+1);
                    }else{
                    break;
                }
                }
            j = k;
            }
        int[] real_answer = new int[answer.size()];
        for(int l=0; l < answer.size(); l++){
            real_answer[l] = answer.get(l);
        }

        return real_answer;
    }
}