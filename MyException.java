package efrge;

public class MyException extends Throwable {
	@Override
	public String getMessage() {
		return "myexception";
	}
}
