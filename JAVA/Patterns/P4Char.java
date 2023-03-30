public class P4Char {
    public static void main(String[] args) {
        char ch='A';
        for(int line=1;line<=4;line++){
            for(int c=1;c<=line;c++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
