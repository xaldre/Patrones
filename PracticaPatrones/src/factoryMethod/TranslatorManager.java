package factoryMethod;

import java.util.ArrayList;

public class TranslatorManager implements Translatable {
	AbstractTranslator translator;
	Printer printer = new Printer();

	public TranslatorManager(AbstractTranslator translator) {
		super();
		this.translator = translator;
	}

	@Override
	public ArrayList<String> translate(int[] elements) {
		return translator.translate(elements);
	}
	
	

}
