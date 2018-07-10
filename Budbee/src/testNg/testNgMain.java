package testNg;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;




public class testNgMain {

	public static void main(String[] args) {
		
		TestNG runner=new TestNG();
		 
		List<String> suitefiles=new ArrayList<String>();
		 
		suitefiles.add("testng.xml");
		 
		runner.setTestSuites(suitefiles);
		 
		runner.run();
		
	}

}
