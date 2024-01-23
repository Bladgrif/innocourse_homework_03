package inno.course.tasks.task_03;

public class Main {
    public static void main(String[] args) {
        OperationsWithMovie operationsWithMovie = new OperationsWithMovie();
        Movie[] films = new Movie[3];
        operationsWithMovie.addFilm(films);

        for (Movie filmsItem : films) {
            System.out.println(filmsItem);
        }
    }
}
