package samples.exception.nullpointer;

public class NullPointer3 {
	public static void main(String args[]){
		try{
			Person p=new Person();
			if(p.name ==null){
				System.out.println("氏名がセットされていません");
			}else{
				System.out.println(p.name.length());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
