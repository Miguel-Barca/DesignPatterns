package org.pluralsight.factory;

import org.pluralsight.factory.contract.Website;
import org.pluralsight.factory.entities.Blog;
import org.pluralsight.factory.entities.Shop;
import org.pluralsight.factory.entities.WebsiteType;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return null;
        }
    }
}
