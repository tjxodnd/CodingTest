import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;

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
    */

    //5. 소수(에라토스테네스 체)
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
        
        for(int i = 2; i < n; i++) {
            if(n%i!=0){
                answer++;
                System.out.println(i);
            }
        }
        
        

 		return answer;
	}

}