#include <iostream>
using namespace std;

class Node {
public:
    int key;
    Node* left;
    Node* right;

    Node(int value) {
        key = value;
        left = right = NULL;
    }
};

void insert(Node*& root, int value) {
    if (root == NULL) {
        root = new Node(value);
        return;
    } 
    else if (value <= root->key) {
        insert(root->left, value);
    } 
    else {
        insert(root->right, value);
    }
}

void inorder(Node* root) {
    if (root == NULL)
        return;

    inorder(root->left);
    cout << root->key << " ";
    inorder(root->right);
}

int main() {
    Node* root = NULL;
    int n, value;

    cout << "Enter number of elements: ";
    cin >> n;

    cout << "Enter the elements: ";
    for (int i = 0; i < n; i++) {
        cin >> value;
        insert(root, value);
    }

    cout << "Sorted output using BST (inorder traversal): ";
    inorder(root);
    cout << endl;

    return 0;
}
 