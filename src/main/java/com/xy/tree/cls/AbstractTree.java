package com.xy.tree.cls;

import com.xy.tree.ins.Tree;

abstract class AbstractTree<T> implements Tree<T> {

    boolean isEmpty() {
        return getSize() == 0;
    }
}
