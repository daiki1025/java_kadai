  import java.util.Random;

  class Calculation{

  public static void main(String[] args) {
      int num = Integer.parseInt(args[0]);
      double imax,n;
      double x,y,pi;
      n=0.0;
      imax = (double) num;
      for(int i = 0;i <= imax; i++) {
            x=Math.random();
            y=Math.random();

      if((x*x+y*y)<1.0) {
            n+=1.0;
      }
    }

            pi=n/imax*4.0;

      System.out.println("円周率は" + pi);

  }
}
