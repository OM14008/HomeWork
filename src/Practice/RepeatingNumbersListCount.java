package Practice;

import java.util.ArrayList;
import java.util.List;

public class RepeatingNumbersListCount {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(12);
        list.add(13);
        list.add(12);//45
        list.add(78);
        list.add(12);
        list.add(7);
        list.add(7);
        list.add(78);
        int num =countDuplicates(list);
        System.out.println(num);
    }
    static int countDuplicates(List<Integer> numbers){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<numbers.size()-1;i++){
            for (int j = i+1; j < numbers.size(); j++) {
                if(numbers.get(i).equals(numbers.get(j)) && !list.contains(numbers.get(j))){
                    list.add(numbers.get(i));
                    break;
                    }
                }
            }
        return list.size();
        }

    }

