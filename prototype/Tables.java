public class Tables {
    public record Account(int account_id, String firstName, String lastName, Boolean isHost){}

    //add interest
    public record Movie(int movie_id, String name, String genre, double rating){}

    public record MovieEvent(int event_id, Movie movie, String hostFirstName, String hostLastName, Location location, String time, String date){}

    public record Location(String eircode){}

    public record Interest(int interestID, Account account, Movie movie){}

}
