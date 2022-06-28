package org.pluralsight.factory;

import org.pluralsight.factory.contract.Website;
import org.pluralsight.factory.entities.WebsiteType;

import java.util.Calendar;

public class FactoryDemo {
    public static void main(String[] args) {
        //---- Everyday example ----//
//        Calendar calendar = Calendar.getInstance();
//
//        System.out.println(calendar);
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        Website blogPAge = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println("Our blog:" + blogPAge.getPages());

        Website shopPage = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        System.out.println("Our shop:" + shopPage.getPages());

    }
}
