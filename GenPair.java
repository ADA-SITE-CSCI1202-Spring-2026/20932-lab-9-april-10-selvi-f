class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
}

public class GenPair {

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Age", 20);
        Pair<Integer, String> p2 = new Pair<>(1, "Java");
        System.out.println(p1.getKey() + " " + p1.getValue());
        System.out.println(p2.getKey() + " " + p2.getValue());
    }
}