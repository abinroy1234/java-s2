package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Exceptlion extends Exception
{
 public Exception(String str)
 {
  System.out.println(str);
 }
}

public class SignException {

 public static void main(String[] args)throws IOException {
  
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Input number :: ");
  
  try {
   int num = Integer.parseInt(br.readLine());
   if(num < 0)
    throw new Exception("Number is negative");
   else
    throw new Exception("Number is positive");
  }
  catch (Exception m) {
   System.out.println(m);
  }
 }

}


