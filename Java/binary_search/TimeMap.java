
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Leetcode #981 Medium
 * Time Based Key-Value Store
 */
public class TimeMap {
    HashMap<String,ArrayList<ArrayList<Object>>> myMap; // key = string, value = list[list[string,int]]
    public TimeMap(){
        myMap = new HashMap<>();
    }

    public void set(String key, String value, int timeStamp){
        ArrayList<Object> list = new ArrayList<>();
        list.add(value);
        list.add(timeStamp);
        if(myMap.containsKey(key)){
            myMap.get(key).add(list);
        } else {
            ArrayList<ArrayList<Object>> outerList = new ArrayList<>();
            outerList.add(list);
            myMap.put(key,outerList);
        }
    }
    public String get(String key, int timeStamp){
        ArrayList<ArrayList<Object>> theList = new ArrayList<>();
        theList = myMap.get(key);
        int left = 0;
        if(theList == null){
            return "";
        }
        int right = theList.size() - 1;
        int middle = 0;
        int answerIndex = -1;
        while(left <= right){
            middle = (left + right)/2;
            if((int)theList.get(middle).get(1) <= timeStamp){
                answerIndex = middle;
                left = middle + 1;
            } else if ((int)theList.get(middle).get(1) > timeStamp){
                right = middle - 1;
            } else {
                return (String)theList.get(middle).get(0);
            }
        }
        return answerIndex == -1 ? ""
                : (String) theList.get(answerIndex).get(0);

    }
}
