package com.xy.tree.iterator;

public class MainTest {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf<Book>(10);
        bookShelf.add(new Book("1"));
        bookShelf.add(new Book("2"));
        bookShelf.add(new Book("3"));
        bookShelf.add(new Book("4"));
        bookShelf.add(new Book("5"));
        bookShelf.add(new Book("6"));
        bookShelf.add(new Book("7"));
        bookShelf.add(new Book("8"));
        bookShelf.add(new Book("1"));
        bookShelf.add(new Book("1"));
        bookShelf.add(new Book("1"));
        Iterator<Book> t = bookShelf.iterator();
        while (t.hasNext()) {
            System.out.println(t.next().getName());
        }
    }
}
