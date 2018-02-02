/*
   Implementation of a Queue
   Queue uses the Linked List as it's main structure

   methods:
   Queue() - creates new queue
   void push(int data) - insert a new node at the front
   int pop() - returns and deletes the data at the end
   int peek() - returns and does not delete the data at the end
*/

class Queue extends LinkedList{

   public Queue(){
      super();
   }

   public void push(int data){
      this.insert(data,0);
   }

   public int pop() throws Exception{
      int value = this.get(this.size-1);
      this.delete(this.size-1);

      return value;
   }

   public int peek() throws Exception{
      return this.get(this.size-1);
   }
}