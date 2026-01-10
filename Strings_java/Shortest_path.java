package Strings_java;

public class Shortest_path {
    public static int shortestPath(String directions) {
        int x = 0, y = 0;
        for (int i = 0; i < directions.length(); i++) {
         char dir = directions.charAt(i);
         //South
         if(dir == 'S'){
            y--;
         }
         //North
         else if(dir == 'N'){
            y++;
        }
        //East
         else if(dir == 'E'){
            x++;
         }
         //West
         else if(dir == 'W'){
            x--;
         }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (int)Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String directions = "WNEENESENNN";
        int distance = shortestPath(directions);
        System.out.println("The shortest path distance is: " + distance);
    }
}
