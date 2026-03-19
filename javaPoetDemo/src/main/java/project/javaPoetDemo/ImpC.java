package project.javaPoetDemo;

public class ImpC implements Abc {
  public ImpC() {
    System.out.println("Constructor called");
  }

  public void add(int a, int b) {
    System.out.println(a+b);
  }
}
