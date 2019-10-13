package com.xy.tree.cls;

import java.util.Iterator;

public class BTS<T extends Comparable<T>> extends AbstractTree<T> {

    private Node<T> root;
    private int size = 0;

    public void add(T e) {
        if (root == null) {
            root = createNode(e);
        } else {
            Node<T> current = root;
            Node<T> parent = root;
            while (current != null) {
                if (e.compareTo(current.value) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.value) >= 0) {
                    parent = current;
                    current = current.right;
                }
            }
            if (e.compareTo(parent.value) < 0) {
                parent.left = createNode(e);
            } else {
                parent.right = createNode(e);
            }
        }
        size++;
    }

    private Node<T> createNode(T e) {
        Node<T> node = new Node<T>();
        node.value = e;
        return node;
    }

    public boolean search(T e) {
        return false;
    }

    public int getSize() {

        return size;
    }

    public Iterator<T> iterator() {
        return null;
    }


    public class Node<T> {
        private Node<T> left;
        private Node<T> right;
        private T value;

        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }
}
