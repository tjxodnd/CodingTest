import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class TestStringSection {


/*
	// 
	//숫자 n, n개의 단어를 입력받았을때 뒤집힌 String이 들어있는 ArrayList<String> 을 return하시오.
	//4. 단어 뒤집기(StringBuilder) 이용
	public static void main(String[] args) {
		TestStringSection T = new TestStringSection();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = kb.next();
		}
		for(String x : T.solutionReverseStr(n, str)){
			System.out.println(x);
		}
	}

	public ArrayList<String> solutionReverseStr(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<String>();
		
		//전체뒤집기
		for(String x : str){
//			//StringBuidler 생성자 메소드중 reverse()는 뒤집고 StringBuilder객체에서 String 객체로 다시 toString() 한후 할당
//			//String 연산이 많아지면 builder를 사용하기도함
//			String tmp = new StringBuilder(x).reverse().toString();
//			answer.add(tmp);

            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;
            while(lt<rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String zz = String.valueOf(s);
            answer.add(zz);
		}



		//특정문자 뒤집기
//		for(String x : str){
//			char[] s = x.toCharArray();
//			 //-1을 하는이유는 0번 index부터 시작이기때문
//			int lt = 0, rt = x.length()-1;
//			while(lt<rt){
//				char tmp = s[lt];
//				s[lt] = s[rt];
//				s[rt]= tmp;
//				lt++;
//				rt--;
//			}
//			//valueOf는 배열을 String으로 바꿔준다.
//			String tmp = String.valueOf(s);
//			answer.add(tmp);
//		}

		return answer;
	}

	//입력받은 문자열중 특수문자열이 아닌 알파벳만 위치를 뒤집어서 return 하시오.
	//5.특수문자(알파벳이 아닐때) 뒤집기(toCharArray[])
	public String solutionSpecial(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length()-1;

		while(lt < rt) {
			if(!Character.isAlphabetic(s[lt])){
				lt++;
			} else if(!Character.isAlphabetic(s[rt])){
				rt--;
			} else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);
		return answer;
	}

	public static void main(String[] args) {
		TestStringSection T = new TestStringSection();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solutionSpecial(str));
	}
	

	//6.중복문자제거해서 return 하시오.
	public static void main(String[] args) {
		TestStringSection T = new TestStringSection();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solutionDuplDel(str)); 
	}

	public String solutionDuplDel(String str) {
		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			//System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
			//아래 if문이 참일때는 처음나온문자
			if(str.indexOf(str.charAt(i)) == i) {
				answer+=str.charAt(i);
			}
		}
		return answer; 
	}
	

	//회문문자열 palindrome - 앞에서 읽을때나 뒤에서 읽을때나 같은 문자열을 회문 문자열이라고 함
	//ex) wow, goog, 
	//7.회문문자열일 경우 YES를 return , 아니면 NO를 return 하시오

	public static void main(String[] args) {
		TestStringSection T = new TestStringSection();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solutionDuplDel(str)); 
	}

	public String solutionDuplDel(String str) {
		
		//고전적인방법
		// int len = str.length();
		// str = str.toUpperCase();
		// for(int i =0; i < len/2; i++) {
		// 	//이해가 안되면 대입해볼것
		// 	//StutS = S와 StutS의 length인 5-0-1 =4 StutS의 4번째 인덱스와 비교하게됨 
		// 	if(str.charAt(i) != str.charAt(len-i-1)) {
		// 		return "NO";
		// 	}
		// }

		//문자열을 뒤집어서 비교
		String tmp = new StringBuilder(str).reverse().toString();
		//equalsIgnoreCase = 대소문자 구분 안함
		if(str.equalsIgnoreCase(tmp)){
			return "YES";
		} else {
			return "NO";
		}
	}
	

	//8. 유효한 팰린드롬(replaceAll 정규식이용)
	public static void main(String[] args) {
		TestStringSection T = new TestStringSection();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solutionDuplDel(str)); 
	}

	public String solutionDuplDel(String str) {
		//replace에는 정규식 사용가능
		str = str.toUpperCase().replaceAll("[^A-Z]","");
		
		//문자열을 뒤집어서 비교
		String tmp = new StringBuilder(str).reverse().toString();
		//equalsIgnoreCase = 대소문자 구분 안함
		if(str.equals(tmp)){
			return "YES";
		} else {
			return "NO";
		}
	}
	

	// 9.숫자만추출
	public static void main(String[] args) {
		TestStringSection T = new TestStringSection();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solutionDuplDel(str)); 
	}

	public int solutionDuplDel(String str) {
		String answer = "";
		//replace에는 정규식 사용가능
		for(char x : str.toCharArray()){
			if(Character.isDigit(x)){
				answer+=x;
			}
		}
		return Integer.parseInt(answer);
	}
	

	//10. 가장 짧은 문자거리
	//문제 : 첫번째줄에 문자열s와 문자t가 주어진다. 문자열과 문자는 소문자로만 주어짐, s의 각문자가 t와 떨어진 거리를 순서대로 출력한다
	//input : teachermode e
	//output : 10121012210
	public static void main(String[] args) {
		TestStringSection T = new TestStringSection();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		String t = kb.nextLine();
		System.out.println(T.solutionDuplDel(str,t)); 
	}

	public List<Integer> solutionDuplDel(String s, String t) {
		
		List<Integer> answerList = new ArrayList<Integer>();
		//param : s = teachermode, t = e
		//초기 숫자 p - 1000
		//왼쪽으로 최초 for문으로 탐색, e를 만나면 0, 아닌문자면 + 1
		//string =   t  e a c h e r m o d e
		//answer = 1001,0,1,2,3,0,1,2,3,4,0
		
		int p = 1000;
		
		int[] arrayInt = new int[s.length()];
		int[] arrayInt2 = new int[s.length()];

		String[] array = s.split("");
		for(int i = 0; i < array.length; i++) {
			if(array[i].equals(t)){
				p=0;
				arrayInt[i] = p;
			} else {
				p++;
				arrayInt[i] = p;
			}
		}

		p = 1000;

		//for문을 뒤에서부터 태운후
		//10번 인덱스부터이기때문에 -1
		//arrayInt[i] 보다 arrayInt2의 값중 작은값을 arrayInt에 다시 할당
		for(int i = array.length-1; i >= 0; i--) {
			if(array[i].equals(t)){
				p=0;
				arrayInt2[i] = p;
			} else {
				p++;
				arrayInt2[i] = p;
				if(arrayInt[i] > arrayInt2[i]) {
					arrayInt[i] = arrayInt2[i];
				}
			}
			answerList.add(arrayInt[i]);
		}
 		return answerList;
	}
	

	//11. 문자열 압축
	//문제 : 압축된 문자열 출력
	//input : KKHSSSSSSSE 
	//output : K2HS7E
	public static void main(String[] args) {
		TestStringSection T = new TestStringSection();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str)); 
	}

	public String solution(String s) {
		String answer = "";
		s = s+" ";
		int cnt = 1;
		
		for(int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)==s.charAt(i+1)){
				cnt++;
			} else {
				answer+=s.charAt(i);
				if(cnt>1) {
					answer+=String.valueOf(cnt);
				}
				cnt=1;
			}
		}

 		return answer;
	}
	

	//12. 암호
	//문제 : 암호화된 문자열 출력 #은 이진수의 1로, *은 이진수의0으로 변환하고 처음 입력받은 숫자만큼 암호화스트링을 끊어서 변환하면 01010110이런식으로 된걸 10진수화한 값을 아스키코드값으로 매칭해서 출력
	//input : 4, #****###**#####**#####**##** 
	//output : COOL
	public static void main(String[] args) {
		TestStringSection T = new TestStringSection();
		Scanner kb = new Scanner(System.in);
		int n = Integer.parseInt(((String)kb.nextLine()));
		String s = kb.nextLine();
		System.out.println(T.solution(n,s)); 
	}

	public String solution(int n, String s) {
		String answer = "";
        for (int i = 0; i < n; i++) {
			String tmp = s.substring(0,7).replace("*", "0").replace("#", "1");
			int num = Integer.parseInt(tmp, 2);//2진수로 넘기겠다
			s = s.substring(7);
			answer+=(char) num;
        }
 		return answer;
	}
	*/
}