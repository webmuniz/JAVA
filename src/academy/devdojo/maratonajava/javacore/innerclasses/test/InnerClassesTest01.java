package academy.devdojo.maratonajava.javacore.innerclasses.test;

public class InnerClassesTest01 {
    private String name = "Monkey D. Luffy";
    //Nested
    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);//Intern object
            System.out.println(InnerClassesTest01.this);//Extern object
        }
    }
    
    public static void main(String[] args) {
        InnerClassesTest01 innerClass = new InnerClassesTest01();
        Inner inner = innerClass.new Inner();
        Inner inner2 = new InnerClassesTest01().new Inner();

        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
