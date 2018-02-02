/*
   Implementation of a Stack
   Stack uses the Linked List as it's main structure

   methods:
   Stack() - creates new stack
   void push(int data) - insert a new node at the front
   int pop() - returns and deletes the data at the front
   int peek() - returns and does not delete the data at the front
*/

class Stack extends LinkedList{

   public Stack(){
      super();
   }

   public void push(int data){
      this.insert(data,0);
   }

   public int pop() throws Exception{
      int value = this.get(0);
      this.delete(0);

      return value;
   }

   public int peek() throws Exception{
      return this.get(0);
   }
}