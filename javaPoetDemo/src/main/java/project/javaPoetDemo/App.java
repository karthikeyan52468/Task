package project.javaPoetDemo;

import java.io.File;
import java.io.IOException;

import javax.lang.model.element.Modifier;

import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	FieldSpec f1 = FieldSpec.builder(int.class,"a",Modifier.PUBLIC)
    			.initializer("10")
    			.build();
        MethodSpec main = MethodSpec.methodBuilder("main")
        	.addModifiers(Modifier.PUBLIC,Modifier.STATIC)
        	.addParameter(String[].class,"args")
        	.addStatement("$T age = $L",int.class,18)
        	.beginControlFlow("if(age>=18)")
        	.addStatement("$T.out.println($S)",System.class,"you are eligible")
        	.nextControlFlow("else")
        	.addStatement("$T.out.println($S)",System.class,"you are not eligible")
        	.endControlFlow()
        	.returns(void.class)
        	.addStatement("$T.out.println($S)",System.class,"helloworld")
        	.build();
        
        TypeSpec myclass =TypeSpec.classBuilder("Myclass")
        		.addModifiers(Modifier.PUBLIC)
        		.addField(f1)
        		
        		.addMethod(main)
        		.build();
        
        JavaFile javaFile= JavaFile.builder("project.javaPoetDemo", myclass)
        		.build();
        javaFile.writeTo(new File("src/main/java"));
        		
    }
}
