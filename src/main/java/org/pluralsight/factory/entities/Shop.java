package org.pluralsight.factory.entities;

import org.pluralsight.factory.contract.Website;
import org.pluralsight.factory.shopPages.CartPage;
import org.pluralsight.factory.shopPages.ItemPage;
import org.pluralsight.factory.shopPages.SearchPage;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
