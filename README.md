# DataStructures

## Purpose
The purpose of the program is to generate 100 random integers and then build 
a binary search tree from those numbers.


## Solution   
	The program first generates 100 random integers between one and 99
then stores the numbers in a linked list to preserve the data. The 
numbers are stored in a linked list I made rather than the linked list
in the Java library to ensure my linked list behaves correctly. As the
numbers are generated and stored into the linked list they are also
added to the binary tree. A function is then called to traverse the binary
tree.
	The linked listed is made up of nodes from the node class. The node
class makes it possible for a node to store data and refer to the next node
by declaring the private class variables Node next and Object data.
Node next and Object data can then be set using the methods setData(Object value)
and setNext(Node nxtNode. Getters are defined in the class inorder to
to be able to access the class variables.
        The linked list class itself only defines the methods needed to satisfy 
requirements of the assignment, like add(Object value) and get(int index). The linked list
uses a dummy node, head, to indicate the beginning of the list. 
Add(Object value) stores object value into a temporary node. The method
starts at head and moves through the list using a while loop. When the loop
encounters a node whose next node is equal to null. The method sets that
node's next node to the temp node instead. For get(int index), the method
returns null if the index is equal to 0 because the first node, head is
just a dummy node. If index is greater than 0, the method moves through
the list using a for loop. As the loop moves though the list, current is 
set equal to the next node and the counter, i, is updated. If there is no next node
the method returns null. If i is equal to index, the for loop terminates
and returns the data stored in current.
        The BSTree class uses another class, treeNode, to build a binary
tree. The treeNode defines the behavior for the nodes used to build the
binary since they are different from the nodes used to build the linked
list. Although the binary tree is not built from a linked list, both
implementations of the data structures are refernece basedd. 
Every treeNode has a root, a left child and a right child of type
treeNode to enable building of tree. A value is also assigned to the treeNode.
In order to access the value the user must use the toString() method.
        The BSTree class itself has two insert methods, insert(int value)and
insert(treeNode node, int value). Insert(int value) calls  insert(treeNode node, int value)
to determine where to append int value on the tree.
        The BSTree also uses two methods to print out the values in the binary
tree. PrintTree() passes the beginning of the tree to printTree(treeNode node).
PrintTree(treeNode node) then recursively calls itself to print the left
most values first.

## Data Structures
Linked list and Binary tree
 
## Use
	To program accepts no input. The program outputs 100 randomly generated 
numbers then outputs the same 100 randomly generated numbers in sequential
order.
 
## Classses
	 The program uses a node class to define the behavior of the nodes used
to build the linked list. The program also uses a linked list class that
stores the data to be used to build the binary tree. The BSTree class 
is used to mimic the functions of the binary tree in the Java library 
needed to build a binary search tree.
  
