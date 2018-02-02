/*
   A driver for the LinkedList class to demonstrate it's features
*/

class LinkedListDriver{
   public static void main(String[] args) throws Exception{
      // 0 indexed
      // insert(data,index) index=size to insert at end
      // delete(index)

      System.out.println("\t\t---LINKEDLIST---");

      //show insert
      System.out.println("--INSERT--");

      LinkedList list = new LinkedList();
      System.out.println("list: " + list);

      list.insert(1,0); //first, should be just 1->null
      //list.insert(1,42); //first. gives warning since index is not 0
      System.out.println("list: " + list);

      list.insert(2,0); // should be 2->1->null
      System.out.println("list: " + list);

      list.insert(3,1); //should be 2->3->1->null
      System.out.println("list: " + list);

      list.insert(4,list.size); //should be 2->3->1->4->null
      System.out.println("list: " + list);

      list.insert(5,list.size-3); //2->5->3->1->4->null
      System.out.println("list: " + list);

      System.out.println("\n");

      System.out.println("--GETTING--");
      System.out.println(list.get(2) + " is at index 2");

      System.out.println("\n");

      //show delete
      System.out.println("--DELETE--");
      list.delete(10); //wont work, out of bounds
      System.out.println("list: " + list);

      list.delete(0);
      System.out.println("list: " + list);

      list.delete(1);
      System.out.println("list: " + list);

      list.delete(2);
      System.out.println("list: " + list);

      list.delete(list.size-1);
      System.out.println("list: " + list);

      list.delete(0);
      System.out.println("list: " + list);

      //try to delete something when there is nothing in the list
      list.delete(0);
      System.out.println("list: " + list);
   }
}

