
public class Test {

	public static void main(String[] args) {

		Person taro = new Person();

		taro.name="山田太郎";

		taro.age=20;

		//演習④
		taro.phoneNumber = "";

		taro.address="";
		//演習④ここまで

		System.out.println(taro.name);

		System.out.println(taro.age);

       //演習⑥
		taro.talk();

		taro.walk();

		taro.run();

		//ここまで演習⑥


		Person ziro = new Person();

		ziro.name="木村次郎";

		ziro.age=18;

		//演習④
		ziro.phoneNumber="";

		ziro.address="";
		//演習④ここまで

		System.out.println(ziro.name);

		System.out.println(ziro.age);


		Person hanako = new Person();

		hanako.name="鈴木花子";

		hanako.age=16;

		//演習④
		hanako.phoneNumber="";

		hanako.address="";
		//演習④ここまで

		System.out.println(hanako.name);

		System.out.println(hanako.age);



		Person yuuta = new Person();

		yuuta.name="水澤雄太";

		yuuta.age=21;

		//演習④
        yuuta.phoneNumber="";

        yuuta.address="";
      //演習④ここまで

		System.out.println(yuuta.name);

		System.out.println(yuuta.age);

        //演習⑧

		Robot aibo = new Robot();

		aibo.name="aibo";

		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo = new Robot();

		asimo.name="asimo";

		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot papper = new Robot();

		papper.name="papper";

		papper.talk();
		papper.walk();
		papper.run();


	}

}
