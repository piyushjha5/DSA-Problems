Linked List
Array limitations:
Fixed-size
Physically stored in consecutive memory locations
To insert or delete items, may need to shift data
Variations of linked list: linear linked list, circular linked list, double linked list
head pointer "defines" the linked list (it is not a node)

Advantages of Linked Lists
The items do NOT have to be stored in consecutive memory locations.
So, can insert and delete items without shifting data.
Can increase the size of the data structure easily.
Linked lists can grow dynamically (i.e. at run time) – the amount of memory space allocated can grow and shrink as needed.
Disadvantages of Linked Lists
A linked list will use more memory storage than arrays. It has more memory for an additional linked field or next pointer field.
Linked list elements cannot randomly be accessed.
Binary search cannot be applied in a linked list.
A linked list takes more time to traverse of elements.
Node
A linked list is an ordered sequence of items called nodes
A node is the basic unit of representation in a linked list
A node in a singly linked list consists of two fields:
A data portion
A link (pointer) to the next node in the structure
The first item (node) in the linked list is accessed via a front or head pointer
The linked list is defined by its head (this is its starting point)
We will use ListNode and LinkedList classes (https://youtu.be/Dfu7PeZ3v2Q)
class Node {
    public:
        int info; // data
        Node* next; // pointer to next node in the list
        /*Node(int val) {info = val; next=NULL;}*/
};

class List {
    public:
        // head: a pointer to the first node in the list. 
        // Since the list is empty initially, head is set to NULL
        List(void) {head = NULL;} // constructor
        ~List(void);			  // destructor
    
    private:
        Node* head;
};
// isEmpty, insertNode, findNode, deleteNode, displayList
Boundary condition
Empty data structure
Single element in the data structure
Adding/removing beginning of the data structure
Adding/removing end of the data structure
Working in the middle
Insertion at the beginning in Linked List
https://youtu.be/yMoHuOZzMpk
It is just a 2-step algorithm:
New node should be connected to the first node, which means the head. This can be achieved by assigning the address of the node to the head.
New node should be considered as a head. It can be achieved by declaring head equal to a new node.
void insertStart(int val) { 
    Node *node = new Node; // create a new node (node=node)
    node->info=val; // put value

    if(head == NULL) { // check if the list is empty
        head = node; 
        node->next = NULL
    }
    else { // if list is not empty
        node->next = head; 
        head = node; 
    }
}
Insertion at the end in Linked List
void insertEnd(int val) {
    Node *node = new Node; // create a new node
    node->info = val; // put value
    node->next = NULL; // pointer of last node is NULL 

    if(head == NULL) { // if empty
        node->next = NULL
        head = node;
    }
    else { 
        Node *cur = new Node();
        cur = head;
        while(cur->next != NULL) {
            cur = cur->next;
        }
        cur->next = node;
    }
}
Insertion at a particular position
In this case, we don’t disturb the head and tail nodes. Rather, a new node is inserted between two consecutive nodes.
We call one node current and the other previous, and the new node is placed between them.
Two steps we need to insert between previous and current:
Pass the address of the new node in the next field of the previous node.
Pass the address of the current node in the next field of the new node.
void insertPosition(int pos, int val) {
    Node *pre; 
    Node *cur; 
    Node *node = new Node;

    node->data = val; 
    cur = head; 

    for(int i=1; i<pos; i++) {
        pre = cur; 
        cur = cur->next; 
    } 
    pre->next = node; 
    node->next = cur; 
}
void insertSpecificValue(int sp_val, int data) {     
    Node *pre; 
    Node *cur; 
    Node *node = new Node;

    node->info = data; 
    cur = head; // "current" in the beginning points to head, and "previous" points to NULL

    while(cur->data != sp_val) {
        pre = cur; 
        cur = cur->next; 
    } 
    node->next = cur;            
    cur->next = node; 
}
Deleting the first node from a Linked List
Following steps, we need to remove the first node:
Check if the linked list exists or not if(head == NULL).
Check if it is an element list.
However, if there are nodes in the linked list, then we use a pointer variable PTR that is set to point to the first node of the list. For this, we initialize PTR with Head that stores the address of the first node of the list.
Head is made to point to the next node in sequence and finally, the memory occupied by the node pointed by PTR is freed and returned to the free pool.
void deleteFirst() {
    if(head == NULL) { // if empty
        cout << "Underflow" << endl;
    }
    else if(head.next == NULL) { // if only one element
        Node *ptr;
        ptr = head;
        head = NULL;
        delete ptr;
    }
    else { // otherwise
        Node *ptr;
        ptr = head;
        head = head->next;
        delete ptr;
    }
}
Deleting the last node from a Linked List
Following steps we need to remove the first node:
Check if the linked list exists or not if(head == NULL).
Check if it is an element list.
Take a pointer variable PTR and initialize it with head. That is, PTR now points to the first node of the linked list. In the while loop, we take another pointer variable PREPTR such that it always points to one node before the PTR. Once we reach the last node and the second last node, we set the NEXT pointer of the second last node to NULL, so that it now becomes the (new) last node of the linked list. The memory of the previous last node is freed and returned back to the free pool.
STEP 1: IF START = NULL
        WRITE UNDERFLOW
        Go to STEP 8
        [END OF IF]
STEP 2: SET PTR = START
STEP 3: REPEAT Steps 4 and 5 while PTR->NEXT != NULL
STEP 4:     SET PREPTR = PTR
STEP 5:     SET PTR = PTR->NEXT
        [END OF LOOP]
STEP 6: SET PREPTR->NEXT = NULL
STEP 7: FREE PTR
STEP 8: EXIT
Deleting the Specific Node in a Linked List
Step 1: IF START = NULL
        Write UNDERFLOW Go to Step 10
        [END OF IF]
Step 2: SET PTR = START
Step 3: SET PREPTR = PTR
Step 4: Repeat Steps 5 and 6 while PREPTR-> DATA I = NUM
Step 5: SET PREPTR = PTR
Step 6: SET PTR = PTR -> NEXT
        [END OF LOOP)
Step 7: SET TEMP = PTR
Step 8: SET PREPTR -> NEXT - PTR-> NEXT
Step 9: FREE TEMP
Step 10: EXIT
Circular Linked List
https://youtu.be/7ELt4-z4YeI
In a circular linked list, the last node contains a pointer to the first node.
No node points to NULL!
Start at head, and iterate until you find head again: t == head, t.next == head
Complexity for all operations is O(n)
class  Node {
    int info;
    Node *next;
};

class CircularLList {
    public:
        Node *last;

    CircularLList() {
        last = NULL;
    }
};
Insertion at Beginning in Circular Linked List
void addBegin(int val) {
    Node *temp = new Node();
    temp->info=val;

    if (last == NULL) { // if empty
        last = temp;
        temp->next = last; // points next to itself // in simple LL it pointed to NULL
    }
    else {
        temp->next = last;
        last = temp;
    }
Insertion at the End in Circular Linked List
while cur->next != last) {
    cur = cur->next;
}
cur->next = New;
New->next = last; 
Insertion at Particular Position in Circular Linked List
void insertNode(int item,int pos) {
    Node *New = new Node();
    Node *prev;
	Node *cur;
	New->data = item;    

	if(last == NULL){	// insert into empty list
		last = New;
		last->next = last;
   	}

	prev = last;
	cur = last->next;

	for (int i=1; i<pos; i++) {
        prev = cur;
	    cur = cur->next;
	} 	

    New->next = cur;	
	prev->next = New;
}
Deletion of a Node in Circular Linked List
From a single-node circular linked list (node points to itself):
last = NULL;
delete cur;
Delete the head node:
while(prev->next != last) {
    prev = cur; 
    cur = cur->next;
}
prev->next = cur->next;	
delete cur;
Delete a middle node Cur:
for(i=1; i<=pos; i++) {
    prev = cur; 
    cur = cur->next;
}
prev->next = cur->next;
delete cur;
Delete the end node:
while(cur->next != last) { 
    prev = cur; 
    cur = cur->next;
}
prev->next = cur->next;   
delete cur;
Doubly Linked List
https://youtu.be/v8xyoI11PsU
DLL contains a pointer to the next as well as the previous node in the sequence. Therefore, it consists of three parts:
data
a pointer to the next node
a pointer to the previous node
class Node {
    int info;
    Node *next;
    Node *pre;
}
