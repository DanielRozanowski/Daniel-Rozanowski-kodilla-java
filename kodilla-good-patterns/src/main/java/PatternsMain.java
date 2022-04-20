import com.kodilla.good.patterns.challenges.MovieStore;

class Application {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        movieStore.getMovies().values().stream()
                .flatMap(strings -> strings.stream())
                .forEach(s -> System.out.print(s+"! "));
    }
}