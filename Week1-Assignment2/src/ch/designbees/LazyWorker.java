package ch.designbees;

public class LazyWorker implements Workers{
    int costPerHour=23;
    int workHourPerWeek=40;
    int workHour=20;
    public LazyWorker() {
    }

    public int salary() {
       int salary = workHourPerWeek * costPerHour;
        return salary;
    }

public String getType() {
    String type ="lazyWorker";
    return type;
}
    public boolean work() {
        boolean isWork = true;
        if (workHourPerWeek > workHourPerWeek) {
            isWork = false;
        }
        return isWork;
    }
}
