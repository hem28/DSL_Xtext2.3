/*
* generated by Xtext
*/
package org.xtext;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class MyDslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.ui.internal.MyDslActivator.getInstance().getInjector("org.xtext.MyDsl");
	}
	
}
