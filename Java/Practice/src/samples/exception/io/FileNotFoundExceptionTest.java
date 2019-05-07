package samples.exception.io;

import java.io.File;
import java.io.FileInputStream;

public class FileNotFoundExceptionTest {

	public static void main(String[] args) {
		try{
			File file=new File("C:/XXXXXXXXXX");
			System.out.println(file.exists());
			FileInputStream is=new FileInputStream(file);
			is.close();
		}catch(Exception e){
			e.printStackTrace();
		}

		try{
			File file=new File("C:/Program Files");
			System.out.println(file.exists());
			FileInputStream is=new FileInputStream(file);
			is.close();
		}catch (Exception e){
			e.printStackTrace();
		}

	}

}
