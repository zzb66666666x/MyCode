package hello;

class helloclass{
    public void test(){
        System.out.println("the helloclass within hello.java");
    }
} 

public class Hello {
    private static String info = new String("I am in the main of Hello");

    public static String getValue(){
        return info;
    }

    public static void main(String[] args){
        System.out.println("I am in the main of Hello");
    }
}