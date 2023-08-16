package com.khj.exam.demo.util;

public class Ut {
	public static boolean empty(Object obj) {
		if ( obj == null ) {
			return true;
		}
		
		if ( obj instanceof String == false ) {
			return true;
		}
		
		String  str = (String) obj;
		
		return str.trim().length() == 0;
	}

	public static String f(String format, Object... arges) {
		return String.format(format, arges);
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> 6b60241b4e7e2dd75d80f5707fd0aadee3e5b012
