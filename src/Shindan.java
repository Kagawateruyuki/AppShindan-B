import java.util.Scanner;
public class Shindan {
	public static void main(String[] args){
		//メイン文中里担当
		//回答内容で診断をする処理
		//回答結果を表示する処理
	}

	public situmon1(){
		//裕哉担当
		//質問内容を表示
		//回答内容を表示（１：男性２：女性）
		//ユーザーが答えを入力
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("大地はハゲだと思いますか？");
		for(;;){
			System.out.print("１：YES ２：YES : ");
			i = sc.nextInt();
			if(i == 1 || i == 2){
				break;
			}else{
				System.out.println("１か２を選択してください。");
			}
		}
		
	}

	public void situmon2(){
		//中里担当
	}
	public void situmon3(){
		//葛西担当
	}
	public void situmon4(){
		//糞ゴミ童貞担当
	}
	public void situmon5(){
		//まるちゃん担当
	}
	public void situmon6(){
		//ヒロキ担当
	}

}
