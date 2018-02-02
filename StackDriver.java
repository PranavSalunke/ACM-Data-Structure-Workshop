/*
   A driver for the Stack class to demonstrate it's features
*/

class StackDriver{
   public static void main(String[] args) throws Exception{

      System.out.println("\t\t---STACK---");

      System.out.println("--PUSHING--");

      Stack stack = new Stack();
      System.out.println("Stack: " + stack);

      stack.push(1); //first, should be 1->null
      System.out.println("Stack: " + stack);

      stack.push(2); //should be 2->1->null
      System.out.println("Stack: " + stack);

      stack.push(3); //should be 3->2->1->null
      System.out.println("Stack: " + stack);

      stack.push(4); //should be 4->3->2->1->null
      System.out.println("Stack: " + stack);

      stack.push(5); //should be 5->4->3->2->1->null
      System.out.println("Stack: " + stack);

      System.out.println("\n");

      System.out.println("--PEEKING--");
      System.out.println(stack.peek() + " is at top");

      System.out.println("\n");

      System.out.println("--POPPING--");
      int value;

      value = stack.pop(); // will return 5; list wil be 4->3->2->1null
      System.out.println("Popping " + value + " off the stack\n Stack: " + stack);

      value = stack.pop(); // will return 4; list wil be 3->2->1null
      System.out.println("Popping " + value + " off the stack\n Stack: " + stack);

      value = stack.pop(); // will return 3; list wil be 2->1null
      System.out.println("Popping " + value + " off the stack\n Stack: " + stack);

      value = stack.pop(); // will return 2; list wil be 1->null
      System.out.println("Popping " + value + " off the stack\n Stack: " + stack);

      value = stack.pop(); // will return 1; list wil be null
      System.out.println("Popping " + value + " off the stack\n Stack: " + stack);

      //try to pop something off when there is nothing on the stack
      System.out.println("\nThere should be an exception here");
      value = stack.pop(); //Exception
      System.out.println("Popping " + value + " off the stack\n Stack: " + stack);


   }

}