package factoryMethod;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class AbstractTranslator implements Translatable{

	protected HashMap<Integer, String> dictionary = new HashMap<Integer, String>();

	@Override
	 abstract public ArrayList<String> translate(int[] elements);

}
