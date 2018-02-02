/*
   Implementation of a Linked list

   methods:
   LinkedList() - creates new linked list
   void insert(int data, int index) - insert a new node with data so that it's index
      is the index specified
   void delete(int index) - delete node at index
   int get(int index) - returns the data of the node at index
   boolean isEmpty() - True if LinkedList is empty, false otherwise
   String toString() - Returns the string representation of the LinkedList
*/

class LinkedList{
   //all variables and methods are public
   //singly linked


   public int size;
   Node head = null;
   Node tail = null;

   private class Node{
      int data;
      Node link;
   }


   public LinkedList(){
      this.size = 0;
   }

   public void insert(int data, int index){
      //node is inserted so that the new node is at index
      // to insert at end, index = size.
      //   the new end's index is the old list's size
      //zero indexed

      if(index > this.size || index < 0){
         System.out.println("Warning: invalid index. Nothing inserted.");
         return; //exit out of method
      }

      Node newNode = new Node();
      newNode.data = data;

      if(this.size == 0){ //no list made yet
         System.out.println("no nodes yet, inserting first node");

         if(index != 0){
            System.out.print("Warning: List is empty. First insert must be at node 0. ");
            System.out.println("Inserting node at index 0");
         }

         newNode.link = null;
         this.head = newNode;
         this.tail = newNode;
      }else if(index == 0){ //insert at front
         System.out.println("Note: inserting node at front");
         newNode.link = head;
         head = newNode;
      }else if(index == this.size){ //insert at end
         System.out.println("Note: inserting node at end");

         Node curr = head;
         for(int i = 0; i < this.size-1; i++){ // go to last node
            curr = curr.link;
         }

         curr.link = newNode;
         newNode.link = null;
         tail = newNode;

         /*
         //or can do it with a tail pointer so you don't have to loop
         tail.link = newNode;
         newNode.link = null;
         tail = newNode;
         */

      }else{ //insert somewhere in the middle
         System.out.println("Note: inserting node in the middle");
         Node curr = head;

         for(int i = 0; i < index-1; i++){ //go to the node before it
            curr = curr.link;
         }

         Node prev = curr;
         curr = curr.link; //bring curr to the desired index

         prev.link = newNode;
         newNode.link = curr;
      }

      this.size++;
   }

   public void delete(int index){
      //check for invalid index
      if(this.isEmpty()){ //no list made yet; can't delete anything
         System.out.println("Warning: empty list. Nothing deleted.");
         return;
      }else if(index >= this.size || index < 0){
         System.out.println("Warning: invalid index. Nothing deleted.");
         return; //exit out of method
      }

      if(index == 0){ //delete front
         System.out.println("Note: deleting node at front");
         Node curr = head;
         head = head.link;
         curr.link = null;

      }else if(index == this.size-1){ //delete end
         System.out.println("Note: deleting node at end");

         //previous in terms of the node we want to delete
         Node prev = head;

         for(int i = 0; i < this.size-2; i++){ // go to second last node
            prev = prev.link;
         }

         prev.link = null;
         //garbage collector takes care of the last node since you can't
         // get to it anyomore

         //cant use tail pointer since you can't get to the second last one
      }else{ //deleting somewhere in the middle
         System.out.println("Note: deleting node in the middle");

         //previous in terms of the node we want to delete
         Node prev = head;

         for(int i = 0; i < index-1; i++){ //go to the node before it
            prev = prev.link;
         }

         prev.link = prev.link.link;
         /*
            Why this works:
            D - node we want to delete
            P - the node before D (this is where prev is)
            N - the node after D

            P's pointer should point to N  (skip over D)
            D gets collected by the garbage collector since nothing is referencing it

            What is "prev.link.link;"
            prev.link returns a Node (pointer) which you can call .link on again.
            same as:
            Node next = prev.link
            Node nextOver = next.link
            prev.link = nextOver

         */
      }
      this.size--;
   }


   public int get(int index) throws Exception{
         if(index >= this.size || index < 0){
            System.out.println("Warning: tried to get() with index that is out of bounds. Will throw exception");
             throw new Exception("Error. get() out of bounds"); //have to throw exception since you can't return like we did above
             // not needed for the structure, but using it in InteractiveDataStructures.java
         }

         Node curr = head;
         for(int i = 0; i < index; i++){ // go to index
            curr = curr.link;
         }
         return curr.data;
   }


   public boolean isEmpty(){
      return this.size == 0;
   }

   public String toString(){

      String ans = "[";
      Node curr = this.head;
      String space = "";
      while (curr!=null){
         ans += space + curr.data;
         curr = curr.link;
         space = ", ";
      }
      ans += "]";
      return ans;
   }
}

