package Practice;

import java.util.LinkedList;

public class FibonacciNumbers {
    public static void main(String[] args){

            LinkedList<Integer>list=new LinkedList<>();
            for(int i=2;i<100;i++){
                boolean isFalse=true;
                for(int j=2;j<=i/2;j++){
                    if(i%j==0){
                        isFalse=false;
                        break;
                    }
                }
                if(isFalse){
                    list.add(i);
                    System.out.println(i);
                }
            }
            System.out.println(list);
        }

    }

