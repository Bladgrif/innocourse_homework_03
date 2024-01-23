package inno.course.tasks.task_06;

public class Names {
    public String[] createListOfNames(int count) {
        String[] listOfNames = new String[count];
        return listOfNames;
    }

    public String [] addNamesToTheList (String [] emptyList, String[] listOfNames) {
        for (int i = 0; i < emptyList.length; i++) {
            emptyList[i] = listOfNames[i];
        }
        return emptyList;
    }
}
