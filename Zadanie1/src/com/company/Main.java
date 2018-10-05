package com.company;

public class Main {

    public static void main(String[] args) {
      int a = 1;
      int b = 13;
      if((Range(a) || Range(b)) && !(Range(a) && Range(b))){
          System.out.println("teen");
      }
      else{
          System.out.println("false");
      }

    }

    private static boolean Range(int x) {
        return x >= 13 && x <= 19;
    }
}
