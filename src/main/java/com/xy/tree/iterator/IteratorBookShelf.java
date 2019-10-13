package com.xy.tree.iterator;

public class IteratorBookShelf<T> implements Iterator<T> {

    private BookShelf<T> bookShelf;
    private int index;

    public BookShelf<T> getBookShelf() {
        return bookShelf;
    }

    public void setBookShelf(BookShelf<T> bookShelf) {
        this.bookShelf = bookShelf;
    }

    IteratorBookShelf(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    public T next() {
        T t = bookShelf.getBook(index);
        index++;
        return t;
    }
}
