import hello.Hello;
import java.util.Scanner;   
/*
Java的实用工具类库java.util包。
在这个包中，Java提供了一些实用的方法和数据结构。
例如，Java提供日期(Data)类、日历(Calendar)类来产生和获取日期及时间，
提供随机数(Random)类产生各种类型的随机数，
还提供了堆栈(Stack)、向量(Vector) 、位集合(Bitset)以及哈希表(Hashtable)等类来表示相应的数据结构
*/

public class test {
    public static void main(String[] args){
        Hello.main(args);
        //testing input
        Scanner in = new Scanner(System.in);
        System.out.println("2+3="+5);
        int price;
        int amount1 = 10, amount2 = 20;
        price = in.nextInt();
        System.out.println("100 - "+ price+" = " + (100-price));
        System.out.println("amount1+amount2=" + (amount1 + amount2));
        final int const_vatiable = 666; //const variable
        System.out.println("the variable is: "+const_vatiable);
        in.close();

        //floating number
        System.out.println(10/3);
        System.out.println(10.0/3);
        System.out.println(10/3.0);
        System.out.println(10.0/3.0);
    }
}