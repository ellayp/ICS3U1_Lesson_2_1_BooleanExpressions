class Program1 extends ConsoleProgram {

  /**
  * Description
  * @author: E. Yap
  */
  
  public void run() {
    
    /** 
    * Declaring our boolean variable "blnIsLessThan"
    * NOTE: always add the variable type (in this case, "bln")
    */
    boolean blnIsLessThan = 4 < 5;
    System.out.println("The result of 4 < 5 is " + blnIsLessThan);

    int intValue1 = 4;
    int intValue2 = 5;
    boolean blnIsGreaterThan = intValue1 > intValue2;
    System.out.println("The result of " + intValue1 + " > " + intValue2 + " is " + blnIsGreaterThan);
    
  }
}
