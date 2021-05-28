import java.util.ArrayList;
import java.util.Scanner;

class TestStringSection {

	/* 숫자 n, n개의 단어를 입력받았을때 뒤집힌 String이 들어있는 ArrayList<String> 을 return하시오.
	//단어 뒤집기(StringBuilder) 이용
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
			//StringBuidler 생성자 메소드중 reverse()는 뒤집고 StringBuilder객체에서 String 객체로 다시 toString() 한후 할당
			//String 연산이 많아지면 builder를 사용하기도함
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		

		//특정문자 뒤집기
		for(String x : str){
			char[] s = x.toCharArray();
			 //-1을 하는이유는 0번 index부터 시작이기때문
			int lt = 0, rt = x.length()-1;
			while(lt<rt){
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt]= tmp;
				lt++;
				rt--;
			}
			//valueOf는 배열을 String으로 바꿔준다.
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}

		return answer;
	}
	
	//입력받은 문자열중 특수문자열이 아닌 알파벳만 위치를 뒤집어서 return 하시오.
	//특수문자(알파벳이 아닐때) 뒤집기(toCharArray[])
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
	

	//중복문자제거해서 return 하시오.
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
	*/

	//회문문자열 palindrome - 앞에서 읽을때나 뒤에서 읽을때나 같은 문자열을 회문 문자열이라고 함
	//ex) wow, goog, 
	//회문문자열일 경우 YES를 return , 아니면 NO를 return 하시오

	

}