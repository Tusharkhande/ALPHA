public class P6StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Drogon");

        for(char ch='a';ch<='z';ch++){
            sb.append(ch);

        }//O(26)
        //O(n^2)
        System.out.println(sb);
    }
}
