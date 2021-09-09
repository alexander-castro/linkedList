package models;

public abstract class LinkedList<T> {
    protected Node<T> first;

    public void addElement(Node<T> node) {
        Node<T> actual = first;
        while (null != actual.getNext()) {
            actual = actual.getNext();
        }
        actual.setNext(node);
    }
}
