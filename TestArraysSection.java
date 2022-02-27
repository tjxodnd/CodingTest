import java.util.*;

//배열부분
class TestArraysSection {

    /*
    //1. 큰 수 출력하기
	//문제 : N개의 정수, 그 다음 줄에 N개의 정수를 입력받아 자신의 바로 앞 수보다 큰 수만 출력해라(첫번째 수는 무조건 출력한다)
	//input : 6, 7 3 9 5 6 12
	//output : 7 9 6 12
	public static void main(String[] args) {
		TestArraysSection T = new TestArraysSection();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
        int[] nArr = new int[n];
        for(int i = 0; i < n; i++) {
            nArr[i] = kb.nextInt();
        }
		System.out.println(T.solution(n,nArr)); 
	}

	public List<Integer> solution(int n, int[] nArr) {
		ArrayList<Integer> answer = new ArrayList<Integer>(); 
        /* 내풀이 - 첫번째수 무조건 출력 안한다는 조건, 입력은 String s가 공백으로 나뉘어져있음
        String[] strArray = s.split(" ");

        //그 수가 위치한 인덱스
        int indexs = Arrays.asList(strArray).indexOf(String.valueOf(n));
        List<Integer> answer = new ArrayList<Integer>(); 

        for(int i = 0; i < indexs-1; i++) {
            if(Integer.parseInt(strArray[i]) > n) {
                answer.add(Integer.parseInt(strArray[i]));
            }
        }
        answer.add(n);

        for(int i = indexs+1; i < strArray.length; i++) {
            answer.add(Integer.parseInt(strArray[i]));
        }
        
        
        answer.add(nArr[0]);
        for(int i = 1; i < nArr.length; i++) {
            if(nArr[i] > nArr[i-1]) {
                answer.add(nArr[i]);
            }
        }
 		return answer;
	}
    

    //2. 보이는 애 숫자
	//문제 : n명의 학생수, 그 학생들의 키가 주어질때 맨앞에 서있는 선생님이 볼 수 있는 학생수를 구하라.
	//input : 6, 130 135 148 140 145 150 150 153
	//output : 5
	public static void main(String[] args) {
		TestArraysSection T = new TestArraysSection();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
        int[] nArr = new int[n];
        for(int i = 0; i < n; i++) {
            nArr[i] = kb.nextInt();
        }
		System.out.println(T.solution(n,nArr)); 
	}

	public int solution(int n, int[] nArr) {
		int answer = 1;
        int max = nArr[0];

        for(int i = 1; i < nArr.length; i++) {
            if(nArr[i] > max) {
                max = nArr[i];
                answer++;
            }
        }

 		return answer;
	}
   
 
    //3. 가위바위보
	//문제 : N번의 게임을 진행하는데 누가이겼는지 출력해라. 비기면 D , 1:가위, 2:바위, 3:보
	//input : 5, [2,3,3,1,3], [1,1,2,2,3]
	//output : A B A B D
	public static void main(String[] args) {
		TestArraysSection T = new TestArraysSection();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

        int[] aArr = new int[n];
        int[] bArr = new int[n];

        for(int i = 0; i < n; i++) {
            aArr[i] = kb.nextInt();
        }
        
        for(int i = 0; i < n; i++) {
            bArr[i] = kb.nextInt();
        }

		System.out.println(T.solution(n,aArr, bArr)); 
	}

	public String solution(int n, int[] aArr, int[] bArr) {
		String answer = "";
        
        //A가 이겼을경우만 비교, 나머지는 B가승자이기때문에 A승자일경우만 구한다. 비길때만 D
        for(int i = 0; i < n; i++) {
           if(aArr[i] == bArr[i]){answer+="D";}
           else if(aArr[i] == 1 && bArr[i] == 3){answer+="A";}
           else if(aArr[i] == 2 && bArr[i] == 1){answer+="A";}
           else if(aArr[i] == 3 && bArr[i] == 2){answer+="A";}
           else answer+="B";
        }

 		return answer;
	}
    

    //4. 피보나치 수열
	//문제 : N이 입력되면 N자리 피보나치 수열을 출력하시오.
	//input : 7
	//output : 1 1 2 3 5 8 13
	public static void main(String[] args) {
		TestArraysSection T = new TestArraysSection();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n)); 
	}

	public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(1);
        answer.add(1);
        for(int i = 2; i < n; i++) {
            answer.add(answer.get(i-2)+answer.get(i-1));
        }  
 		return answer;
	}
    

    //5. 소수(에라토스테네스 체- )
	//문제 : N이 입력되면 1부터 N까지의 소수의 개수를 출력하시오
	//input : 20
	//output : (2,3,5,7,11,13,17,19) 8
	public static void main(String[] args) {
		TestArraysSection T = new TestArraysSection();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n)); 
	}

	public int solution(int n) {
        int answer = 0;
        
        int[] arr = new int[n+1];
        for(int i = 2; i < n; i++) {
            if(arr[i] == 0) {
                answer++;
                //j는 i의 배수로 돌아야 하기때문에 마지막에 j=j+i ex.)i가2일경우 2+2,4+2 이런식으로 돌게됨.
                for(int j = i; j <= n; j=j+i) {
                    arr[j] = 1;
                }
            }
        }
        
 		return answer;
	}
     

    //6. 뒤집은 소수
	//문제 : N개의 자연수가 입력되면 자연수를 뒤집은 후 그 뒤집은 숫자가 소수이면 출력한다. 32를 뒤집으면 23, 23은 소수이니까 출력, 100은 뒤집으면 1(0은제외)
	//input : 9, 32 55 62 20 250 370 200 30 100
	//output : 23 2 73 2 3
	public static void main(String[] args) {
		TestArraysSection T = new TestArraysSection();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

		System.out.println(T.solution(n,arr)); 
	}

    public boolean isPrime(int n) {
        if(n==1) return false;
         for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
        
    }

	public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        //res = res * 10 + t
        //tmp = 1230
        //t=0
        //res = 0 * 10 + 0
        //tmp = 123
        //t=3
        //res = 0*10+3 // 3
        //
        
        for(int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while(tmp>0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp/10;
            }
            if(isPrime(res)){
                answer.add(res);
            }
        }
        
 		return answer;
	}
    

    //7. 점수계산
	//문제 : 채점결과가 주어졌을때 총점을 계산하는 프로그램을 작성해라(연속으로 맞을경우 sum++ 가다가 틀릴경우는 sum = 0)
	//input : 1 0 1 1 1 0 0 1 1 0 
	//output : 1 + 0 + 1 + 2 + 3 + 0 + 0 + 1 +2 = 10
	public static void main(String[] args) {
		TestArraysSection T = new TestArraysSection();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

		System.out.println(T.solution(n,arr)); 
	}

	public int solution(int n, int[] arr) {
        int answer = 0;
        int[] anArr = new int[n];
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                sum++;
                anArr[i] = sum;
            } else {
                sum = 0;
                anArr[i] = sum;
            }
        }

        for(int j = 0; j < anArr.length; j++) {
            answer += anArr[j];
        }

 		return answer;
	}
    */

    //8. 등수구하기
    //문제 : 등수를 구하라
	//input : 5, 32 55 44 44 23 4
	//output :   3  1  2  2  4  5
	public static void main(String[] args) {
		TestArraysSection T = new TestArraysSection();
		Scanner kb = new Scanner(System.in); 
		int n = kb.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

		System.out.println(T.solution(n,arr)); 
	}

	public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        Arrays.sort(arr);
        Map<String, Object> gradeMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
			System.out.println("d");
		}

 		return answer;
	}
}