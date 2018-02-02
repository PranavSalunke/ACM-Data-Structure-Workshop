/*
   An interactive driver to play around with all three structures.
   You can use the terminal to interact with this program to create
   one of the data structures and play around with it to see what
   all the functions do.
*/


import java.util.Scanner;

class InteractiveDataStructuresDriver{
   public static void main(String[] args){
      Scanner userIn = new Scanner(System.in);

      instructions(); //prints starting instructions
      System.out.println();

      do{
         int structureType = createStructureType(userIn); //ask the users which sructure they want to use

         if(structureType == -1){
            continue;
         }else if(structureType == 1){ //linked list
            System.out.println();

            linkedListType(userIn); //LinkedList specific prompts

         }else if(structureType == 2){ //stack
            System.out.println();

            stackType(userIn); //Stack specific prompts

         }else{ //type 3 queue
            System.out.println();

            queueType(userIn); //Queue specific prompts

         }
         System.out.print("\nEnter \"exit\" to exit the driver. Or \"c\" to continue to the structure list: ");
      }while(!userIn.next().equals("exit"));

      System.out.println("\nThanks for using the interactive driver!\n"); //exit message
   }

   static void instructions(){
      System.out.println("  Welcome to the Interactive Driver!");
      System.out.println("  Choose the stucture you want to explore");
      System.out.println("  Then choose the method you want to use.");
      System.out.println("  You may be further prompted depending on the method");
      System.out.println("  The state of the current structure will always be displayed after an action");

      System.out.println();
   }

   static int createStructureType(Scanner userIn){
      // prompts users what structure they want and returns corresponding value
      int selection = -1;

      System.out.println("Which structure would you like to create? (enter the number)\n");
      System.out.println("1: LinkedList");
      System.out.println("2: Stack");
      System.out.println("3: Queue");

      do{ //user input checking loop
         System.out.print("Structure: ");

         while(!userIn.hasNextInt()){
            if(userIn.next().equals("exit")) break;
            System.out.print("Enter a number please! Number: ");
         }

         selection = userIn.nextInt();

         if(selection < 1 || selection > 3){
            System.out.println("Enter the nubmer 1, 2 or 3!");

         }

      }while(selection < 1 || selection > 3);
      return selection;
   }

   static void linkedListType(Scanner userIn){
      structureTypeMessage("LinkedList");

      LinkedList structure = new LinkedList(); //create the structure using the defined class


      boolean goHome = false;
      System.out.println("Your structure is of type LinkedList" );
      System.out.println("The new LinkedList: " + structure + "\n");
      System.out.println("You can take the following actions: ");

      do{ //loop to see if use wants to go "home"
         goHome = false;
         goHome = action(userIn, structure); // asks what valid action you want to do and does it

         System.out.print("\nContinue? ");
         System.out.print("Enter \"home\" to go back to choose a structure. Or \"c\" to continue: ");
         if(userIn.next().equals("home")) break;
      }while(!goHome);
   }

   static void stackType(Scanner userIn){
      structureTypeMessage("Stack");

      Stack structure = new Stack();

      boolean goHome = false;
      System.out.println("Your structure is of type Stack");
      System.out.println("The new Stack: " + structure + "\n");
      System.out.println("You can take the following actions: ");
      do{
         goHome = false;
         goHome = action(userIn, structure); // asks what valid action you want to do and does it

         System.out.print("\nContinue? ");
         System.out.print("Enter \"home\" to go back to choose a structure. Or \"c\" to continue: ");
         if(userIn.next().equals("home")) break;
      }while(!goHome);
   }

   static void queueType(Scanner userIn){
      structureTypeMessage("Queue");

      Queue structure = new Queue();

      boolean goHome = false;
      System.out.println("Your structure is of type Queue");
      System.out.println("The new Queue: " + structure + "\n");
      System.out.println("You can take the following actions: ");
      do{
         goHome = false;
         goHome = action(userIn, structure); // asks what valid action you want to do and does it

         System.out.print("\nContinue? ");
         System.out.print("Enter \"home\" to go back to choose a structure. Or \"c\" to continue: ");
         if(userIn.next().equals("home")) break;
      }while(!goHome);
   }

   static void structureTypeMessage(String structureType){
      System.out.println("\nYou chose " + structureType);
      System.out.println("Enter \"back\" to go back to the structure list");
      System.out.println("(you will lose the structure you're working with)\n" );
   }

