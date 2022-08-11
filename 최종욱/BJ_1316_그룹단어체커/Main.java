import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int T = sc.nextInt(); //입력할 단어의 개수
	        int front = 0; //중복된 문자를 찾기 위해 사용될 변수
	        int count = T; //그룹인 단어의 수를 측정할 변수
	        int v = T;

	        for(int tc = 0; tc < T; tc++) {
	            String str = sc.next();//알파벳 입력
	            String[] word = str.split("");

	            for(int i = 0; i < word.length; i++) {//문자 하나와 그 뒷부분을 비교
	                front = i;//비교할 단어의 제일 앞 위치
	                for(int j = i+1; j < word.length; j++) {
	                    if(word[i].equals(word[j]) && j-front ==1){//동일한 문자가 있고 그 위치가 서로 1차이
	                        front = j; //비교할 단어의 제일 앞 위치 최신화
	                    }
	                    else if(word[i].equals(word[j]) && j-front > 1) {//동일한 문자이나 그 위치의 차이가 1을 초과할 떼ㅐ
	                        count-=1;// 그룹단어가 아니므로 단어수에서 -1
	                        break;
	                    }
	                }
	                if(count < v) {
	                	v=count;
	                    break;
	                }
	            }

	        }
	        System.out.println(count);
	    }

	}
