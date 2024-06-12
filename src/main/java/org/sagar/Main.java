package org.sagar;

import org.sagar.Iterator.BrowseHistory;

public class Main {
    public static void main(String[] args) {

        // ------------------------------Iterator Pattern------------------------------
        // Accesses the elements of an object sequentially without
        // exposing its underlying representation.
        var history = new BrowseHistory();
        history.push("www.google.com");
        history.push("www.google.com");
        System.out.println(history.pop());
        history.push("www.microsoft.com");
        history.push("www.amazon.com");

        var iterator = history.createIterator();
        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }

        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}