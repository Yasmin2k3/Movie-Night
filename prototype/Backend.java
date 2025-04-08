import java.util.ArrayList;

public class Backend {

    public ArrayList<Tables.Movie> createMovieSamples(){
        ArrayList<Tables.Movie> movieSamples = new ArrayList<>();
        movieSamples.add(new Tables.Movie(1, "Avatar", "Science Fiction/Adventure/Action", 7.9));
        movieSamples.add(new Tables.Movie(2, "Avengers: Endgame", "Science Fiction/Adventure/Action", 8.4));
        movieSamples.add(new Tables.Movie(3, "Titanic", "Romance/Tragedy/Drama", 7.9));
        return movieSamples;
    }

    public ArrayList<Tables.Account> createAccountSamples(){
        ArrayList<Tables.Account> accountSamples = new ArrayList<>();
        accountSamples.add(new Tables.Account(1, "Yasmin", "Woodlock", false));
        accountSamples.add(new Tables.Account(2, "April", "Gilhool", false));
        accountSamples.add(new Tables.Account(3, "Skye", "FitzPatrick", true));
        return accountSamples;
    }

    public ArrayList<Tables.MovieEvent> createMovieEventSamples(){
        ArrayList<Tables.MovieEvent> movieEventSamples = new ArrayList<>();
        Tables.Movie movie = new Tables.Movie(4, "Inside Out 2", "Coming-of-age/Comedy/Adventure", 7.5);
        Tables.Location location = new Tables.Location("I42 AI10");
        movieEventSamples.add(new Tables.MovieEvent(1, movie, "Skye", "FitzPatrick", location, "4:30", "9th April"));
        return movieEventSamples;
    }
}
