package test_template;

public class list{
    @SafeVarargs
    public static <T> T[] get(T... args){
        return args;
    }
}