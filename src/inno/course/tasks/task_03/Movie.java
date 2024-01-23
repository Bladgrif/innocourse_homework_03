package inno.course.tasks.task_03;

public class Movie {
    public String title;
    public Double rating;
    public String genre;
    public String country;
    public Boolean isThereAnOscar;

    public Movie(String title, Double rating, String genre, String country, Boolean isThereAnOscar) {
        this.title = title;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.isThereAnOscar = isThereAnOscar;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", isThereAnOscar=" + isThereAnOscar +
                '}';
    }
}
