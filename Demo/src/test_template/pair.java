package test_template;

public class pair<K,V> {
    private K key;
    private V value;

    public pair(K a, V b){
        key = a;
        value = b;
    }

    public V getValue(){
        return value;
    }

    public void setValue(V v){
        value = v;
    }

    public K getKey(){
        return key;
    }

    public void setKey(K k){
        key = k;
    }

    public void show(){
        System.out.println("("+key+" , "+value+")");
    }
}