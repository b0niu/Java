package zad1;

public class Sort {
    private sortStrategy strategy;

    public void set(sortStrategy strat) {
        this.strategy = strat;
    }

    public void print(int[] arr){

        long tStart = System.currentTimeMillis();
        int[] array = strategy.sort();
        long tEnd = System.currentTimeMillis();
        double czas = tEnd - tStart;
        //double czas=elapsedSeconds;

        System.out.println("Czas: "+czas+'\n');
    }
}
