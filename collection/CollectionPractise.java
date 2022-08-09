import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;


/**
 * CollectionPractise
 */
public class CollectionPractise {

    public static void main(String[] args) {
        //map的实现类
        //treemap
        TreeMap<Integer, Integer> treemap = new TreeMap<Integer, Integer>();
        treemap.put(1,1);
        treemap.get(1);
        //hashmap
        HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("name", "1");
        hashmap.get("name");
        //linkedhashmap
        LinkedHashMap<Integer, Integer> linkedhashmap = new LinkedHashMap<Integer, Integer>();
        linkedhashmap.put(1,1);
        linkedhashmap.get(1);
        //set的实现类
        HashSet<Integer> hashset = new HashSet<Integer>();
        hashset.add(1);
        TreeSet<Integer> treeset = new TreeSet<Integer>();
        treeset.add(1);
    }
}