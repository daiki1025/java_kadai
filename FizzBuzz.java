class FizzBuzz {
  public static void  main(String[] args) {
    int num = Integer.parseInt(args[0]);
    for(int i = 1 ;i <= num;i++) {
      if (i % 3 == 0 &&  i % 5 == 0) {
        System.out.println("FizzBuzz");
      }else if(i % 3 == 0) {
        System.out.println("Fizz");
      }else if (i % 5 == 0) {
        System.out.println("Buzz");
      }else{
        System.out.println(i);
      }
    }
  }
}
    /* int i = 0;

     int a = i % 3;
     int b = i % 5;

        if ( a == 0 && b == 0) {
            System.out.println("FizzBuzz");
        }else if(  a == 0 ) {
            System.out.println("Fizz");
        }else if(  b == 0 )  {
            System.out.println("Buzz");
        }else {
            System.out.println(i);
    }
      i++;
  }*/
