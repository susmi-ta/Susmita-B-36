#include <stdio.h>
#include <stdlib.h>

// Definition of a node in the binary search tree
struct Node {
    int data;
    struct Node* left;
    struct Node* right;
};

// Function to create a new node
struct Node* createNode(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// Function to insert a node into the binary search tree
struct Node* insertNode(struct Node* root, int value) {
    if (root == NULL) {
        return createNode(value);
    }

    if (value < root->data) {
        root->left = insertNode(root->left, value);
    } else if (value > root->data) {
        root->right = insertNode(root->right, value);
    }

    return root;
}

// Recursive function to search for an element in the binary search tree
int searchElement(struct Node* root, int value) {
    if (root == NULL) {
        return 0; // Element not found
    }

    if (root->data == value) {
        return 1; // Element found
    }

    if (value < root->data) {
        return searchElement(root->left, value); // Search in the left subtree
    } else {
        return searchElement(root->right, value); // Search in the right subtree
    }
}

int main() {
    struct Node* root = NULL;
    int choice, value;

    do {
        printf("1. Insert element\n2. Search element\n3. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the value to insert: ");
                scanf("%d", &value);
                root = insertNode(root, value);
                break;
            case 2:
                printf("Enter the value to search: ");
                scanf("%d", &value);
                if (searchElement(root, value)) {
                    printf("Element %d found in the binary search tree.\n", value);
                } else {
                    printf("Element %d not found in the binary search tree.\n", value);
                }
                break;
            case 3:
                break;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    } while (choice != 3);

    return 0;
}
