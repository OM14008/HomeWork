package HomeWorkClass17;

public class Students {
    String name;

    Students(String name){
        this.name=name;

    }
    void averageGrade(int grade1,int grade2,int grade3){
        int average = (grade1+grade2+grade3)/3;
        System.out.println("The average grade for "+name+" is: "+average+"%");
    }
}
