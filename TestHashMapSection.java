import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class TestHashMapSection {
    public static void main(String[] args) {
        solution();
    }

    //1.학급 회장 : 6명의 학생의 학생회장 투표결과중 당선인을 구하라
    // input : 6, AABBBC
    // output : B
    // keyPoint : map.getOrDefault(그값이 있으면 +1해서 넣고 없으면 새로운 키를 put하고 그 키의 value로 1을 넣는다)
//    public static void solution() {
//        int studentNum = 6;
//        String vote = "AAABBBBCCCDDBBBAVBABB";
//        HashMap<String, Integer> map = new HashMap<>();
//
//        for (String a : vote.split("")) {
//            map.put(a, map.getOrDefault(a, 0) + 1);
//        }
//
//        String answer = "";
//        int max = Integer.MIN_VALUE;
//
//        for (String s : map.keySet()) {
//            if(map.get(s) > max) {
//                max = map.get(s);
//                answer = s;
//            }
//        }
//        System.out.println(answer);
//
//    }

    //2.아나그램
    // input : AbaAeCe, baeeACA
    // output : true
    public static void solution() {
        boolean answer = true;

        String a = "ABCDabcdABABcdCd";
        String b = "abcdABCDABcdCdAB";

        a = a.toLowerCase(Locale.ROOT);
        b = b.toLowerCase(Locale.ROOT);

        HashMap<String, Integer> mapA = new HashMap<>();
        HashMap<String, Integer> mapB = new HashMap<>();

        for(String aTmp : a.split("")){
            mapA.put(aTmp ,mapA.getOrDefault(aTmp, 0)+1);
        }
        for(String bTmp : b.split("")){
            mapB.put(bTmp ,mapB.getOrDefault(bTmp, 0)+1);
        }

        for(String aKey : mapA.keySet()) {
            for(String bKey : mapB.keySet()) {
                if(aKey.equals(bKey) && mapA.get(aKey) != mapB.get(bKey)) {
                    answer = false;
                }
            }
        }

        System.out.println("answer::"+answer);

    }

}
