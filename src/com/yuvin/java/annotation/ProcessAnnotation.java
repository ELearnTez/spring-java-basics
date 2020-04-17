package com.yuvin.java.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class ProcessAnnotation {

	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException
	   {
	      new Test1();
	      Class<Test1> demoClassObj = Test1.class;
	      readAnnotationOn(demoClassObj);
	      Method method = demoClassObj.getMethod("sayHello", new Class[]{});
	      readAnnotationOn(method);
	   }
	 
	static void readAnnotationOn(AnnotatedElement element)
	   {
	      try
	      {
	         System.out.println("\n Finding annotations on " + element.getClass().getName());
	         Annotation[] annotations = element.getAnnotations();
	         for (Annotation annotation : annotations)
	         {
	            if (annotation instanceof Test1)
	            {
	            	Author fileInfo = (Author) annotation;
	               System.out.println("Author :" + fileInfo.author());
	               System.out.println("Version :" + fileInfo.version());
	            }
	         }
	      } catch (Exception e)
	      {
	         e.printStackTrace();
	      }
	   }
}
