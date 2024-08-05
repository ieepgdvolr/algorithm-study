package interview.ch06;

import java.util.*;

public class strTest {
    // 금지된 단어를 제외하고 가장 흔하게 등장하는 단어를 출력
    // 대소문자 구분하지 않으며, 구두점(마침표, 쉼표) 무시한다.

    public static void main(String[] args) {
        String paragragh = "Ross hit a ball, the hit BALL flew far away after it was hit.";

        mostCommon(paragragh);
    }

    public static String mostCommon(String sParam){
        String para = sParam;
        String banned = "hit";

        // 1. 대소문자 구분 없애기
        para = para.toLowerCase();

        // 2. 구두점 제거
        String paraResult = para.replaceAll("\\p{Punct}", "");
        // 3. 금지된 단어 제외
        String[] arrParaWord = paraResult.split(" ");
        List<String> retList = new ArrayList();
        Map<String, Integer> freMap = new HashMap();
        for(String word : arrParaWord){
            if(word.equals(banned)){
                continue;
            }
            // 단어 빈도수 체크
            //getOrDefault : 값이 존재하지 않는 경우 기본값을 출력하며 존재하는 경우에는 해당하는 값을 출력.
            freMap.put(word, freMap.getOrDefault(word, 0) + 1);
        }

        // max() 가장 큰 값을 찾음. Collections.min() 가장 작은 값을 찾음.
        System.out.println(freMap.entrySet()); //[the=1, a=1, ball=2, away=1, far=1, flew=1, ross=1, was=1, after=1, it=1]
        return Collections.max(freMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
