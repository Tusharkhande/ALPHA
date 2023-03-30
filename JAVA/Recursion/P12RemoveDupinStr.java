public class P12RemoveDupinStr {
    public static void main(String[] args) {
        String str="aabbcdeeffghoa";
        StringBuilder sb=new StringBuilder("");
        boolean map[]=new boolean[26];
        removeDup(str, 0, sb, map);
    }

    public static void removeDup(String str,int i,StringBuilder sb,boolean map[]) {
        //base case
        if(i==str.length()){
            System.out.println(sb);
            return;
        }

        char currchar=str.charAt(i);
        if(map[currchar-'a']==true){
            //duplicate
            removeDup(str, i+1, sb, map);
        }
        else{
            map[currchar-'a']=true;
            removeDup(str, i+1, sb.append(currchar), map);
        }

    }
}
