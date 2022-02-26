package ch.designbees;


public class ChildWorker implements Workers{
    int costPerHour=10;
    int workHourPerWeek=40;
    int workHour=30;
    String type ="childWorker";

    public String getType() {
        String type ="childWorker";
        return type;
    }

    public ChildWorker() {
    }

    public int salary() {
        int salary = workHourPerWeek * costPerHour;
        return salary;
    }
    public boolean work() {
        boolean isWork = true;
        if (workHourPerWeek > workHourPerWeek) {
            isWork = false;
        }
        return isWork;
    }
}


