package UserDefineException;
//Unchecked
public class InsufficientBalance extends RuntimeException{
	public InsufficientBalance(String msg) {
		System.out.println(msg);
	}

}
