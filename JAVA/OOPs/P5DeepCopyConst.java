public class P5DeepCopyConst {
    public static void main(String[] args) {
        Stud1 s1=new Stud1();
        s1.marks[0]=100;
        s1.marks[1]=99;
        s1.marks[2]=98;

        Stud1 s2=new Stud1(s1);
        s1.marks[1]=97;

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
    

}


class Stud1{
    String name;
    int roll;
    int marks[];

    //deep copy constructor
    Stud1(Stud1 s1){          
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
        }
        
    }

    Stud1(){
        marks=new int[3];
    }
    Stud1(String name,int roll){
        marks=new int[3];
        this.name=name;
        this.roll=roll;
    }
    
}
