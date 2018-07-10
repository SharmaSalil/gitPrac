package PageObjects;

import GenericFunctions.genericFunctions;
import Utils.config;

public class pomLanguageSwitch {
	
	genericFunctions generic;

	public pomLanguageSwitch() {
		generic = new genericFunctions(config.Driver_Type);
	}

}
