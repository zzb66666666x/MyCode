package clock;

public class Display {
    private int limit = 0;
    private int value = 0;

    public Display(int val){	//构造函数
        this.limit = val;
    }
    public void increase(){
        value++;
        if (value == limit){
            value = 0;
        }
    }
    public int getValue(){
        return value;
    }

    public static void main(String[] args){
        Display display = new Display(24);
		for (;;) //infinite loop
        {
            display.increase();
            System.out.println(display.getValue());
        }
    }
}