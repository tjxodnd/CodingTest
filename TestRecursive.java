public class TestRecursive {
    public static void main(String[] args) {
        System.out.println(solution(6));
    }

    //6. 재귀함수 이진수출력
//    public static void solution(int N) {
//        if(N == 0) {
//            return;
//        } else {
//            solution(N/2);
//            System.out.print(N%2+" ");
//        }
//    }

    //7. 팩토리알 출력
//    public static int solution(int N) {
//        if(N == 1) {
//            return 1;
//        } else {
//            return N * solution(N-1);
//        }
//    }

    //8. 피보나치수열
    static int fibo[] = new int[10];

    public static int solution(int N) {
        if(N==1) {
            return 1;
        } else if(N==2) {
            return 1;
        } else {
            return solution(N-2) + solution(N-1);
        }
    }

}
