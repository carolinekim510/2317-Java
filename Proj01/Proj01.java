//34567890123456789012345678901234567890123456789012345678
/*File Proj01 Copyright 2008 R.G.Baldwin
--------------------------------------------------------*/
import java.util.*;

class Proj01{
  static String[] names = 
  {"Don","don","Bill","bill","Ann","ann","Chris","chris"};
  
  static String[] myArray = new String[8];
  
  public static void main(String args[]){
    
    if(args.length == 0){
      System.out.println(
             "You must provide a command-line argument");
      System.exit(0);
    }//end if
    System.out.println();
    System.out.println("NOTE:");
    System.out.println("Only one new class definition is allowed.");
    System.out.println("Unchecked operations are not allowed.");
    System.out.println();

    Proj01Runner runner = new Proj01Runner();
    //runner.studentInfo();


    int seed = Integer.parseInt(args[0]);
    Random generator = new Random(seed);
    
    //Create and display the data for input to the class
    // named Proj01Runner.
    System.out.print("Input:  ");
    for(int cnt = 0;cnt < 8;cnt++){
      int index = ((byte)generator.nextInt())/16;
      if(index < 0){
        index = -index;
      }//end if
      myArray[cnt] = names[index];
      System.out.print(myArray[cnt] + " ");
    }//end for loop
    System.out.println();//new line

    //Process the data and display the results.
    Collection collection = runner.getCollection(myArray);
 
    System.out.print("Output: ");
    Iterator iter = collection.iterator();
    while(iter.hasNext()){
      System.out.print(iter.next() + " ");
    }//end while loop
    System.out.println();

  }//end main()
  //----------------------------------------------------//

}//end class Proj01

