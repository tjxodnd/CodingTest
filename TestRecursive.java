import com.sun.tools.javac.Main;

import java.util.LinkedList;
import java.util.Queue;

public class TestRecursive {

    Node root;

    public static void main(String[] args) {
        //피보나치수열 문제 출력시 필요
//        for(int i = 1; i < fibo.length; i++) {
//            System.out.println(fibo[i]);
//        }
        TestRecursive tree = new TestRecursive();
//
//        tree.root = new Node(1);
//        tree.root.lt = new Node(2);
//        tree.root.rt = new Node(3);
//        tree.root.lt.lt = new Node(4);
//        tree.root.lt.rt = new Node(5);
//        tree.root.rt.lt = new Node(6);
//        tree.root.rt.rt = new Node(7);
////        tree.DFS(tree.root);
//        tree.BFS(tree.root);

        //부분집합 출력시 필요
//        n = 3;
//        ch = new int[n+1];
//        TestRecursive T = new TestRecursive();
//        T.DFS(1);

        //송아지찾기
        System.out.println(tree.BFS(5,14));


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



    //4.DFS 트리순회
//    public void DFS(Node root) {
//        if(root == null) {
//            return;
//        } else {
//            System.out.println(root.data);
//            DFS(root.lt);
//            DFS(root.rt);
//        }
//
//    }
//

    //6. 부분집합 구하기
//    static int[] ch;
//    static int n;
//
//    public void DFS(int L) {
//        if(L == n+1) {
//            String tmp = "";
//            for(int i =1;i<=n;i++) {
//                if(ch[i] == 1) {
//                    tmp+=""+i;
//                }
//            }
//
//            if(tmp.length() > 0) {
//                System.out.println(tmp);
//            }
//
//        } else {
//            ch[L] = 1;
//            DFS(L+1);
//            ch[L] = 0;
//            DFS(L+1);
//        }
//    }

    //7. 너비 우선 탐색(BFS)
//    public void BFS(Node root) {
//
//        //같은 레벨에 있는 노드의 데이터값을 큐에 Offer 한 후 같은레벨 queue를 출력
//        Queue<Node> Q = new LinkedList<>();
//        Q.offer(root);
//
//        //레벨값
//        int L = 0;
//
//        while(!Q.isEmpty()) {
//
//            System.out.print(L + " : ");
//            int length = Q.size();
//            for(int i = 0; i < length; i++) {
//                Node cur = Q.poll();
//                System.out.print(cur.data+" ");
//                if(cur.lt!= null) {
//                    Q.offer(cur.lt);
//                }
//                if(cur.rt!= null) {
//                    Q.offer(cur.rt);
//                }
//            }
//            System.out.println();
//            L++;
//        }
//
//    }


    //8.송아지찾기
    static int dis[] = {1, -1, 5};
    static int ch[];
    public int BFS(int S, int E) {
        ch = new int[10001];
        ch[S] = 1;
        int L = 0;

        Queue<Integer> Q = new LinkedList<>();
        Q.offer(S);

        while(!Q.isEmpty()) {
            int length = Q.size();
            for(int i = 0; i < length; i++) {
                int cur = Q.poll();

                for(int j = 0; j < dis.length; j++) {
                    int nx = cur + dis[j];
                    if(nx == E) return L+1;
                    if(nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }

        return 0;
    }

}


class Node{
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
