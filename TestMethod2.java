public class TestMethod2 {
    public static void main(String [] args ) {
        m();
        m2(2);
        int i = m4(4, 6);
        System.out.println(i);
    }
    public static void m() {       
        System.out.println("ok");
        System.out.println("hello");
    }
    public static void m2(int i) {
        if(i>3)
         return;
        System.out.println(i);
    }
    public static int  m4(int i, int j) {
    //why use int ? rather void ,what's the mean of int; 
      return i > j ? i : j;//return j 
    }   
}