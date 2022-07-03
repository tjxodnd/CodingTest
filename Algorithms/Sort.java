package Algorithms;

import java.awt.event.TextEvent;
import java.util.*;

//정렬
public class Sort {
//    public static void main(String[] args) {
//        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
//        int input[][] = matrix;
//        int arr[][] = new int[input.length][input.length];
//
//        int length = input.length;
//        for(int i = 0; i < length; i++) {
//            for(int j = 0; j < length; j++) {
//                arr[j][i] = input[i][j];
//            }
//        }
//
//        for(int z = 0; z < length; z++) {
//            int tmp[] = new int[length];
//            int cnt = 0;
//            for(int x = length-1; 0 <= x; x--) {
//                tmp[cnt] = arr[z][x];
//                cnt++;
//            }
//            cnt=0;
//            arr[z] = tmp;
//        }
//
//        matrix = input;
//    }
    public static void main(String[] args) {
//        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int matrix[][] = {{1,3}};
        System.out.println(solution(matrix, 1));
    }

    public static boolean solution(int[][] matrix, int target) {

        List<Integer> lists = new LinkedList<>();
        for(int[] a : matrix) {
            for(int z : a) {
                lists.add(z);
            }
        }

        if(lists.size() > 3) {
            if(Collections.binarySearch(lists,target) > 0) {
                return true;
            }
        } else {
            for(int i = 0; i < lists.size(); i++) {
                if(lists.get(i)==target) {
                    return true;
                }
            }
            return false;
        }
        return false;

    }
}