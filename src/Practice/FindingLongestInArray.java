package Practice;

public class FindingLongestInArray {

           static String maxLength(String[] array) {
            String arrElement = "";
               for (String s : array) {
                   if (s.length() > arrElement.length()) {
                       arrElement = s;
                   }
               }
            return arrElement;
        }

        public static void main(String[] args) {
            String[] arr = {"hey", "yolo", "hi", "this is long"};
            System.out.println(maxLength(arr));

        }

    }
