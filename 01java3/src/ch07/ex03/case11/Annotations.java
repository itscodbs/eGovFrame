package ch07.ex03.case11;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface TypeAnnotation{
	String name();
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MethodAnnotation{
	String name();
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@interface ParameAnnotation{
	String name();
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface FieldAnnotation{
	String name();
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Field2Annotation{
	String name();
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.PARAMETER,ElementType.FIELD})
@interface AllAnnotation{
	String id();
	String pw();
}

// key명이 value 일 때는 사용 시, key명을 생략할 수 있다.
// value key의 값을 꼭 지정해야 하며, dedault를 이용할 수 있다.
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ValueAnnotation{
	String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ValueAnnotation2{
	String value() default"";
}

public class Annotations {

}
