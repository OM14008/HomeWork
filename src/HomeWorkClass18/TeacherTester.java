package HomeWorkClass18;

public class TeacherTester {
    public static void main(String[] args) {

        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.name="John";
        mathTeacher.age=42;
        mathTeacher.ID="123645";
        mathTeacher.eat();
        mathTeacher.drink();
        mathTeacher.walk();
        System.out.println(mathTeacher.age+"\n"+mathTeacher.name+"\n"+mathTeacher.ID);
        mathTeacher.gradeStudents();
        mathTeacher.teachMath();
        System.out.println();


        ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
        chemistryTeacher.name="Anna";
        chemistryTeacher.age=43;
        chemistryTeacher.ID="123654";

        chemistryTeacher.eat();
        chemistryTeacher.drink();
        chemistryTeacher.walk();
        System.out.println(chemistryTeacher.age+"\n"+ chemistryTeacher.name+"\n"+chemistryTeacher.ID);
        chemistryTeacher.gradeStudents();
        chemistryTeacher.teachChemistry();
        System.out.println();

        PianoTeacher pianoTeacher = new PianoTeacher();
        pianoTeacher.name="Bob";
        pianoTeacher.age=46;
        pianoTeacher.ID="4569879";
        pianoTeacher.eat();
        pianoTeacher.drink();
        pianoTeacher.walk();
        System.out.println(pianoTeacher.age+"\n"+pianoTeacher.name+"\n"+pianoTeacher.ID);
        pianoTeacher.gradeStudents();
        pianoTeacher.teachPiano();
    }
}
