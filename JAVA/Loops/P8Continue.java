public class P8Continue {
    public static void main(String[] args) {
        /*for(int i=1;i<=5;i++){
            
            if(i==3){
                continue;
            }
            System.out.println(i);
        }*/
        int i=1;
        do{
            if(i==3){
                continue;
            }
            System.out.println(i);
            i++;
        }while(i<=5);
    }
}
