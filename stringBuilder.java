public class stringBuilder
{
	public static void main(String[] args)
	{

		//create string

	  StringBuilder str = new StringBuilder("Fahim");
	  System.out.println("My name is : "+str);


      //Append method for add something
      str.append(" Rahman ");
      
      System.out.println("\n\nFull name is : "+str);

      str.append(21);
      str.append(15.5);
      System.out.println(" \n\n\n"+str);

      //reverse 
      str.reverse();
      System.out.println("Reverse Order : "+str);

      //Delete method
      str.delete(2,5);
      System.out.println("After deleting the reverse order letters from index 2 to 5 : "+str);

	}
}