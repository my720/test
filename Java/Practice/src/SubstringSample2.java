
public class SubstringSample2 {
	public static void main(String[] args){
		String str="壱234伍67890";
		System.out.println(String.format("取り出し前の文字列:%s", str));
		System.out.println("文字列の3文字目から7文字を取り出す->"+str.substring(2,7));
		System.out.println("文字列の2文字目から2文字目を取り出す->"+str.substring(1,2));
		System.out.println("文字列の3月文字目から3文字分を取り出す->"+str.substring(2,2+3));
		System.out.println(str.substring(0,10));
	}
}
