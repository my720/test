package samples.exception.nullpointer;

public class Nullpointer2 {
	public static void main(String args[]){
		try{
			Person p=new Person();
			//Personオブジェクトのnameフィールドの
			//文字数を表示します。
			System.out.println(p.name.length());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
