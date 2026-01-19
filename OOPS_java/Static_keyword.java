package OOPS_java;

public class Static_keyword {
    public static void main(String[] args) {
        Students S1 = new Students();
        S1.schoolName = "VED";

        Students S2 = new Students();
        System.out.println(S2.schoolName);// TEchnically it should print empty string but it will print the VED which is declared earlier due to static Variable 
    }
}

class Students {
    String name;
    int roll_no;

    static String schoolName;//this will declare globally if i will set the value of schooolname to 1 object it will automatically assign to all the abjects


}
