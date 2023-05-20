package Shelly;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Consumers {
    private List<Consumer> consumers;

    public Consumers() {
        this.consumers = new ArrayList<>();
    }

    public Consumers(List<Consumer>[] consumerList) {
        for (List<Consumer> newConsumer : consumerList) {
            consumers.addAll(newConsumer);
        }
        /*for (int i = 0; i < consumerList.length; i++) {
            consumers.add(consumerList);
        }*/
    }

    public void addConsumer(Consumer consumer) {
        consumers.add(consumer);
    }

    public List<Consumer> getConsumers() {
        Set<Consumer> uniqConsumer = new HashSet<Consumer>();
        return List.copyOf(uniqConsumer);
    }
}




