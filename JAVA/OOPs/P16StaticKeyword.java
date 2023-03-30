public class P16StaticKeyword {
    public static void main(String[] args) {
        Student.schoolName="123";
        System.out.println(Student.schoolName);
    }
}

class Student{
    int name;
    int roll;
    static String schoolName;

    static int percentCalc(int phy,int chem,int maths){
        return (phy+chem+maths)/3;
    }
}
