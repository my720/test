public class Test{
	public static void main(String[]args){
		TestuserDAO dao=new TestuserDAO();
		dao.select("taro", "123");
		dao.selectAll();
		dao.SelectByName("taro");
		dao.SelectByPassWord("789");
		dao.updateUserNameByUserName("","");
		dao.insert(4, "shiro", "012");
		dao.delete("jiro");
	}
}