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
    //input  :
    //output :
    public static void solution() {
        int[][] board = {{0,0,0,4,3},{0,0,2,2,5},{0,1,5,4,1},{0,0,0,4,3},{0,3,1,2,1}};
        int[] num = {1,5,3,5,1,2,1,4};
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for(int i = 0; i < num.length; i++) {
            if(!stack.isEmpty()) {

            } else {
                int pushNum = 0;
                int[] arr = board[num[i]-1];
                int pos = 0;
                for(int y = 0; y < arr.length; y++){
                    if(arr[y] <= 0) {
                        pos++;
                    } else {
                        pushNum = arr[pushNum];
                        board[num[i]-1][pos] = 0;
                    }
                }
                stack.push(pushNum);
            }
        }

        System.out.println(answer);
        System.out.println(stack);

    }

}
