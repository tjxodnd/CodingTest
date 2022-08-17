public class TestRecursive {

    public static void main(String[] args) {
        //피보나치수열 문제 출력시 필요
//        for(int i = 1; i < fibo.length; i++) {
//            System.out.println(fibo[i]);
//        }
        TestRecursive tree = new TestRecursive();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);

    }

    //1. 재귀함수 이진수출력
//    public static void solution(int N) {
//        if(N == 0) {
//            return;
//        } else {
//            solution(N/2);
//            System.out.print(N%2+" ");
//        }
//    }

    //2. 팩토리알 출력
//    public static int solution(int N) {
//        if(N == 1) {
//            return 1;
//        } else {
//            return N * solution(N-1);
//        }
//    }

    //3. 피보나치수열
//    static int fibo[] = new int[46];
//
//    public static int solution(int N) {
//        if(N==1) {
//            return fibo[N] = 1;
//        } else if(N==2) {
//            return fibo[N] = 1;
//        } else {
//            if(fibo[N] > 0) {
//                return fibo[N];
//            } else {
//                return fibo[N] = solution(N-2) + solution(N-1);
//            }
//        }
//    }

    Node root;

    //4.DFS 트리순회
    public void DFS(Node root) {
        if(root == null) {
            return;
        } else {
            System.out.println(root.data);
            DFS(root.lt);
            DFS(root.rt);
        }

    }

}

class Node{
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        System.out.println("data::"+data);
        lt = rt = null;
    }
}
