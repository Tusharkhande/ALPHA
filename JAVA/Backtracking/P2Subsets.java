
public class P2Subsets {
    public static void printSubset(String str,String ans,int i){
        
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
                
            }
            return;
            
        }

        //yes choice
        printSubset(str,ans+str.charAt(i),i+1);

        //no choice
        printSubset(str,ans,i+1);
    }

    public static void main(String args[]){
        String str="abc";
        printSubset(str, "", 0);
    }
}
