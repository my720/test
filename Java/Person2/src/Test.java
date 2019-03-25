
public class Test {

	public static void main(String[]args){

		//コンストラクタ①を使ったインスタンス化
		Person taro = new Person();

		taro.name="taro";

		taro.age=18;

		System.out.println(taro.name);

		System.out.println(taro.age);
		//

		//コンストラクタ②を使ったインスタンス化
		Person jiro = new Person("jiro",20);

		System.out.println(jiro.name);

		System.out.println(jiro.age);
		//

		//演習⑤
		Person saburo = new Person("saburo");

		System.out.println(saburo.name);

		System.out.println(saburo.age);


		Person nanasi=new Person(25);

		System.out.println(nanasi.name);

		System.out.println(nanasi.age);


		Person hanako = new Person(17,"hanako");

		System.out.println(hanako.name);

		System.out.println(hanako.age);
	}
}
