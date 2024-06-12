package org.sagar.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private final List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        return urls.removeLast();
    }

    public Iterator<String> createIterator() {
        return new ListIterator(this);
    }

    // If there is any change in browseHistory
    // only this class implementation has to be changed
    // no other code will be reflected (e.g. main class)
    public static class ListIterator implements Iterator<String> {
        private final BrowseHistory history;
        private int index = 0;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
