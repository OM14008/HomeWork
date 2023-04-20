public class Main {
    public static void main(String[] args) {
        String[] names = {"Alex","Josh","Anna","Elizabeth"};
        char[] grades = {'A','B','C','D'};

        for (int i = 0; i < 2; i++) {
            System.out.println(names[i]+" "+grades[i]);
        }
        System.out.println();

        String[][] originMakeCars = { {"American","German","Korean","Italian"},
                                      {"Dodge","BMW","Hyundai","Ferrari"}    };
        for (int i = 0; i < originMakeCars.length; i++) {
            for (int j = 0; j < originMakeCars[i].length; j++) {
                System.out.println(originMakeCars[i][j]);
            }
        }
        System.out.println();
        for(String[] origin : originMakeCars) {
            for(String cars : origin ) {
                System.out.println(cars);
            }
        }






















    }
}