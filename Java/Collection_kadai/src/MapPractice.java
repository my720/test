import java.util.HashMap;
import java.util.Map;


public class MapPractice {
	public static void main(String[]args){
		Map<String,Person> personMap=new HashMap<String,Person>();
		//(1)
		Person sato=new Person();
		sato.name="sato";
		sato.age=28;
		personMap.put("sato", sato);

		Person monzen=new Person();
		monzen.name="monzen";
		monzen.age=22;
		personMap.put("monzen", monzen);

		Person suzuki=new Person();
		suzuki.name="suzuki";
		suzuki.age=31;
		personMap.put("suzuki", suzuki);
		//

		//(2)
		if(!(personMap.get("monzen").equals(null))){
			System.out.println(monzen.name+"さんはいます");
		}else{
			System.out.println(monzen.name+"さんはいません");
		}
		//
		System.out.println(suzuki.age+"才が最年長です");

		//getvalueでの値の取り出し
		for(Map.Entry<String, Person>e:personMap.entrySet()){
			System.out.println(e.getValue().name+"は"+e.getValue().age+"才");
		}
	}
}
