
package org.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MyDslStandaloneSetup extends MyDslStandaloneSetupGenerated{

	public static void doSetup() {
		new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

