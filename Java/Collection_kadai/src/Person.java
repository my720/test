
public class Person {
	//フィールド
	public String name=null;
	public int age=0;
	//コンストラクタ
	public Person(){}

	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	//getter、setter
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
}