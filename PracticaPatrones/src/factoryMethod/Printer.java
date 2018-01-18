package factoryMethod;

public class Printer implements MyPrintable{

	public void print(String[] elements) {
		for (String string : elements) {
			System.out.println(string);
		}
	}

}
