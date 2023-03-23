package classesInternas.test;

public class OuterClassesTest03 {
    private String name =  "Fernando";
    static class Nested {
        private String lastName = "Amorim";
        void print(){
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();

    }
}
