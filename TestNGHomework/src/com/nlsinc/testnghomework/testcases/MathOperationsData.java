package com.nlsinc.testnghomework.testcases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class MathOperationsData {
	
	@DataProvider (name = "BinaryData")
	public static Object[][] getBinaryData(Method method){
		Object[][] data = new Object[2][3];
		if (method.getName() == "addTest"){
			String fileName = "C:\\NewCDrive\\addData.csv"; //1 slash - escape sequence, 2 slashes - actual slash value
			try {
				FileReader dFile = new FileReader(fileName);
				BufferedReader f = new BufferedReader(dFile);
				String line = null;
				int counter = 0;
				while ((line = f.readLine()) != null){
					String[] str = line.split(",");
					for (int i = 0; i < str.length; i++){
						data[counter][i] = Integer.valueOf(str[i]);
					}
					counter++;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (method.getName() == "subtractTest"){
			Object[][] dataCopy = {{4, 2, 2}, {12, 4, 8}};
			data = dataCopy;
		} else if (method.getName() == "multiplyTest"){
			Object[][] dataCopy = {{4, 2, 8}, {12, 4, 48}};
			data = dataCopy;	
		} else if (method.getName() == "divideTest"){
			Object[][] dataCopy = {{4, 2, 2}, {12, 4, 3}};
			data = dataCopy;	
		}
		return data;
	}

}
