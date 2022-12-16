public class Task {
    String title,priority,exp_date;

    public Task(String title, String priority) {
        this.title = title;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return title;
    }
}
