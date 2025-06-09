package bai_tap.bai11.MyArrayListNangCao;

public class MyLinkedList<E> {
    private Node<E> head;
    private int numNodes;

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        numNodes++;
    }

    public void add(int index, E element) {
        if (index == 0) {
            addFirst(element);
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            Node<E> newNode = new Node<>(element);
            newNode.next = temp.next;
            temp.next = newNode;
            numNodes++;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) return null;

        Node<E> removedNode;
        if (index == 0) {
            removedNode = head;
            head = head.next;
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            removedNode = temp.next;
            temp.next = temp.next.next;
        }
        numNodes--;
        return removedNode.getData();
    }

    public boolean remove(Object e) {
        if (head == null) return false;
        if (head.getData().equals(e)) {
            head = head.next;
            numNodes--;
            return true;
        }

        Node<E> temp = head;
        while (temp.next != null) {
            if (temp.next.getData().equals(e)) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public boolean contains(E o) {
        Node<E> temp = head;
        while (temp != null) {
            if (temp.getData().equals(o)) return true;
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node<E> temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.getData().equals(o)) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) return null;
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.getData();
    }

    public E getFirst() {
        if (head == null) return null;
        return head.getData();
    }

    public E getLast() {
        if (head == null) return null;
        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.getData();
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> newList = new MyLinkedList<>();
        Node<E> temp = head;
        while (temp != null) {
            newList.addLast(temp.getData());
            temp = temp.next;
        }
        return newList;
    }

    public void printList() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
