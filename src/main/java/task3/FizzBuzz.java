package task3;

public class FizzBuzz {

    public String convertNumber(int number) {
        String res = "" ;
        if(number%5 == 0)  {
            res =  "Fizz" ;
            if(number%7 == 0) {
                res = "FizzBuzz" ;
            }
        }
        if(number%7 == 0) {
            res = "Buzz" ;
            if(number%5 == 0) {
                res = "FizzBuzz" ;
            }
        }

        return res;
    }
}
