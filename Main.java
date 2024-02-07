public class Main {
    static int addNum(int x, int y){
        int z = x + y;//z can only be used after this declaration. This is another bit of scope.
        return z;//this z can only be used in this method. This is called scope.
    }
    static float addNum(float x, float y){
        float z = x + y;
        return z;
    }
    static double addNum(double x, double y){
        double z = x + y;
        return z;
    }//addNum is overloaded here!
    public static void main(String[] args){
        System.out.println("foo");
        float a = 9.9f;
        float b = 8.2f;
        int c = 9;
        int d = 8;
        double e = 9.274;
        double f = 40.4235;
        System.out.println("float: " + addNum(a, b));
        System.out.println("int: " + addNum(c, d));
        System.out.println("double: " + addNum(e, f));
    }
    //lots of methods, only one identifier.
}
