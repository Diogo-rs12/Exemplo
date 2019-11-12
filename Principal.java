import java.util.*;
class Principal {
  public static void main(String[] args) {
    Scanner dr = new Scanner(System.in);
    int n = dr.nextInt();
    int r = fib(n);
    System.out.println(r);
    System.out.println("kkkkkkkkk");
  }
static int fib(int m) {
  if(m == 0){return 0;}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
  if(m == 1){return 1;}
  
  return fib(m-1)+fib(m-2);
    
 }
}