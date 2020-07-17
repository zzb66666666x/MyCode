package clock;

public class Clock {
    private Display hour = new Display(24);
    private Display minute = new Display(60);

    public void start(int times){
        while (times>0){
            minute.increase();
            if (minute.getValue() == 0){
                hour.increase();
            }
            System.out.printf("%02d:%02d\n",hour.getValue(), minute.getValue());
            times--;
        }
    }

    public static void main(String[] args){
        Clock clk = new Clock();
        clk.start(100);   //unit: minute
    }
}