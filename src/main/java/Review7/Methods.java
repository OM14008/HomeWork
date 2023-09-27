package Review7;

public class Methods {


        void hello() {
            System.out.println("Hello");
        }
        void helloName(String name){
            System.out.println("Hello "+name);
        }
        String concat(String str1,String str2,String str3){
           return str1.concat(str2).concat(str3);
        }
        int largest(int num1,int num2){
            if(num1<num2){
                return num2;
            } else {
                return num1;
            }
        }
        double convert(int num1){
            return (num1*9/5)+32;

        }
        String[] words(String str){
            return str.split(" ");
        }


    public static void main(String[] args) {
        Methods jm = new Methods();
        jm.hello();
        jm.helloName("Oleg");
        String m = jm.concat("oleg","Oleg","afgr");
        System.out.println(m);
        int n = jm.largest(6,5);
        System.out.println(n);
        double f = jm.convert(18);
        System.out.println(f);
        String[] str =  jm.words("It's a nice day");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }




    }








    }

