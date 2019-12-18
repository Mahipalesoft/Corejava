import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable {
	
	
	int i=10;
	int j=20;
}

public class Serializationdemo {

	public static void main(String[] args) {
		
		Test t=new Test();
		
	//Serialization means converting state of object in to a file 
		try {
			FileOutputStream fos=new FileOutputStream("sdemo.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(t);
			oos.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
