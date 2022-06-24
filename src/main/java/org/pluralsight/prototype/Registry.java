package org.pluralsight.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Star Wars");
        movie.setPrice(30.00);
        movie.setRunTime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setPrice(19.99);
        book.setTitle("Picture of Dorian Gray");
        items.put("Book", book);
    }

    public Item createItem (String type) {
        Item item = null;

        try {
            item = (Item)(items.get(type)).clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }


}
