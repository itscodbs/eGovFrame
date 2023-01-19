package ch07.ex03.case11;

@TypeAnnotation(name="class", value=1)
public class MyClass {
	@MethodAnnotation(name="method", value=2)
	public void process(){}
	
	public void processParam(
			@ParamAnnotation(name="parameter1", value=31) String param,
			@ParamAnnotation(name="parameter2", value=32) Integer num){}
	
	@FieldAnnotation(name="field",value=41)
	@Field2Annotation(name="field", value=42)
	public String memberField;
}
