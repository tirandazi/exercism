import java.lang.reflect.Array;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {

    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    Node<T> head;
    Node<T> tail;
    int length;

    SimpleLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    SimpleLinkedList(T[] values) {
        for (T value : values) {
            push(value);
        }
    }

    void push(T value) {
        Node<T> newNode = new Node<>(value);
        length++;

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    T pop() {
        if (head == null)
            throw new NoSuchElementException();

        Node<T> currentNode = head;
        length--;

        if (currentNode.next == null) {
            head = null;
            return currentNode.data;
        }

        while (currentNode.next.next != null)
            currentNode = currentNode.next;
        tail = currentNode;
        currentNode = currentNode.next;
        tail.next = null;
        return currentNode.data;
    }

    void reverse() {
        if (head == null)
            return;
        Node<T> currNode = head;
        Node<T> prevNode = null;
        Node<T> nextNode = currNode.next;
        while (currNode.next != null) {
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
            nextNode = nextNode.next;
        }
        currNode.next = prevNode;
        head = currNode;
    }

    T[] asArray(Class<T> clazz) {
        reverse();
        Node<T> currentNode = head;
        T[] outArray = (T[]) Array.newInstance(clazz, length);
        for (int i = 0; i < length; i++) {
            outArray[i] = currentNode.data;
            currentNode = currentNode.next;
        }
        return outArray;
    }

    int size() {
        return length;
    }
}
