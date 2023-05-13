package HomeWorkClass20;

public class DegreeTester {
    public static void main(String[] args) {
        Degree degree = new Degree();
        Bachelors bachelors = new Bachelors();
        Masters master = new Masters();
        degree.getPrerequisite();
        bachelors.getPrerequisite();
        master.getPrerequisite();
    }
}
