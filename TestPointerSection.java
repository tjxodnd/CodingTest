import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPointerSection {

    public static void main(String[] args) {
        solution();
    }

    // 1. Two Pointer
    // 오름차순으로 정렬된 두 배열을 합쳐라
    // input 1 : {1,3,5}
    // input 2 : {2,3,6,7,9}
    // output : {1,2,3,3,5,6,7,9}
//    public static void solution() {
//        int[] a = {1,3,5};
//        int[] b = {2,3,6,7,9};
//
//        int p1 = 0;
//        int p2 = 0;
//
//        List<Integer> answer = new ArrayList<>();
//
//        while(p1 < a.length) {
//            if(a[p1] < b[p2]) {
//                answer.add(a[p1]);
//                p1++;
//            } else {
//                answer.add(b[p2]);
//                p2++;
//            }
//        }
//
//        for(int i = p2; i < b.length; i++) {
//            answer.add(b[i]);
//        }
//
//        for(int z : answer) {
//            System.out.println("answer:"+z);
//        }
//    }

    // 2. 공통원소 출력후 오름차순 정렬
    // input 1 : {1,3,5,8}
    // input 2 : {1,2,3,4,5,6,7,9}
    // output : {1,3,5}
    public static void solution() {
        int[] a = {3,8,5,1};
        int[] b = {4,2,6,3,8,1,5,9};

        int[] c = new int[b.length];
        int p = 0;

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    c[p] = b[j];
                    p++;
                }
            }
        }

        Arrays.sort(c);
        for(int cs : c) {
            System.out.println(cs);
        }
    }

}
