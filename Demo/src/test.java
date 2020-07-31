import hello.*;
import java.util.Scanner;  
import formatting_print.*; 
import test_template.*;
import clock.*;

class TestClass{
    public int variable = 10;

    public static void main(final String[] args){
    }

    TestClass(){
    }

    TestClass(final int val){
        variable = val;
    }
};

public class test {

    public static void f(){
        System.out.println("Inside the function f()");
    }

    public static void swap_index(final int[] array, final int a, final int b){
        final int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(final String[] args){
        //Main program starts here
        final Scanner in = new Scanner(System.in);
        //testing import 
        final String helloinfo = Hello.getValue();
        System.out.println(helloinfo);
        //error: helloclass.test();
        //testing input
        // System.out.println("2+3="+5);
        // int price;
        // int amount1 = 10, amount2 = 20;
        // price = in.nextInt();
        // System.out.println("100 - "+ price+" = " + (100-price));
        // System.out.println("amount1+amount2=" + (amount1 + amount2));
        // final int const_vatiable = 666; //const variable
        // System.out.println("the variable is: "+const_vatiable);

        //floating number
        // System.out.println(10/3);
        // System.out.println(10.0/3);
        // System.out.println(10/3.0);
        // System.out.println(10.0/3.0);

        //the test of formatting print
        TestPrint.printall();

        //test of calculating gcd: greatest common divisor
        // int a = 12;
        // int b = 21;
        // int temp1, temp2;
        // temp1 = a; temp2 = b;
        // int ans = 1;
        // if (a<b){
        //     int temp = a;
        //     a = b;
        //     b = temp;
        // }
        // while (a!=b){
        //     while (a>b){
        //         a = a-b;
        //     }
        //     int new_b = a;
        //     a = b;
        //     b = new_b;
        // }
        // ans = a;
        // System.out.printf("the gcd of %d and %d is: %d\n", temp1, temp2, ans);

        //testing the life cycle of variables in java
        // int outside_bracket = 10;
        // if (true){
        //     int inside_bracket = 15;
        //     System.out.println("the inside_bracket is: "+inside_bracket);
        // }
        // System.out.println("the outside_bracket is: "+outside_bracket);
        //System.out.println("the inside_bracket is: "+inside_bracket);
        //this sentence is invalid because the variable will only exist in the {}

        //test of array
        System.out.printf("I am testing array in java now\n");
        //dynamic allocation of array
        final int [] array1 = new int[10];
        final int array2[] = new int[10]; 
        array1[0] = 666;
        array2[0] = 6666;
        System.out.println(array1[0]);
        System.out.println(array2[0]);
        //static allocation of array
        final int array3 [] = new int[] {10,11,12,13};
        final int array4[] = {1,2,3,4,5};
        System.out.println("array3 has [0] and [3] as "+array3[0]+","+array3 [3]);
        System.out.println("array4 has [0] and [4] as "+array4[0]+","+array4 [4]);
        System.out.println("array4 has length: " + array4.length);

        //new test of strings
        char c1 = '汉';	//Unicode编码，可以识别汉字
        final char c2 = 'h';

        System.out.println(c1);
        System.out.println(c2);
        char c3 = 'A';
        c3++;
        System.out.println(c3);
        //false: c1 = c1+1;
        c1++;
        //有理由推测这个++运算符根据数据类型被重载过
        //c1 = c1+1会提示类型不对！！！
        System.out.println(c1);

        System.out.println("Conversion");
        final int temp = ('a' - 'A');
        final char testout = (char)('B'+ temp);
        System.out.println(testout);
        System.out.println((char)(80));

        System.out.println("Make Table: ");
        System.out.println("abc\t123");
        System.out.println("a\t1");
        
        //test string
        String s1;
        //String s2 = new String("555");

        s1 = "This is the test of string s1!";
        //s2 = in.nextLine();

        System.out.println(s1);
        //System.out.println(s2);
        s1 += " I want to knwo whether I can extend this string.";
        System.out.println(s1);
        //System.out.println(s1[0]);
        System.out.println(s1.charAt(0));
        //this is the test of 

        System.out.println(s1.indexOf("This"));
        System.out.println(s1.indexOf("strng"));

        s1 = s1.toUpperCase();
        System.out.println(s1);
        in.close();

        //test using functions 
        f();
        final int [] array = new int[] {1,2,3,4,5,6};
        swap_index(array, 0, 5);
        for (int i = 0; i<array.length; i++){
            System.out.printf("%d ",array[i]);
        }
        System.out.println();


        //test classes
        final TestClass test_class_ins = new TestClass(1000000);
        System.out.println(test_class_ins.variable);

        //test clock
        System.out.println();
        final Clock clk = new Clock();
        clk.start(10);

        //test of using template
        //don't use int, use Integer to specify the type
        //the type to specify the template should be the wrapper classes
        pair<Integer,Float> p = new pair<Integer, Float>(1,1.1f);
        p.show();

        Foo foo = new Foo();
        foo.<String>show("test", "ing...");
    };
};