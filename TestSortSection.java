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
//            int idx = i;
//            for(int j = 1; j < arr.length; j++) {
//                if(arr[idx] > arr[j]) {
//                    int tmp = arr[idx];
//                    arr[idx] = arr[j];
//                    arr[j] = tmp;
//                    idx = j;
//                }
//            }
//        }
//        for(int j : arr) {
//            System.out.print(j+",");
//        }
//    }

    //2. 버블정렬
    // input : {13,5,11,7,23,15}
    // output : 5,7,11,13,15,23
//    public static void solution() {
//        int arr[] = {13,5,11,7,23,15};
//
//        for(int i = 0; i < arr.length-1; i++) {
//            int tmp = arr[i];
//            if(arr[i] > arr[i+1]) {
//                arr[i] = arr[i+1];
//                arr[i+1] = tmp;
//            }
//        }
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

        for(int x : arr) {
            for(int i = 0; i < arr.length; i++) {
                int pos = -1;
                //cache heat일 경우 해당 인덱스를 저장한다.
                if(arr[i] == x) {
                    pos = i;
                }
                //cache miss일경우
                if(pos == -1) {
                    for(int z = arr.length-1; z >= 1; z--) {
                        arr[z] = arr[z-1];
                    }
                    cache[0] = x;
                }
                //cache hit일경우 처리
                else {
                    for(int z = pos; z >= 1; z--) {
                        cache[z] = cache[z-1];
                    }
                    cache[0] = x;
                }
            }
        }

        for(int j : cache) {
            System.out.print(j+",");
        }

    }

}
