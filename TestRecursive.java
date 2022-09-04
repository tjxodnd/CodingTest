import com.sun.tools.javac.Main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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
        //8. 송아지찾기 답 : 3
//        System.out.println(tree.BFS(5,14));

        //9. 최단경로찾기 DFS풀이
//        tree.root = new Node(1);
//        tree.root.lt = new Node(2);
//        tree.root.rt = new Node(3);
//        tree.root.lt.lt = new Node(4);
//        tree.root.lt.rt = new Node(5);
//        System.out.println(tree.DFS(0, tree.root));
//        System.out.println(tree.BFS(tree.root));

        //12.경로탐색
//        5 9
//        1 2
//        1 3
//        1 4
//        2 1
//        2 3
//        2 5
//        3 4
//        4 2
//        4 5
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new int[n+1][n+1];
        ch = new int[n+1];

        for(int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }

        ch[1] = 1;
        tree.DFS(1);
        System.out.println("answer::"+answer);

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
//    static int dis[] = {1, -1, 5};
//    static int ch[];
//    public int BFS(int S, int E) {
//        //체크 배열은 문제에서 주어진 최대값만큼 만들어놓기
//        ch = new int[10001];
//        //최초 시작점은 방문한것으로 지정
//        ch[S] = 1;
//        //BFS 순회를 위해서 순회할 레벨 선언
//        int L = 0;
//        //순회용 큐 선언
//        Queue<Integer> Q = new LinkedList<>();
//        Q.offer(S);
//        //큐가 빌때까지 반복
//        while(!Q.isEmpty()) {
//            //현재 레벨의 큐에 남아있는 숫자에 가지를 치기위해 반복문 태우기
//            int len = Q.size();
//            for(int i = 0; i < len; i++) {
//                //큐에서 한개 뽑아온다
//                int cur = Q.poll();
//                //도착점의 숫자와 같으면 현재 돌고있는 레벨이 방법의 수이므로 바로 return
//                if(cur == E) {
//                    return L;
//                }
//                //cur에다가 dis에 주어진 이동가능한 거리를 큐에 offer 하기위해 dis길이만큼 반복문 태우기
//                for(int j = 0; j < dis.length; j++) {
//                    //현재 큐에서 나온 값에 dis값들 더해서 큐에 offer
//                    int nx = cur + dis[j];
//                    //주어진 조건에 부합하고 체크배열에서 해당 값을 이미 돌았는지 체크한후 아니면 체크배열에 돌았다고 체크 후 큐에 오퍼
//                    if(nx >= 1 && nx < 10001 && ch[nx] == 0) {
//                        ch[nx] = 1;
//                        Q.offer(nx);
//                    }
//                }
//            }
//            L++;
//        }
//
//        return 0;
//    }

    //9. 최단경로찾기 DFS풀이
//    public int DFS(int L, Node root) {
//        if(root.lt == null && root.rt == null) {
//            return L;
//        } else {
//            return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
//        }
//    }

    //10. 최단경로찾기 BFS풀이
//    public int BFS(Node root) {
//       Queue<Node> Q = new LinkedList<>();
//       Q.offer(root);
//       int L = 0;
//
//       while(!Q.isEmpty()) {
//           int len = Q.size();
//           for(int i =0; i < len; i++) {
//               Node cur = Q.poll();
//               if(cur.rt == null && cur.lt == null) {
//                   return L;
//               }
//               if(cur.lt != null) {
//                   Q.offer(cur.lt);
//               }
//               if(cur.rt != null) {
//                   Q.offer(cur.rt);
//               }
//           }
//           L++;
//       }
//
//       return 0;
//    }

//    //12. 경로탐색
//    static int n, m, answer;
//    static int graph[][];
//    static int ch[];
//
//    public void DFS(int v) {
//        //만약 현재 정점(노드)가 목표 노드에 도착했을경우
//        if(v == n) {
//            //정답을 한개 카운트한다
//            answer++;
//        } else {
//            //현재 노드(v)에서 5개의 노드까지 방문하게끔 for문
//            for(int i = 1; i < n; i++) {
//                //만약 그래프에서 v(현재노드)에서 1,2,3,4,5중 갈 수 있으며 방문하지 않았던 경로라면
//                if(graph[v][i] == 1 && ch[i] == 0) {
//                    //방문했음을 체크
//                    ch[i] = 1;
//                    //재귀
//                    DFS(i);
//                    //다시 0으로 바꾸면서 재귀를 타게끔
//                    ch[i] = 0;
//                }
//            }
//        }
//    }

    //13. 경로탐색 ArrayList로
    //시작점, 도착점, 정답의 가짓수
    static int n, m, answer;
    //그래프 저장용
    static int graph[][];
    //체크배열
    static int ch[];

    public void DFS(int v) {
        //만약 현재 정점(노드)가 목표 노드에 도착했을경우
        if(v == n) {
            //정답을 한개 카운트한다
            answer++;
        } else {
            //현재 노드(v)에서 5개의 노드까지 방문하게끔 for문
            for(int i = 1; i < n; i++) {
                //만약 그래프에서 v(현재노드)에서 1,2,3,4,5중 갈 수 있으며 방문하지 않았던 경로라면
                if(graph[v][i] == 1 && ch[i] == 0) {
                    //방문했음을 체크
                    ch[i] = 1;
                    //재귀
                    DFS(i);
                    //다시 0으로 바꾸면서 재귀를 타게끔
                    ch[i] = 0;
                }
            }
        }
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


