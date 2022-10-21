public class Student  {
    private int sbd ;
    private String name ;
    private static String school="CG";

    Student ( int a , String n){
        sbd = a;
        name = n;
    }

    static void change(){
        school = "CODEGYM";
    }
    void display(){
        System.out.println(sbd + " " + name + " " +school);
    }
}
