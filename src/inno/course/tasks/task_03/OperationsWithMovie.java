package inno.course.tasks.task_03;

public class OperationsWithMovie {
    public void addFilm(Movie [] list) {
        Movie LifeIsGood = new Movie("Life is good", 7.8, "comedy", "USA", true);
        Movie LifeIsBad = new Movie("Life is bad", 7.9, "horror", "USA", true);
        Movie LifeIsStrange = new Movie("Life is strange", 8.1, "fantastic", "USA", true);

        list[0] = LifeIsGood;
        list[1] = LifeIsBad;
        list[2] = LifeIsStrange;
    }
}
