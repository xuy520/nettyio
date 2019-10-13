package com.xy.tree.iterator;

public class BookShelf<T> implements Iteratable<T> {

    private T[] objects;
    private int index;

    public BookShelf(int index) {
        this.objects = (T[]) new Object[index];
        this.index = 0;
    }

    public T[] getObjects() {
        return objects;
    }

    public void setObjects(T[] objects) {
        this.objects = objects;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getLength() {
        return index;
    }

    public T getBook(int index) {
        return objects[index];
    }

    public void add(T t) {
        if (index >= objects.length) {
            System.out.println("装不下了");
            return;
        }
        objects[index] = t;
        index++;
    }

    public Iterator iterator() {

        return new IteratorBookShelf(this);
    }
}
