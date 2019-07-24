package mathoperations;

public class MathOperations {
     public static void main( String[] args ) {
         int p,q,h,r,s,t,u,v,w,x,y,z;
          double a,b,c;
          String first, second, together;
 
          p = 8;
          q = 25;
          h = 7;
         System.out.println( "p is " + p + ", q is " + q );
 
         r = p + q;
         System.out.println( "p+q is " + r );
         s = p - q;
         System.out.println( "p-q is " + s );
         t = p+q*3;
         System.out.println( "p+q*3 is " + t );
         u = q / 2;
         System.out.println( "q/2 is " + u );
         
         v = p + q/2;
         System.out.println( "p + q / 2 is " + v );
         
         w = q - 6 * p;
         System.out.println(" q - 6 * p is " + w );
         
         x = h + q / p;
         System.out.println (" h + q / p is " + w );
         
         y = h - q + h * p;
         System.out.println (" h - q + h * p is " + y);
         
         z = h - q / 2 * 3;
         System.out.println ("h - q / 2 * 3 is " + z);
         p += 5;
         System.out.println("p += 5 is " + p);
         q += 7;
         System.out.println("q ++ 7 is " + q);
         
        
        a = 1.1;
         System.out.println( "a is " + a );
         b = a*a;
         System.out.println( "a*a is " + b );
         c = b / 2;
         System.out.println( "b/2 is " + c );
         System.out.println();

         first = "peanut butter";
         second = "jelly";
         together = first + " and " + second;
         System.out.println( together );
     }
}