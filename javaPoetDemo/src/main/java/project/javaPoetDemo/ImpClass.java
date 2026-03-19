package project.javaPoetDemo;

import java.io.File;
import java.io.IOException;

import javax.lang.model.element.Modifier;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

public class ImpClass {

	public static void main(String[] args) throws IOException {
		MethodSpec constructor = MethodSpec.constructorBuilder()
		        .addModifiers(Modifier.PUBLIC)
		        .addStatement("System.out.println($S)", "Constructor called")
		        .build();
	
	MethodSpec m1=MethodSpec.methodBuilder("add")
			.addModifiers(Modifier.PUBLIC)
			.addParameter(int.class,"a")
			.addParameter(int.class,"b")
			.addStatement("System.out.println(a+b)")
			.build();
	
	ClassName i1= ClassName.get("project.javaPoetDemo","Abc");
	TypeSpec ts = TypeSpec.classBuilder("ImpC")
			.addModifiers(Modifier.PUBLIC)
			.addSuperinterface(i1)
			.addMethod(constructor)
			.addMethod(m1)
			.build();
	
	JavaFile javaFile=JavaFile.builder("project.javaPoetDemo",ts).build();
	javaFile.writeTo(new File("src/main/java"));
	
	}
			
}