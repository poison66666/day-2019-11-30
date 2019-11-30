import java.util.*;

public class CalcCount {
    public static Map<Integer,Integer> calcCount(int[] nums) {
        Map<Integer,Integer> map = new TreeMap<>();
        for(int n : nums){
            int c = map.getOrDefault(n,0);
            map.put(n,c+1);
        }
        return map;
    }

    public static Map<String,Integer> clacCount2(String[] words) {
        Map<String, Integer> map = new TreeMap<>();
        for (String m : words) {
            int c = map.getOrDefault(m, 0);
            map.put(m, c + 1);
        }
        return map;
    }

    public static Map<Integer,List<String>> calcCountOfWords(Map<String,Integer> map){
        Map<Integer,List<String>> ret = new HashMap<>();
        for(Map.Entry<String,Integer> e : map.entrySet()) {
            String word = e.getKey();
            int count = e.getValue();
            if (!ret.containsKey(count)) {
                ret.put(count, new ArrayList<>());
            }
            ret.get(count).add(word);
        }
        return ret;
     }

    public int singleNumber(int[] nums){
        Map<Integer,Integer> map = new TreeMap<>();
        for(int n : nums) {
            int i = map.getOrDefault(n,0);
            map.put(n,i+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()) {
            int n = e.getKey();
            int c = e.getValue();
            if(c == 1){
                return n;
            }
        }
        return -1;
    }

    public int singleNumber2(int[] nums) {
        int r = 0;
        for(int n : nums){
            r = n^r;
        }
        return r;
    }

    public static void main(String[] args) {
        /*int[] nums = {2,1,2,3,9,1,3,9,8};
        Map<Integer,Integer> map = calcCount(nums);
        System.out.println(map);
        System.out.println(new CalcCount().singleNumber(nums));
        System.out.println(new CalcCount().singleNumber2(nums));*/
        String[] words = {"this","is","this","one","apple","one"};
        Map<String,Integer> c = clacCount2(words);
        System.out.println(c);//获取次数

    }
}
