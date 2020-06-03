package test.main;
import java.util.Random;

public class MainClass07_1 {
	public static void main(String[] args) {
    /*
     *  [ 연습2 ]  
     * 
     * 2. 
     * random 객체를 이용해서 로또 번호를 6개 랜덤하게 얻어내서 배열에 저장한다.
     * 모두 저장이 되면 for문을 이용해서 배열에 저장된 모든 로또 번호를
     * 콘솔창에 순서대로 출력하는 코드를 작성하세요.
     * (숫자는 중복제거 후 오름차순으로 출력한다.)
     * */

		int[] lottoArry = randomNum(); //중복제거 된 arryNum를 lottoArry에 넣음
		bubbleSort(lottoArry);
		printLotto(lottoArry);
	
	}
		
		
	//랜덤 숫자 6개 뽑기(중복제거), int[] 리턴
	public static int[] randomNum() {
		int[] arryNum = new int[6];
		Random ranNum = new Random();
	
		for (int i = 0; i < arryNum.length; i++) {
			
			int num = ranNum.nextInt(45)+1;
			arryNum[i] = num;
				
			for (int j = 0; j < i; j++) { 
				if (arryNum[i] == arryNum[j]) {
					i--;
				}
			}
		}//중복제거--끝
		return arryNum;
		}
		
		//숫자 출력
		public static void printLotto(int[] lotto) {
			System.out.print("로또 번호: ");
			for(int i=0; i<lotto.length; i++) {
				System.out.print(lotto[i]+" ");
			}
		}
		
		//버블소트 (오름차순)
		public static void bubbleSort(int[] arr) {
	        for(int i = 0; i < arr.length; i++) {
	            for(int j = 0 ; j < arr.length - i - 1 ; j++) {
	                if(arr[j] > arr[j+1]) {
	                    int temp = arr[j+1];
	                    arr[j+1] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	
	} //main
} //class
