package Practice;

public class LongestEvenWord {

        public static void main(String[] args) {
            String newStr=findMaxLenEven("find MaxLen Even");
            System.out.println(newStr);
            String newStr1=findMaxLenEven("I am very Good at Java");
            System.out.println(newStr1);
            String newStr2=findMaxLenEven("I was");
            System.out.println(newStr2);
        }
        public static String findMaxLenEven(String str){
            boolean isEven=true;
            String[] words=str.split(" ");
            String longest="";
            for(String word:words){
                if(word.length()%2==0 && word.length()>longest.length()){
                    longest=word;
                    isEven=false;
                }
            }
            if(isEven){
                return "-1";
            }
            return longest;
        }
    }


