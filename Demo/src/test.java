import hello.Hello;
import java.util.Scanner;  
import formatting_print.test_print; 
/*
Java的实用工具类库java.util包。
在这个包中，Java提供了一些实用的方法和数据结构。
例如，Java提供日期(Data)类、日历(Calendar)类来产生和获取日期及时间，
提供随机数(Random)类产生各种类型的随机数，
还提供了堆栈(Stack)、向量(Vector) 、位集合(Bitset)以及哈希表(Hashtable)等类来表示相应的数据结构
*/

public class test {
    public static void main(String[] args){
        //Scanner in = new Scanner(System.in);
        //testing import 
        Hello.main(args);

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
        test_print.main(args);

        //testing of if-else, while and for loops
        //two ways of computing factorial
        //int n = in.nextInt();
        //in.close();
        int n = 15;
        int i = 1;
        int factorial = 1;
        while (i <= n){
            factorial = factorial * i;
            i++;
        }
        System.out.println("the answer of "+n+"! is :"+factorial);
        factorial = 1;
        for (i = 1; i<=n; i++){
            factorial = factorial * i;
        }
        System.out.println("the answer of "+n+"! is :"+factorial);
        System.out.println("end of testing the loops");

        //test of calculating gcd: greatest common divisor
        int a = 12;
        int b = 21;
        int temp1, temp2;
        temp1 = a; temp2 = b;
        int ans = 1;
        if (a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        while (a!=b){
            while (a>b){
                a = a-b;
            }
            int new_b = a;
            a = b;
            b = new_b;
        }
        ans = a;
        System.out.printf("the gcd of %d and %d is: %d\n", temp1, temp2, ans);

        //testing the life cycle of variables in java
        int outside_bracket = 10;
        if (true){
            int inside_bracket = 15;
            System.out.println("the inside_bracket is: "+inside_bracket);
        }
        System.out.println("the outside_bracket is: "+outside_bracket);
        //System.out.println("the inside_bracket is: "+inside_bracket);
        //this sentence is invalid because the variable will only exist in the {}

        //test of array
        

    }
}