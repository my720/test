package samples.exception.nullpointer;

public class NullPointer5 {
	public static void main(String[] args){
		Person2 p1=new Person2("saitou");
		System.out.println(p1.getName().length());

		Person2 p2=new Person2();
		System.out.println(p2.getName().length());
	}
}
