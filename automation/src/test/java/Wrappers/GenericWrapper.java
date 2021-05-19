package Wrappers;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import Pages.Base;

public class GenericWrapper extends Base {

	public static String randomStringGenerator(int length) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(index);
			sb.append(randomChar);
		}
		return sb.toString();
	}

	public static void takeScreenShot() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		fileName=randomStringGenerator(8);
		File dest = new File("C:\\Users\\bhara\\eclipse-workspace\\automation\\target\\" + fileName + ".png");
		FileHandler.copy(src, dest);
	}

}
