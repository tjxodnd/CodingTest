public class TestBFS {

    public static void main(String[] args) {
        TestBFS T = new TestBFS();
        //1. 바둑이무게
//        int arr[] = {81,58,42,33,61};
//        c = 259;
//        n = arr.length;
//        T.DFS(0,0, arr);
//        System.out.println("answer::" + answer);

        //2. 받을 수 있는 최대점수
//        int ps[] = {10,25,15,6,7};
//        int pt[] = {5,12,8,3,4};
//        c = 20;
//        n = 5;
//        T.DFS(0,0,0, ps, pt);
//        System.out.println("answer::" + answer);

        //3. 중복순열 구하기
//        T.DFS(0);

        //4. 동전의 최소개수 구하기
        T.DFS(0, n, arr);
    }

    //1. 태울수 있는 바둑이의 최대무게
    //answer : 정답무게, c : 트럭에 최대로 실을수있는 무게, n : 바둑이들 마릿수
//    static int answer = Integer.MIN_VALUE, c, n;
//    public void DFS(int L, int sum, int arr[]) {
//        if(sum > c) {
//            //합이 최대값보다 클경우 재귀종료
//            return;
//        }
//        if(L == n) {
//            //최대로 태울수있는 마릿수가 재귀 레벨과 동일할 때 넘어온 합과 answer중 큰값을 answer에 할당
//            answer = Math.max(answer,sum);
//        } else {
//            //바둑이를 태웠을때
//            DFS(L + 1, sum + arr[L], arr);
//            //해당 바둑이를 안태웠을때
//            DFS(L + 1, sum, arr);
//        }
//    }

    //2. 얻을 수 있는 최대 점수
    //answer = 점수,
//    static int answer = Integer.MIN_VALUE, c, n;
//    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {
//        if(time > c) {
//            return;
//        }
//        if(L == n) {
//            answer = Math.max(answer,sum);
//        } else {
//            DFS(L+1, sum+ps[L], time+pt[L], ps, pt);
//            DFS(L+1, sum, time, ps, pt);
//        }
//    }

    //3. 중복순열 구하기
//    static int n = 3, m = 2;
//    static int pm[] = new int[m];
//
//    public void DFS(int L) {
//
//        if(L == m) {
//            System.out.print(pm[0] + " " + pm[1]);
//            System.out.println();
//            return;
//
//        } else {
//            for(int i = 1; i <= n; i++) {
//                pm[L] = i;
//                DFS(L+1);
//            }
//        }
//
//    }

    //4. 거슬러줘야하는 동전의 최소 개수를 구하라
    static int n = 125, answer;
    static int arr[] = {1,2,5};
    public void DFS(int L, int n, int arr[]) {


    }
}
