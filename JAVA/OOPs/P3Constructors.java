public class P3Constructors {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student('B');
        Student s3=new Student("TK",22);

        System.out.println(s2.div);
        System.out.println(s3.name);

    }
    

    
}

class Student{
    String name;
    int roll;
    char div;

    Student(){              //non parameterized constructor
        System.out.println("Non Parameterized Constructor");
    }
    

    Student(char div){      //Parameterized
        this.div=div;
    }

    Student(String name,int roll){      //Parameterized
        this.name=name;
        this.roll=roll;
    }
}
