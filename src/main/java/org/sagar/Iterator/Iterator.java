package org.sagar.Iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
