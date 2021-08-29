package com.company.week5.homework.task2;

public class CustomDoublyLinkList<T> {

    private class Node<T> {
        private final T element;
        private Node<T> next;
        private Node<T> prev;

        Node(T element) {
            this.element = element;
        }

        public T getElement() {
            return element;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }

        @Override
        public String toString() {
            return element + " ";
        }
    }


    private Node<T> first;
    private Node<T> last;
    private int size;


    public void add(T element) {
        checkDuplicate(element);
        Node<T> node = new Node<>(element);
        if (first == null) {
            first = node;
            last = first;
        } else {
            last.setNext(node);
            node.setPrev(last);
            last = node;
        }
        size++;
    }


    public void addFirst(T element) {
        checkDuplicate(element);
        Node<T> node = new Node<>(element);
        if (first == null) {
            first = node;
            last = first;
        } else {
            first.prev = node;
            node.next = first;
            first = node;
        }
        size++;
    }

    public void add(int index, T element) {
        indexValidation(index);
        checkDuplicate(element);

        Node<T> node = new Node<>(element);
        Node<T> currentNode;

        if (index == 0) {
            addFirst(element);
        } else if (index == size) {
            add(element);
        } else if (index < size / 2) {
            currentNode = first;
            for (int i = 0; i < size / 2; i++) {
                if (index == i) {
                    break;
                } else {
                    currentNode = currentNode.getNext();
                }
            }
            node.setNext(currentNode);
            node.setPrev(currentNode.getPrev());
            currentNode.getPrev().setNext(node);
            currentNode.setPrev(node);
        } else {
            currentNode = last;
            for (int i = size - 1; i >= size / 2; i--) {
                if (index == i) {
                    break;
                } else {
                    currentNode = currentNode.getPrev();
                }
            }
            node.setNext(currentNode);
            node.setPrev(currentNode.getPrev());
            currentNode.getPrev().setNext(node);
            currentNode.setPrev(node);
        }
        size++;
    }

    public int size() {
        return size;
    }

    public int find(T element) {
        int i = 0;
        Node<T> currentNode = first;
        if (element == null) {
            for (; i < size; i++) {
                if (currentNode.getElement() == null) {
                    return i;
                } else {
                    currentNode = currentNode.getNext();
                }
            }
        } else {
            for (; i < size; i++) {
                if (element.equals(currentNode.getElement())) {
                    return i;
                } else {
                    currentNode = currentNode.getNext();
                }
            }
        }
        return i == size ? -1 : i;
    }

    public boolean remove(T element) {
        int i = 0;
        Node<T> currentNode = first;
        if (element == null) {
            for (; i < size; i++) {
                if (currentNode.getElement() == null) {
                    break;
                } else {
                    currentNode = currentNode.getNext();
                }
            }
        } else {
            for (; i < size; i++) {
                if (element.equals(currentNode.getElement())) {
                    break;
                } else {
                    currentNode = currentNode.getNext();
                }
            }
        }
        if (i != size) {
            if (i == 0) {
                first = currentNode.getNext();
                currentNode.getNext().setPrev(null);
                currentNode.setNext(null);
            } else if (i == size - 1) {
                last = currentNode.getPrev();
                currentNode.getPrev().setNext(null);
                currentNode.setPrev(null);
            } else {
                currentNode.getPrev().setNext(currentNode.getNext());
                currentNode.getNext().setPrev(currentNode.getPrev());
                currentNode.setNext(null);
                currentNode.setPrev(null);
            }
            size--;
            return true;
        }
        return false;
    }

    private void indexValidation(int index) {
        if (index < 0 || index > size) {
            throw new RuntimeException(index + " is out of bound");
        }
    }

    private void checkDuplicate(T element) {
        if (find(element) >= 0) {
            throw new RuntimeException("Element already exists");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<T> current = first;
        while (current != null) {
            result.append(current);
            current = current.getNext();
        }
        return result.toString();
    }
}
