package day27_accessModifiers;

public class StaticBlock_vsInstanceBlock_vsConstructor {

    public StaticBlock_vsInstanceBlock_vsConstructor(){
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance Block");

    }

    static{
        System.out.println("Static Block");
    }

    public static void main(String[] args) {

        System.out.println("Main method");

        new StaticBlock_vsInstanceBlock_vsConstructor();
        new StaticBlock_vsInstanceBlock_vsConstructor();

    }

}
