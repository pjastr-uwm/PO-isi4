package kopiowanie.zad1;

public class TestStudent {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("AA", 33, 4.5);
        Student s2= s1.clone();

        s2.setGrade(3.5);
        System.out.println(s1.getGrade());
        System.out.println(s2.getGrade());
    }
}
