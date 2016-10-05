package br.com.pageobjects.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ OmayoTestAlert.class, OmayoTestRadioButton.class, OmayoTestComboBox.class,
	OmayoTestButton.class})
public class AllTests {

}
