package ex6_annotaion;

// ㅅㅂ ㅈ새끼 ㅈ혼자 한다 동영사 ㅇ 처바라

import java.util.Arrays;

@TestInfo(tester = "홍길"
// value = 을 통해서 TestInfo의 value()메서드에 정보가 저장된다.
// value = 은 생략이 가능하다.
public class Ex1_annotation {
	public static void main(String[] args) {
		Annotation[] annos = Ex1_annotation.class.getAnnotatedInterfaces();
		
		for(Annotation anno : annos) {
			System.out.println(anno);
		}
		
		TestInfo testInfo = Ex1_annotation.class.getAnnotation(TestInfo.class);
		String[] arr = testInfo.value();
		System.out.println(Arrays.toString(tools));		
		for(String s : arr) {
			System.out.println(s);
		}
	}
}
