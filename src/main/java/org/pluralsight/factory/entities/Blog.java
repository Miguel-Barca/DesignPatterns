package org.pluralsight.factory.entities;

import org.pluralsight.factory.contract.Website;
import org.pluralsight.factory.blogPages.AboutPage;
import org.pluralsight.factory.blogPages.CommentPage;
import org.pluralsight.factory.blogPages.ContactPage;
import org.pluralsight.factory.blogPages.PostPage;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
