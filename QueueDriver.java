/*
   A driver for the Queue class to demonstrate it's features
*/

class QueueDriver{
   public static void main(String[] args) throws Exception{

      System.out.println("\t\t---QUEUE---");

      System.out.println("--PUSHING--");

      Queue queue = new Queue();
      System.out.println("Queue: " + queue);

      queue.push(1); //first, should be 1->null
      System.out.println("Queue: " + queue);

      queue.push(2); //should be 2->1->null
      System.out.println("Queue: " + queue);

      queue.push(3); //should be 3->2->1->null
      System.out.println("Queue: " + queue);

      queue.push(4); //should be 4->3->2->1->null
      System.out.println("Queue: " + queue);

      queue.push(5); //should be 5->4->3->2->1->null
      System.out.println("Queue: " + queue);

      System.out.println("\n");

      System.out.println("--PEEKING--");
      System.out.println(queue.peek() + " is at top");

      System.out.println("\n");

      System.out.println("--POPPING--");
      int value;

      value = queue.pop(); // will return 1; list wil be 5->4->3->2->null
      System.out.println("Popping " + value + " off the queue\n Queue: " + queue);

      value = queue.pop(); // will return 2; list wil be 5->4->3->null
      System.out.println("Popping " + value + " off the queue\n Queue: " + queue);

      value = queue.pop(); // will return 3; list wil be 5->4->null
      System.out.println("Popping " + value + " off the queue\n Queue: " + queue);

      value = queue.pop(); // will return 4; list wil be 5->null
      System.out.println("Popping " + value + " off the queue\n Queue: " + queue);

      value = queue.pop(); // will return 5; list wil be null
      System.out.println("Popping " + value + " off the queue\n Queue: " + queue);

      //try to pop something off when there is nothing on the queue
      System.out.println("\nThere should be an exception here");
      value = queue.pop(); //error
      System.out.println("Popping " + value + " off the queue\n Queue: " + queue);


   }

}