import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {
    private Queue<T> queue = new LinkedList<>();

    public void addTransport(T transport) {
        queue.offer(transport);
    }
    public void carryOutTechnicalInspectionOfTheCar (){
        queue.poll();
    }


}