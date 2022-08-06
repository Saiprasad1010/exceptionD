package exceptionP;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Demo2 {
	
	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		try {
		FileInputStream v=new FileInputStream("d:/saiprasad.txt");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		}
	}


