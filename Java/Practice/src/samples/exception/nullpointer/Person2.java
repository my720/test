package samples.exception.nullpointer;

public class Person2 {
	private String name;

	public Person2(String name){
		setName(name);
	}

	public Person2(){
		this(null);
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		if(name == null){
			this.name="";
		}else{
			this.name=name;
		}
	}
}
