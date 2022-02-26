package ch.designbees;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Workers disabledWorker = new DisabledWorker();
        Workers lazyWorker = new LazyWorker();
        Workers goodWorker = new GoodWorker();
        Workers childWorker = new ChildWorker();

        ArrayList workerList = new ArrayList<>();
        workerList.add(childWorker.getType());
        workerList.add(goodWorker.getType());
        workerList.add(disabledWorker.getType());
        workerList.add(lazyWorker.getType());

        ArrayList randomWorkerList = new ArrayList<>();
        int minimum = 2;
        int maksimum = 6;

        int randomNummer = ThreadLocalRandom.current().nextInt(minimum, maksimum + 1);

        for (int i = 1; i <= randomNummer; i++) {
            Random rand = new Random();

            int Rand_item = rand.nextInt(workerList.size());
            randomWorkerList.add(workerList.get(Rand_item));

        }
        System.out.println("random workers : "+randomWorkerList);
        findRepetetion(randomWorkerList,"goodWorker");

        int goodWorkerTotalSalary=findRepetetion(randomWorkerList,"goodWorker")* goodWorker.salary();
        int disabledTotalSalary=findRepetetion(randomWorkerList,"disabledWorker")* disabledWorker.salary();
        int lazyWorkerTotalSalary=findRepetetion(randomWorkerList,"lazyWorker")* lazyWorker.salary();
        int childWorkerTotalSalary=findRepetetion(randomWorkerList,"childWorker")* childWorker.salary();

        int totalSalary= goodWorkerTotalSalary+disabledTotalSalary+lazyWorkerTotalSalary+childWorkerTotalSalary;
           
        System.out.println("total salary =   "+totalSalary +" Chf");
    }



    public static int findRepetetion(ArrayList pList, String repetetion){
        int count = 0;
        for (int i = 0; i < pList.size(); i++) {

            if (repetetion ==(pList.get(i))) {
                count = count + 1;}
        }
        return count;
    }
}
