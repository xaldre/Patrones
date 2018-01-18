package factoryMethod;

import java.util.ArrayList;

public class SpanishTranslator extends AbstractTranslator {
	String[] letterList = { "Uno", "Dos", "Tres", "Cuatro", "Cinco" };

	public SpanishTranslator() {
		fillDictionary();
	}

	private void fillDictionary() {
		for (int i = 0; i < letterList.length; i++) {
			dictionary.put(i, letterList[i]);
		}
	}

	@Override
	public ArrayList<String> translate(int[] elements) {
		ArrayList<String> output = new ArrayList<String>();
		for (int i : elements) {
			output.add(dictionary.get(i));
		}
		return output;
	}

}
