My code implementing a Linked List, Stack, and Queue for a demo in a Data Structure workshop for ACM at UCSC
1/27/2018


# Simple Data Structures


This collection of files is to help you learn about Linked Lists as well as Stacks and Queues implemented built on top of a Linked list. 


## Structures:

* LinkedList.java
   * defines a LinkedList
* Stack.java
   * defines a Stack, using the LinkedList as a super class
* Queue.java
   * defines a Queue, using the LinkedList as a super class


## Drivers:

* LinkedListDriver.java
   * run to see demonstration of the LinkedList methods
* QueueDriver.java
   * run to see demonstration of the Queue methods
   * Note: this driver will throw an Exception. This is expected.
* StackDriver.java
   * run to see demonstration of the Stack methods
   * Note: this driver will throw an Exception. This is expected.
* InteractiveDataStructuresDriver.java
   * run to play with the data structures in real time on the terminal. Instructions how to use it are shown when you run this driver


## How to run the driver files:

If you are getting these files from GitHub, you will either have to clone or download the files. I will explain how to download it. To download, click the green "Clone or download" button and click "Download ZIP". This will download a zip file to your computer. You should be able to unzip it by right clicking.


Once you have the files locally you can view the source code, compile, and run it. Assuming you have java on your computer, you should compile all the files. You can do that by the command "javac <filename.java>" The only runnable files are the ones with "Driver" in the file name. Once you compile all the files, you should be able to run the Driver files. To do that use the command "java <drivername>". As mentioned above, three of them are static and just show the  methods being used. 


If you want to clone it, you can find tutorials how to clone a repository online that would do a better job at explaining it than I can.


### InteractiveDataStructuresDriver.java:


I also created a program to run all these data structures interactively on your terminal, in real time. Most of the instructions are in the program itself so you will know what to do. I tried to make the prompts clear enough to follow. The overview is that you can choose which of the three structures you want to play around with. Then you can call on it's methods and see how that changes the structure. 


I did my best to make it bug free as I do input checking to make sure the user input is valid and of the right type. So ideally, the program should not crash, but there might be a bug or two I missed. 


Hopefully this Interactive Driver will be helpful! 


### Some Shortcuts:


Typing out the commands that the Interactive Driver asks can take a few minutes. Here are some quick starts to get you going. Just copy these numbers in to the first prompt and hit enter. Each number will be taken is as an input from you and the program will act accordingly. Don't worry about the numbers mean yet, you will figure it out as you play round with it! 


**For LinkedLists**:


List: [2, 3, 1]
What to copy: 1 1 0 1 c 1 0 2 c 1 1 3 c


List: [1, 4, 5, 3, 2, 6]
What to copy: 1 1 0 1 c 1 1 2 c 1 1 3 c 1 1 4 c 1 2 5 c 1 5 6 c


**For Stacks**:


Stack: [4, 3, 2, 1]
What to copy: 2 1 1 c 1 2 c 1 3 c 1 4 c 


Stack: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
What to copy: 2 1 10 c 1 9 c 1 8 c 1 7 c 1 6 c 1 5 c 1 4 c 1 3 c 1 2 c 1 1 c


**For Queues**:


Queue: [4, 3, 2, 1]
What to copy: 3 1 1 c 1 2 c 1 3 c 1 4 c 


Queue: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
What to copy: 3 1 1 c 1 2 c 1 3 c 1 4 c 1 5 c 1 6 c 1 7 c 1 8 c 1 9 c 1 10 c

