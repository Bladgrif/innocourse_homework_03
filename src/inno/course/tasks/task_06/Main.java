package inno.course.tasks.task_06;

public class Main {

    public static void main(String[] args) {
        Names names = new Names();
        String[] listOfNames = names.createListOfNames(10);
        String[] listWithTenNames = {"Анна", "Бенджамин", "Кэтрин", "Дэвид", "Эмили", "Фрэнк", "Грэйс", "Харри", "Иван", "Джейн"}; // создаем список с тем количество имен, которое нам нужно
        names.addNamesToTheList(listOfNames,listWithTenNames);

        for (int i = 0; i < 3; i++) { //выводим первые три элемента
            System.out.println(listOfNames[i]);
        }
    }
}
