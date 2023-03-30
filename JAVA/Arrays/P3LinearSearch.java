import java.util.Scanner;

public class P3LinearSearch {

    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
        
    }

    public static int strSearch(String str[],String strkey){
        for(int i=0;i<str.length;i++){
            if(str[i].equals(strkey)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int  numbers[]={2,4,6,8,10,12,14,16};
        String str[]={"tk","vk","rk"};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Key: ");
        int key=sc.nextInt();

        int index=linearSearch(numbers, key);
        
        if(index==-1){
            System.out.println("Not Found");
        }
        else
        System.out.println("Key is at index: "+index);

        //String searching...
        System.out.println("Enter Word: ");
        String strkey=sc.next();
        int strIndex=strSearch(str,strkey);

        if(strIndex==-1){
            System.out.println("Not Found");
        }
        else System.out.println("Word Found at index: "+strIndex);
        
    }
}
