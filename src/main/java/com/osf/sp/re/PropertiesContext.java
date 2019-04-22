package com.osf.sp.re;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class PropertiesContext {

	static Map<String, Object> ac = new HashMap<String, Object>();

	public static void main(String[] args) {
		InputStream is = PropertiesContext.class.getResourceAsStream("/");
		Properties p = new Properties();
		try {
			p.load(is);
			Iterator<Object> it = p.keySet().iterator();
			while(it.hasNext()) {
				String key= it.next();
				String className = p.getProperty(key.toString());
				System.out.println("key :" + className);
				Class clazz = Class.forName(className);
				ac.put(key, clazz.newInstance());
			
		}
		}
	}
}
