package samples.exception.nullpointer;

public class NullPointer4 {
	public static void main(String[] args){
		try{
			Person p=new Person();
			System.out.println(p.name.length());
		}catch(Exception e){
			System.out.println("氏名の長さを表示する処理において、例外が発生しました。");
		}
		System.out.println("名前の処理が終了しました。");
	}
}
