package UserDefineException;
//Checked
public class InvalidAmount extends Exception{
	public InvalidAmount(String msg) {
	  System.out.println(msg);
    }
}