package com.xy.tree.ins;

public interface Tree<T> extends Iterable<T> {
    void add(T e);

    boolean search(T e);

    int getSize();
}
