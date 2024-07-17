package ex6_annotaion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(METHOD)
@Retention(RetentinoPolicy.RUNTIME)
public @interface Datetime {
	String date();
	String  
}
