package MASTERCLASS.Section_8.Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Enter Type (A -> Adventure, C -> Comedy, S -> Science Fiction, or Q -> Quit) ");
            String type = in.nextLine();
            if("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title : ");
            String title = in.nextLine();
            Movie movie = Movie.getMovie(type,title); // Important -> calls the static method to assign class type of the movie
            movie.watchMovie();
        }



    }
}
