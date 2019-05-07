package samples.exception.nullpointer;

public class Nullpointer {
	public static void main(String[]args){
		try{
			String s=null;
			//Sに具体的な文字列がセットされていない状態で、
			//sのメソッドを呼び出します。
			System.out.println(s.length());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
