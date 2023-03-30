

public class P4CopyConstructor {
    public static void main(String[] args) {
        Stud s1=new Stud();
        s1.name="TK";
        s1.roll=22;
        s1.marks[0]=100;
        s1.marks[1]=200;
        s1.marks[2]=300;
        Stud s2=new Stud(s1);

        System.out.println(s2.name);
        s2.marks[1]=99;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

        for(int i=0;i<3;i++){
            System.out.println(s1.marks[i]);
        }
    }

}

class Stud{
    String name;
    int roll;
    int marks[];

    //shallow copy constructor
    Stud(Stud s1){          
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }

    Stud(){
        marks=new int[3];
    }
    Stud(String name,int roll){
        marks=new int[3];
        this.name=name;
        this.roll=roll;
    }
    
}
