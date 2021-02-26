package pattern.observer;

import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

class Event<TArgs> {
    private int count = 0;
    private Map<Integer, Consumer<TArgs>> handlers = new HashMap<>();

    public Subscription addHandler(Consumer<TArgs> handler){
        int i = count;
        handlers.put(count++, handler);
        return new Subscription(this, i);
    }

    public void fire(TArgs args){
        for (Consumer<TArgs> handler: handlers.values()){
            handler.accept(args);
        }
    }

    @AllArgsConstructor
    public class Subscription implements AutoCloseable{

        private Event<TArgs> events;
        private int id;

        @Override
        public void close() {
            events.handlers.remove(id);
        }
    }
}

@AllArgsConstructor
class PropertyChangedEventArgs{
    public Object source;
    public String propertyName;

}

class Person{
    public Event<PropertyChangedEventArgs> propertyChanged = new Event<>();
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (this.age == age) return;
        this.age = age;
        propertyChanged.fire(new PropertyChangedEventArgs(this, "age"));
    }
}

public class SolutionObserver {
    public static void main(String[] args) {
        Person person = new Person();
        final Event<PropertyChangedEventArgs>.Subscription sub = person.propertyChanged.addHandler(x -> {
            System.out.println("Person's " + x.propertyName + " has changed");
        });

        person.setAge(22);
        person.setAge(35);
        sub.close();
        person.setAge(45);

    }
}
