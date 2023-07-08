package Practice;

import java.util.ArrayList;
import java.util.List;

public class LargesrSecondLargestSum {
        public static void main(String[] args){
            List<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(8);
            list.add(4);
            list.add(12);
            list.add(56);
            list.add(20);
            int sum=largestSecondLargestSum(list);
            System.out.println(sum);

            List<Integer> list1=new ArrayList<>();
            list1.add(10);
            list1.add(5);
            list1.add(3);
            list1.add(9);
            list1.add(10);
            list1.add(11);
            list1.add(5);
            int sum1=largestSecondLargestSum(list1);
            System.out.println(sum1);
        }
        public static int largestSecondLargestSum(List<Integer> list){
            int largest = 0;
            int secondLargest = 0;
            for(int num:list){
                if(num>largest){
                    secondLargest=largest;
                    largest=num;
                }else if(num>secondLargest && num<largest){
                    secondLargest=num;
                }
            }

            return largest+secondLargest;
        }
    }

