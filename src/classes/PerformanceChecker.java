package classes;
import java.util.HashMap;
import java.util.Map;

public class PerformanceChecker implements Runnable{
    private final DealerSite dealerSite;
    private final HashMap<Character, Integer> perfTable;
    public PerformanceChecker(DealerSite dealerSite){
        this.dealerSite = dealerSite;
        this.perfTable = new HashMap<>();
        this.perfTable.put('F', 0);
        this.perfTable.put('E', 1);
        this.perfTable.put('D', 5);
        this.perfTable.put('C', 10);
        this.perfTable.put('B', 15);
        this.perfTable.put('A', 20);
    }

    @Override
    public void run() {
        for (Employee employee : dealerSite.getEmployees()){
            for (Map.Entry<Character, Integer> perf : this.perfTable.entrySet()){
                if (employee.getNumOfSales() >= perf.getValue() && employee.getPerformanceClass() > perf.getKey()){
                    employee.setPerformanceClass(perf.getKey());
                }
            }
        }
    }
}
