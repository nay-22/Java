package MASTERCLASS.Section_8.Polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","One Piece");
        movie.watchMovie();

        System.out.println();

        ScienceFiction mov = (ScienceFiction) Movie.getMovie("S","Star Wars");
        mov.watchMovie();

        Object comedy = Movie.getMovie("C","Airplane");
        Comedy comMov = (Comedy) comedy ;
        comMov.watchMovie();

        System.out.println();

        var airplane = Movie.getMovie("C","Airplane");
        airplane.watchMovie();

        System.out.println();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("S","Gintama");
        if(unknownObject.getClass().getSimpleName().equals("Comedy")) {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if(unknownObject instanceof Adventure) {
            ((Adventure)unknownObject).watchAdventure();
        } else if(unknownObject instanceof ScienceFiction scify) {
            scify.watchScienceFiction();
        }
    }
}
