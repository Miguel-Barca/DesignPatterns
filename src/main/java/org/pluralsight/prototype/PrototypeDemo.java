package org.pluralsight.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Patterns in Java");

        System.out.println(movie);
        System.out.println(movie.getRunTime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie movieNum2 = (Movie) registry.createItem("Movie");
        movieNum2.setTitle("Gang of Four");

        System.out.println(movieNum2);
        System.out.println(movieNum2.getRunTime());
        System.out.println(movieNum2.getTitle());
        System.out.println(movieNum2.getUrl());
    }
}
