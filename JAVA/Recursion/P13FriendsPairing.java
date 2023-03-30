

public class P13FriendsPairing {
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }

    public static int friendsPairing(int n){

        //base case
        if(n==1 || n==2){
            return n;
        }
        // //choices
        // //single
        // int fn_1=friendsPairing(n-1);
        // //pair
        // int fn_2=friendsPairing(n-2);
        // int pairWays=(n-1)*fn_2;

        // int totWays=fn_1+pairWays;
        // return totWays;

        return friendsPairing(n-1)+ (n-1)*friendsPairing(n-2);
    }
}
