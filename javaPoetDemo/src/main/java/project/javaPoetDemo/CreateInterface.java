package project.javaPoetDemo;

import java.io.File;
import java.io.IOException;

import javax.lang.model.element.Modifier;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

public class CreateInterface {

	public static void main(String[] args) throws IOException {
	
		
		MethodSpec m1=MethodSpec.methodBuilder("add")
				.addModifiers(Modifier.ABSTRACT)
				.returns(void.class)
				.addParameter(int.class,"a")
				.addParameter(int.class,"b")
				.build();
		TypeSpec I1=TypeSpec.interfaceBuilder("Abc")
				.addModifiers(Modifier.PUBLIC)
				.addMethod(m1)
				.build();
		
		JavaFile javaFile=JavaFile.builder("project.javaPoetDemo",I1).build();
		javaFile.writeTo(new File("src/main/java"));
	}
}
