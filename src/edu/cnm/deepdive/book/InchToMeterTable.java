package edu.cnm.deepdive.book;

public class InchToMeterTable {

  public static void main(String args[]) {   //convert inches
    double mul_met;         //multiply meters
    double res_met;         //resulting meters
    int counter;            //loop through for loop
    double conv_in;

    conv_in = 0;           //12 ft = 144 inches
    mul_met = 39.37;       //equals to 1 inch
    counter = 0;

    //res_met = conv_in * mul_met;

    for (conv_in = 1; conv_in <= 144; conv_in++) {
      res_met = conv_in / mul_met;   //convert in to meters
      //counter to printout dots for every 12 lines
      System.out.println("Inches to Meters: " + res_met);
      counter++;
      if (counter == 12) {
        counter = 0;
        System.out.println("...");
      }
    }

  }
}

