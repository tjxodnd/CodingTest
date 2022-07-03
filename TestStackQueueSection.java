import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestStackQueueSection {
    public static void main(String[] args) {
        solution();
    }

    //1. 올바른 괄호
    //input  : ()()(())(((
    //output : false
//    public static void solution() {
//        String str = "()()))))((((()))))";
//        Stack<String> stack = new Stack<>();
//        for(String s : str.split("")) {
//            if("(".equals(s)) {
//                stack.push(s);
//            } else {
//                if(stack.isEmpty()) {
//                    System.out.println("FALSE");
//                    return;
//                } else {
//                    stack.pop();
//                }
//            }
//        }
//        System.out.println("TRUE");
//    }

    //2. 괄호문자제거
    //input  : (A(BC)D)EF(G(H)(IJ)K)LM(N)
    //output : EFLM
//    public static void solution() {
//        String str = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";
//        Stack<String> stack = new Stack<>();
//
//        for(String s : str.split("")) {
//            if(")".equals(s)) {
//                while(!"(".equals(stack.pop()));
//            } else {
//                stack.push(s);
//            }
//        }
//
//        System.out.println("stack::"+stack);
//    }

    //3. 크레인 인형뽑기(카카오)
    //input  : {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}} , {1,5,3,5,1,2,1,4}
    //output : 4
//    public static void solution() {
//        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
//        int[] num = {1,5,3,5,1,2,1,4};
//
//        Stack<Integer> stack = new Stack<>();
//        int answer = 0;
//
//        //num 길이만큼 반복
//        for(int pos : num) {
//            //i는 깊이를 뜻함
//            for(int i =0; i < board.length; i++) {
//                //1번째 열에서 i행만큼 내려갔을때 0이면 패스, 아니면 담아놨다가 스택의 최상단값 가져와서
//                //담아놓은 정수와 같으면 answer+=2 아니면 스택에 푸시
//                if(board[i][pos-1] != 0) {
//                    int tmp = board[i][pos-1];
//                    board[i][pos-1] = 0;
//                    if(!stack.isEmpty() && stack.peek() == tmp) {
//                        answer+=2;
//                        //stack의 peek는 값을 없애지는 않고 값만 return
//                        //stack의 pop은 최상단값을 꺼냄
//                        stack.pop();
//                    } else {
//                        stack.push(tmp);
//                    }
//                    //한번 스택에 쌓거나 빼왔으면 num값번째 열에서는 또 반복하면 안되니 break처리해서 새로운 반복 타게 만들어야함
//                    break;
//                }
//            }
//        }
//
//        System.out.println("answer::"+answer);
//    }

    //4. 후위식연산(postFix)
    //input : 352+*9-
    //output : 12
//    public static void solution() {
//        int lt, rt = 0;
//        String str = "352+*9-";
//
//        Stack<Integer> stack = new Stack<>();
//
//        for(char i : str.toCharArray()) {
//            if(Character.isDigit(i)) {
//                stack.push(Integer.parseInt(String.valueOf(i)));
//            } else {
//                rt = stack.pop();
//                lt = stack.pop();
//                if("+".equals(String.valueOf(i))) {
//                    stack.push(lt+rt);
//                } else if("-".equals(String.valueOf(i))){
//                    stack.push(lt-rt);
//                } else {
//                    stack.push(lt*rt);
//                }
//            }
//        }
//
//        System.out.println("answer::"+stack.pop());
//
//    }

    //5. 쇠막대기문제
    //input : ()(((()())(())()))(())
    //output : 17
    //input 2 : (((()(()()))(())()))(()())
//    public static void solution() {
//        String str = "(((()(()()))(())()))(()())";
//        Stack<String> stack = new Stack<>();
//
//        int answer = 0;
//        String tmp = "";
//
//        for(String s : str.split("")) {
//            tmp = s;
//            if("(".equals(s)) {
//                stack.push(s);
//            } else {
//                if(s.equals(stack.pop())) {
//                    answer++;
//                } else {
//                    answer+=stack.size();
//                }
//            }
//        }
//        System.out.println("answer:"+answer);
//    }

    //6. 공주구하기
    //input 8 3
    //output 7
    public static void solution() {
        int n = 8;
        int k = 3;

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while(queue.size() <= 1) {
            int first = 0;
            int second = 0;

            int peek = queue.poll();

        }




    }
}
