package kdf;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application {

	@Test
	public void verifyInvalidLogin() throws IOException {
		String[][] data = GenericMethods.getData("D:\\SelOct25\\TestData.xlsx", "Sheet2");
		Methods mtd = new Methods();
		for(int i = 1;i<data.length;i++) {
			switch(data[i][3]) {
			//Making changes to the class after R1.1
			case "openBrowser":
				mtd.openBrowser();
				break;
			case "maxBrowser":
				mtd.maximizeBrowserWindow();
				break;
			case "impWait":
				mtd.implementImplicitWait();
				break;
			case "navigateToAUT":
				mtd.navigateToApplication(data[i][6]);
				break;
			case "enterInTextBox":
				mtd.enterValueInTextBox(data[i][5], data[i][6]);
				break;
			case "clickButton":
				mtd.clickAButton(data[i][4],data[i][5]);
				break;
			case "verifyErrMsg":
				String actualText = mtd.getErrMsg(data[i][4],data[i][5]);
				String expectedText = data[i][6];
				Assert.assertEquals(actualText, expectedText);
				break;
			case "closeApp":
				mtd.closeApplication();
				break;
			
			}
		}
	}
}
