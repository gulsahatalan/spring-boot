package ch.designbees;

public class DisabledWorker implements Workers {
    int costPerHour=10;
    int workHourPerWeek=40;
    int workHour=10;

    public DisabledWorker() {
    }

    public int salary() {
        int salary = workHourPerWeek * costPerHour;
        return salary;
    }

    public String getType() {
        String type ="disabledWorker";
        return type;
    }

    public boolean work() {
        boolean isWork = true;
        if (workHourPerWeek> workHourPerWeek) {
            isWork = false;
        }
        return isWork;
    }
}

