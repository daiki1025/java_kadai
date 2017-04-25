
class Leibniz{

public static void main(String[] args) {
      int num = Integer.parseInt(args[0]);
      double  j;
      j = 1.0;
    for(int i = 1;i <= num; i++) {
    if(i%2 == 0){
      j = j + (1.0/(2.0*i + 1.0));
    }else{
      j = j - (1.0/(2.0*i + 1.0));
      }
    }
    System.out.println(j*4.0);

  }
}
