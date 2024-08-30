package in.suresh.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	
public static void main(String[] args) {
        
        Map<String, List<String>> map = new HashMap<>();
        List<String> list = Arrays.asList("20", "21", "22", "23", "24");
        List<String> list1 = Arrays.asList("30", "31", "32", "33", "34");
        List<String> list2 = Arrays.asList("40", "41", "42", "43", "44");
        List<String> list3 = Arrays.asList("30", "31", "32", "33", "34");
        
        Map<String, List<List<String>>> duplicateMap = new LinkedHashMap<>();
        
        addToDuplicateMap(duplicateMap, "1000", list);
        addToDuplicateMap(duplicateMap, "1001", list1);
        addToDuplicateMap(duplicateMap, "1002", list2);
        addToDuplicateMap(duplicateMap, "1000", list3);
        
        duplicateMap.forEach((key, value) -> {
            String values = value.stream()
                .map(innerList -> String.join("", innerList))
                .collect(Collectors.joining(""));
            System.out.println(key + " -> " + values);
        });
    }
    
    private static void addToDuplicateMap(Map<String, List<List<String>>> duplicateMap, String key, List<String> list) {
        duplicateMap.computeIfAbsent(key, k -> new ArrayList<>()).add(list);
    }

	/*
	 * public static void main(String[] args) {
	 * 
	 * Map<String, List<String>> map = new HashMap<>(); List<String> list =
	 * Arrays.asList("20", "21", "22", "23", "24"); List<String> list1 =
	 * Arrays.asList("30", "31", "32", "33", "34"); List<String> list2 =
	 * Arrays.asList("40", "41", "42", "43", "44"); List<String> list3 =
	 * Arrays.asList("30", "31", "32", "33", "34");
	 * 
	 * 
	 * map.put("1000", list); map.put("1001", list1); map.put("1002", list2);
	 * map.put("1000", list3);
	 * 
	 * 
	 * map.computeIfAbsent("1000", k -> new ArrayList<>()).add(list);
	 * map.computeIfAbsent("1001", k -> new ArrayList<>()).add(list1);
	 * map.computeIfAbsent("1002", k -> new ArrayList<>()).add(list2);
	 * map.computeIfAbsent("1000", k -> new ArrayList<>()).add(list3);
	 * map.entrySet().stream().filter(entry ->
	 * map.containsKey(entry.getKey())).forEach(entry -> { String key =
	 * entry.getKey(); String value = String.join("", entry.getValue());
	 * System.out.println(key + " -> " + value); });
	 * 
	 * }
	 */
}
