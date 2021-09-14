package test1;

import org.testng.annotations.Test;

public class DataProvider {

	@Test(dataProvider = "DataCase")
	public void test1(String a , String b , String c) {

		System.out.println(a  );
	}

	@org.testng.annotations.DataProvider(name = "DataCase")

	public Object method1() {
		
		Object [][] obj = {  {"SHAMS" ,"JAPA" ,"CHINA" }, 
				{"HP" ,"DELL" , "PHP" },{"INDIA" , "IRAN " , "FORD " } };
 		

		/*
		 * Object[][] obj = new Object[3][2];
		 * 
		 * obj[0][0] = "HP"; obj[0][1] = "Lenovo"; obj[0][2] = "Dell"; obj[1][0] =
		 * "Ford"; obj[1][1] = "SPectra"; obj[1][2] = "Japan"; obj[2][0] = "German";
		 * obj[2][1] = "USA"; obj[2][2] = "ITALY";
		 */

		return obj;

	}

}