   static boolean action(Scanner userIn, LinkedList structure){ //can used LinkedList since it's a super class of the other two
      String type = "";

      if(structure instanceof Stack){
         type = "Stack";

      }else if(structure instanceof Queue){
         type = "Queue";

      }else{
         type = "LinkedList";
      }

      if(type.equals("LinkedList")){

         System.out.println("Which method would you like to use? (enter the number)\n");
         System.out.println("1: insert(int data, int index) \t- outer index bound inclusive");
         System.out.println("2: delete(int index) \t\t- outer index bound exclusive");
         System.out.println("3: get(int index) \t\t- outer index bound exclusive");

         int methodId = -1;
         do{
            System.out.print("Method: ");
            while(!userIn.hasNextInt()){
               if(userIn.next().equals("back") || userIn.next().equals("home")) return true;
               System.out.print("Enter a number please! Number: ");
            }
            methodId = userIn.nextInt();

            if(methodId < 1 || methodId > 3){
               System.out.println("Enter the nubmer 1, 2 or 3!");
            }
         }while(methodId < 1 || methodId > 3);

         //method has been chosen

         //ask for index since it's needed for all methods
         int index = -1;
         do{
            System.out.print("Index between 0 and " + structure.size + " : ");
            while(!userIn.hasNextInt()){
               if(userIn.next().equals("back") || userIn.next().equals("home")) return true;
               System.out.print("Enter a valid index please! Index: ");
            }
            index = userIn.nextInt();

            if(index < 0 || index > structure.size){
               System.out.println("Index is out of bounds");
            }
         }while(index < 0 || index > structure.size);
         System.out.println();

         // structure was of type LinkedList, no need to cast
         if(methodId == 1){ //insert
            int data = getData(userIn);
            structure.insert(data, index);

         }else if(methodId == 2){  //delete
            structure.delete(index);
         }else{ //get
            try{ //catch if get throws invalid index exception
               int value = structure.get(index);
               System.out.println("The value that returned: " + value);
            }catch(Exception e){
               System.out.println("Exception: " + e.getMessage());
               System.out.println("Index was out of bounds, did not get anything.\n");
            }
         }

         System.out.println("The " + type + " List so far: " + structure);
      }else{ // not a LinkedList; Stacks and Queues have the same methods; must be cast
         System.out.println("Which method would you like to use? (enter the number)\n");
         System.out.println("1: push(int data)");
         System.out.println("2: pop()");
         System.out.println("3: peek()");

         int methodId = -1;
         do{
            System.out.print("Method: ");
            while(!userIn.hasNextInt()){
               if(userIn.next().equals("back") || userIn.next().equals("home")) return true;
               System.out.print("Enter a number please! Number: ");
            }
            methodId = userIn.nextInt();

            if(methodId < 1 || methodId > 3){
               System.out.println("Enter the nubmer 1, 2 or 3!");
            }
         }while(methodId < 1 || methodId > 3);

         //method has been chosen

         System.out.println();

         // structure was of type Stack or Queue, no need to cast
         if(methodId == 1){ //push
            int data = getData(userIn);

            if(structure instanceof Stack){
               ((Stack)structure).push(data);

            }else{ //if not a LinkedList nor Stack, it's a Queue
               ((Queue)structure).push(data);
            }
         }else if(methodId == 2){  //pop
            if(structure instanceof Stack){
               int value = ((Stack)structure).pop();
               System.out.println("The value that was popped: " + value);
            }else{ //if not a LinkedList nor Stack, it's a Queue
               int value = ((Queue)structure).pop();
               System.out.println("The value that was popped: " + value);
            }
         }else{ //peek
            if(structure instanceof Stack){
               int value = ((Stack)structure).peek();
               System.out.println("The value that was peeked: " + value);
            }else{ //if not a LinkedList nor Stack, it's a Queue
               int value = ((Queue)structure).peek();
               System.out.println("The value that was peeked: " + value);
            }
         }
         System.out.println("The " + type + " so far: " + structure);

      }
      return false; //user did not ask to go to the home prompt
   }

   static public int getData(Scanner userIn){
      int data;
      boolean gotData = false;
      do{
         System.out.print("Data (integer): ");
         while(!userIn.hasNextInt()){
            System.out.print("Enter an integer please! Data: ");
            userIn.next();
         }
         data = userIn.nextInt();
         gotData = true;
         System.out.println();

      }while(!gotData);
      return data;
   }
}