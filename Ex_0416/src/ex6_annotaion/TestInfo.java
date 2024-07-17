package ex6_annotaion;

import static java.lang.annotation.ElementType.
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({TYPE, FIELD, TYPE_USE, METHOD})
@Retention(RUNTIME)
public @interface TestInfo {
	// 다른 곳에서 @TestInfo로 어노테이션을 사용할 수 있다.
	String[] value() default "정보 1";// 추상메서드
	String[] restTool() default "Info1";
	String tester();
	Datetim 

}
