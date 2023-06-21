package Study;

import java.util.*;

enum Serial {
    FIRST,
    SECOND,
    THIRD,
}

class newMap<K, V> {
    private ArrayList<K> keys = new ArrayList<>();
    private ArrayList<V> values = new ArrayList<>();

    public void put(K k, V v) {
        this.keys.add(k);
        this.values.add(v);
    }

    public V get(K k) {
        int num = keys.indexOf(k);
        return this.values.get(num);
    }
}

public class Generics {
    public static void main(String[] args) {
        newMap<Serial, Integer> map = new newMap<>();
        map.put(Serial.FIRST,1);
        map.put(Serial.SECOND,2);
        map.put(Serial.THIRD,3);

        System.out.println(map.get(Serial.FIRST));
    }
}
