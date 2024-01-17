#include <stdio.h>
#include <stdlib.h>

// Node structure for a single node in the linked list
struct Node {
    int data;
    struct Node* next;
};

// LinkedList class
struct LinkedList {
    struct Node* head;

    // Function to initialize the linked list
    void (*initialize)(struct LinkedList* list);

    // Function to add a new node to the end of the list
    void (*append)(struct LinkedList* list, int data);

    // Function to display the linked list
    void (*display)(struct LinkedList* list);
};

// Function to initialize the linked list
void initializeLinkedList(struct LinkedList* list) {
    list->head = NULL;
}

// Function to add a new node to the end of the list
void appendToLinkedList(struct LinkedList* list, int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    if (newNode == NULL) {
        printf("Memory allocation failed.\n");
        exit(1);
    }

    newNode->data = data;
    newNode->next = NULL;

    if (list->head == NULL) {
        // If the list is empty, set the new node as the head
        list->head = newNode;
    } else {
        // Traverse the list to find the last node
        struct Node* current = list->head;
        while (current->next != NULL) {
            current = current->next;
        }

        // Append the new node to the end of the list
        current->next = newNode;
    }
}

// Function to display the linked list
void displayLinkedList(struct LinkedList* list) {
    struct Node* current = list->head;

    printf("Linked List: ");
    while (current != NULL) {
        printf("%d ", current->data);
        current = current->next;
    }
    printf("\n");
}

int main() {
    // Create a LinkedList object
    struct LinkedList myList;
    myList.initialize = initializeLinkedList;
    myList.append = appendToLinkedList;
    myList.display = displayLinkedList;

    // Initialize the linked list
    myList.initialize(&myList);

    // Append nodes to the linked list
    myList.append(&myList, 10);
    myList.append(&myList, 20);
    myList.append(&myList, 30);

    // Display the linked list
    myList.display(&myList);

    return 0;
}
