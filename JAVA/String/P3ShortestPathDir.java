public class P3ShortestPathDir {
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(shortestPath(path));
    }

    public static float shortestPath(String path){

        int x=0;
        int y=0;

        for(int i=0;i<path.length();i++){

            //east
            if(path.charAt(i)=='E'){
                x++;
            }
            //west
            if(path.charAt(i)=='W'){
                x--;
            }
            //north
            if(path.charAt(i)=='N'){
                y++;
            }
            //south
            if(path.charAt(i)=='S'){
                y--;
            }
        }

        int X2=x*x;
        int Y2=y*y;

        return (float)Math.sqrt(X2+Y2);
    }
}
