# [level 1] 같은 숫자는 싫어 - 12906 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12906) 

### 성능 요약

메모리: 111 MB, 시간: 33.98 ms

### 구분

코딩테스트 연습 > 스택／큐

### 채점결과

정확성: 71.9<br/>효율성: 28.1<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 01월 19일 10:27:13

### 문제 설명

<p>배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,</p>

<ul>
<li>arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.</li>
<li>arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.</li>
</ul>

<p>배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.</p>

<h5>제한사항</h5>

<ul>
<li>배열 arr의 크기 : 1,000,000 이하의 자연수</li>
<li>배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>arr</th>
<th>answer</th>
</tr>
</thead>
        <tbody><tr>
<td>[1,1,3,3,0,1,1]</td>
<td>[1,3,0,1]</td>
</tr>
<tr>
<td>[4,4,4,3,3]</td>
<td>[4,3]</td>
</tr>
</tbody>
      </table>
<h5>입출력 예 설명</h5>

<p>입출력 예 #1,2<br>
문제의 예시와 같습니다.</p>

### 문제 물이 설명

### trouble shooting
1. 처음에는 문제를 접근 할 때 answer도 arr.length 크기의 배열로 만들어서 진행하려고 했었다. 그 후에 <br>
   for(int i = 0; i < arr.length; i++){ <br>
            if(answer[i] != arr[i]){ <br>
                answer[i] = arr[i]; <br>
            } 
   } <br>
   위와 같이 코드를 짜서 수행하려고 했다. <br>
   처음에 int는 0값으로 초기화 되기 때문에 answer의 모든 값은 0값이 되고 arr[i]와 비교했을 때 arr[i]값이 0이 아니라면 모두 달라서 모든 값이 다 들어가게 된다.
2. answer 배열을 동적으로 크기가 변하는 배열로 만들고자 ArrayList를 사용하였는데 ArrayList<integer> answer = new ArrayList<>(); 와 같이 <> 안에 integer를 모두 소문자로 넣었다. <br>
   -> 문법 실수로 인해 에러가 떴었다.
3. ArrayList로 만든 객체를 반환할 때 배열로 바꾸지 않고 그냥 반환하려고 했더니 에러가 떴었다 <br>
   - 배열로 만든 후에 return했어야 하는데 그러지 않았다. <br>
   - 만약 배열로 만들지 않고 ArrayList 형식으로 return하려면 함수의 return 방식(ArrayList<Integer>)을 수정해야 했다. <br>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
