import java.util.ArrayList;

public class Repository {
    public ArrayList<Film> getData() {
        ArrayList<Film> listFilm = new ArrayList<>();
        //id = listFilm.size(), để tự động sinh id tự tăng
        listFilm.add(new Film(listFilm.size(), "Red notice", "US Movie, Action, Comedies", 117, "Netflix", 2021));
        listFilm.add(new Film(listFilm.size(), "Annabelle: Comes home", "US Movie, Horror", 106, "Warner Bros. Pictures", 2019));
        listFilm.add(new Film(listFilm.size(), "Jumanji", "US Movie, Family Movie, Teen Movie", 119, "Columbia Pictures", 2017));
        listFilm.add(new Film(listFilm.size(), "The Amazing Spider-man", "Sci-Fi, Action & Adventure, US Movie", 136, "Columbia Pictures", 2021));
        return listFilm;
    }
}

