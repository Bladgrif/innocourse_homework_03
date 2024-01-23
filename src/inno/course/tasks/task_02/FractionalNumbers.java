package inno.course.tasks.task_02;

public class FractionalNumbers {
    public void printFractionalNumbers() {
        Double[] listOfFloat = {Math.PI, Math.E, 1.0};

        for (Double listOfFloatItem : listOfFloat) {
            System.out.println(String.format("%.5f", listOfFloatItem));
        }
    }
}
