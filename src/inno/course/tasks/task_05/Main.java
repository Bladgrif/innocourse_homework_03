package inno.course.tasks.task_05;

import inno.course.tasks.task_03.Movie;
import inno.course.tasks.task_03.OperationsWithMovie;

public class Main {
    public static void main(String[] args) {
        /*Честно говоря не совсем понял задание, в 3 задаче создаем список и заполняем его фильмами,
        а в этой задаче нужно вывести поля объектов из того списка.
        Но список создавался при запуске 3 задачи, поэтому вывел заполнение списка в отдельный метод,
        чтобы можно было вызвать его из этого класса.
        Ну типа камон, список я должен создавать в методе psvm 3 задачи. Как я к нему обратиться должен? я не знаю.
        */
        OperationsWithMovie operationsWithMovie = new OperationsWithMovie();
        Movie[] films = new Movie[3];
        operationsWithMovie.addFilm(films);

        for (Movie filmsItem : films) {
            System.out.println(filmsItem.isThereAnOscar); // в 3 задании не задавали поле год, поэтому выведу наличие Оскара
            System.out.println(filmsItem.title);
            System.out.println(filmsItem.genre);
            System.out.println(filmsItem.rating);
        }
    }
}
