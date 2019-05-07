import java.util.ArrayList;
import java.util.List;

public class ListPractice {
	public static void main(String[]args){
		List<Person> personList=new ArrayList<Person>();

		//インスタンス①
		Person sato=new Person();
		sato.name="sato";
		sato.age=28;
		personList.add(sato);
		//

		//インスタンス②
		Person monzen=new Person();
		monzen.name="monzen";
		monzen.age=22;
		personList.add(monzen);
		//

		//インスタンス③
		Person suzuki=new Person();
		suzuki.name="suzuki";
		suzuki.age=31;
		personList.add(suzuki);
		//

		//確認
		/*System.out.println(sato.name+"は"+sato.age+"才");//fieldに値は入ってる
		for(int i=0;i<personList.size();i++){
			System.out.println(personList.get(i));
		}*/
		//

		for(Person p:personList){
			System.out.println(p.name+"は"+p.age+"才");
		}
		System.out.println("1件目は"+sato.name+"さんです");
	}
}
