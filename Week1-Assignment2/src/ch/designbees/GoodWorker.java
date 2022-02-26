package ch.designbees;

public class GoodWorker implements Workers{
    int costPerHour=40;
    int workHourPerWeek=40;
    int workHour=40;
    public GoodWorker() {
    }

    public int salary() {
       int salary = workHourPerWeek * costPerHour;
        return salary;

    }
    public String getType() {
        String type ="goodWorker";
        return type;
    }
    public boolean work() {
        boolean isWork = true;
        if (workHourPerWeek >workHourPerWeek) {
            isWork = false;

        }
        return isWork;
    }
}


