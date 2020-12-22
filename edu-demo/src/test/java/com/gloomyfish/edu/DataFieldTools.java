package com.gloomyfish.edu;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class DataFieldTools {
	public static String objString(Object vo, String key) {
		if (vo == null) {
			return "";
		}
		if (vo instanceof Map) {
			Object obj = getMapData(vo, key);
			return objToString(obj);
		}
		try {
			return objToString(getObjData(vo, key));
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return "";		
	}

	public static String objToString(Object obj) {
		/*if (vo instanceof Integer) {
		NumberFormat nf = new NumberFormat();
		}
		NumberFormat
		DecimalFormat
		SimpleDateFormat
		...;*/
		return obj.toString();
	}

	public static Integer objInteger(Object vo, String key) {
		if (vo == null) {
			return 0;
		}
		if (vo instanceof Map) {
			Object obj = getMapData(vo, key);
			return objToInt(obj);
		}
		try {
			return objToInt(getObjData(vo, key));
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static Object getObjData(Object vo, String key) throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		if (vo == null) {
			return null;
		}
		String upperChar = key.substring(0, 1).toUpperCase();
		String anotherStr = key.substring(1);
		String methodName = "get" + upperChar + anotherStr;
		Method method = vo.getClass().getMethod(methodName, new Class[] {});
		method.setAccessible(true);
		return method.invoke(vo, new Object[] {});
	}

	public static Integer objToInt(Object obj) {
		if (obj == null) {
			return 0;
		}
		if (obj instanceof Integer) {
			return (Integer) obj;
		}
		return Integer.valueOf(obj.toString());
	}

	public static Double objToDouble(Object obj) {
		if (obj == null) {
			return 0d;
		}
		if (obj instanceof Double) {
			return (Double) obj;
		}
		return Double.valueOf(obj.toString());
	}
	
	public static Object getMapData(Object vo, String key) {
		if (vo == null) {
			return null;
		}
		Map map = (Map)vo;
		return map.get(key);
	}
}
