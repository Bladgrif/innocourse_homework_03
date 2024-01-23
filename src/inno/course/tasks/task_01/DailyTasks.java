package inno.course.tasks.task_01;

public class DailyTasks {

    public void printToDoList() {
        String[] todoList = new String[5];
        todoList[0] = "Make the bed";
        todoList[1] = "Brush your teeth";
        todoList[2] = "Prepare breakfast";
        todoList[3] = "Work for 8 hours";
        todoList[4] = "Go to bed";

        for (String todoListItem : todoList) {
            System.out.println(todoListItem);
        }
    }
}
