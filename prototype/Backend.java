public class Backend {
    //account class
    record Account(int account_id, String firstName, String lastName, Boolean isHost){}

    record Movie(int movie_id, String name, String genre, int rating, Interest interest){}

    record MovieEvent(int event_id, Movie movie, String hostFirstName, String hostLastName, Location location, String time, String date){}

    record Location(String eircode){}

    record Interest(int interestID, Account account, Movie movie){}
}
