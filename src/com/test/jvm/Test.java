package com.test.jvm;

import java.lang.reflect.Method;

public class Test {
	
	public String abc() {
		return "123";
	}
	
	public Object toInvoke() throws Exception {
		Class<?> clz = Class.forName("Test");
		Object o = clz.newInstance();
		Method m = clz.getMethod("abc", String.class);
		Object val = m.invoke(this);
		return val;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(new Test().toInvoke());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
