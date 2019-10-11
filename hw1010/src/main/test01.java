package main;

import java.util.Iterator;
import java.util.Properties;

import x.y.Prop;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prop property=new Prop();
		Properties prop=new Properties();
		prop.setProperty("key", "value"); //본인꺼 -> 이걸 사용하는게 더 좋다
		prop.put("server", "192.168.1.100"); //부모 클래스꺼
		prop.put("timeout", "5000");
		
		//property.setProp(prop);
		
		//System.out.println(prop);
		
		for(String name:prop.stringPropertyNames()) {
			System.out.println(name+":"+prop.getProperty(name));
		}
	}

}
