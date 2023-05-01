package HomeWorkClass14;

public class GetGradeMethod {
    char getGrade (int score) {
        char grade;
        switch(score) {
            case 90:
                grade = 'A';
                break;
            case 80:
                grade = 'B';
                break;
            case 70:
                grade = 'C';
                break;
            case 50:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        return grade;
    }
        public static void main(String[] args) {
        GetGradeMethod obj = new GetGradeMethod();
        System.out.println(obj.getGrade(40));
    }
}
