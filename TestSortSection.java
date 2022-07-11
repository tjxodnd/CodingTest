public class TestSortSection {
    public static void main(String[] args) {
        solution();
    }

    //1. 선택정렬
    // input : {13,5,11,7,23,15}
    // output : 5,7,11,13,15,23
//    public static void solution() {
//        int arr[] = {13,5,11,7,23,15};
//        //길이의 이전까지만 도는 이유는 마지막값은 항상 제일 큰 값이 있기 때문에 굳이 마지막까지 돌지않아도됨
//        for(int i = 0; i < arr.length-1; i++) {
//            //작은값의 인덱스를 우선 구하기위해 idx 변수선언
//            int idx = i;
//
//            //i번째의 +1 부터 돌아야함
//            //이부분은 작은게 나오자마자 바꾸는것이 아닌 제일 작은값의 index를 찾기위한 for문임
//            for(int j = i+1; j < arr.length; j++) {
//                if(arr[idx] > arr[j]) {
//                    idx = j;
//                }
//            }
//            int tmp = arr[i];
//            arr[i] = arr[idx];
//            arr[idx] = tmp;
//        }
//
//        for(int j : arr) {
//            System.out.print(j+",");
//        }
//    }

//    //2. 버블정렬
//    // input : {13,5,11,7,23,15}
//    // output : 5,7,11,13,15,23
//    public static void solution() {
//        int arr[] = {13,5,11,7,23,15};
//
//        for(int z = 0; z < arr.length-1; z++) {
//            for(int i = 0; i < arr.length-1;i++) {
//                int tmp = arr[i];
//                if(arr[i] > arr[i+1]) {
//                    arr[i] = arr[i+1];
//                    arr[i+1] = tmp;
//                }
//                tmp = 0;
//            }
//        }
//
//        for(int j : arr) {
//            System.out.print(j+",");
//        }
//    }

    //3. 삽입정렬
    // input : {11,7,5,6,10,9}
    // output : 5,6,7,9,10,11
//    public static void solution() {
//        int arr[] = {11,7,5,6,10,9};
//
//        for(int i = 1; i < arr.length; i++) {
//            int tmp = arr[i];
//            for(int j = i-1; j >= 0; j--) {
//                if(arr[j] > tmp) {
//                    arr[j+1] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//
//        for(int j : arr) {
//            System.out.print(j+",");
//        }
//    }

    //3. LRU 알고리즘
    //input : 5 9 , 1 2 3 2 6 2 3 5 7
    //output : 7 5 3 2 6
    public static void solution() {
        int arr[] = {1,2,3,2,6,2,3,5,7};
        int cache[] = new int[5];

        for(int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            for(int j = i-1; j >= 0; j--) {
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for(int j : cache) {
            System.out.print(j+",");
        }

    }

}
