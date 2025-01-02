package com.composition.polymophism.encapsulation.polymorphism;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }
    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title+ " is a "+ instanceType+" film");
    }

    //A factory method because it returns an new instance object
    //helps you obtain an object without knowing the details of how to create one.
    public static Movie getMovie(String type, String title){
         switch(type.toUpperCase().charAt(0)){
            case 'A': return new Adventure(title);
            case 'C': return new Comedy(title);
            case 'S': return new ScienceFiction(title);
            default: return new Movie(title);
        }
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Pleasant Scene", "Scary Music","Something Bad Happens");
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Something funny happens", "Something even funnier happens","Good ending");
    }
}

class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Bad Aliens do bad stuff", "Space Guys chase Aliens","Planet blows Up");
    }
}
