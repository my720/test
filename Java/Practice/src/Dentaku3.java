
public class Dentaku3 {
	public static void main(String args[]){
		int val1=0;
		int val2=0;
		String ope;

		if(args.length != 3){
			System.out.println("Usage : java dentaku 数値 演算子 数値");
			System.out.println("演算子は kake waru tasu hiku の4つです");
			System.exit(0);
		}

		try{
			val1=Integer.parseInt(args[0]);
			val2=Integer.parseInt(args[2]);
		}catch(NumberFormatException e){
			System.out.println("Usage : java dentaku 数値　演算子 数値");
			System.out.println("数値でない値が入力されています");
			System.exit(0);
		}
		ope=args[1];

		String opeStr[]={"kake","waru","tasu","hiku"};
		boolean errFlag=true;

		for(int i=0;i<4;i++){
			if(ope.equals(opeStr[i])){
				errFlag=false;
			}
		}
		if(errFlag == true){
			System.out.println("演算子は kake waru tasu hiku の4つです");
			System.exit(0);
		}
		System.out.println("入力された式は"+val1+""+ope+""+val2+" です");
	}
}