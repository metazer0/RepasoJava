import java.util.ArrayList;

public class Stacks {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");

        while (!s.isEmpty()) {
            System.out.println(s.take());
        }
    }
}

class Stack{

    private ArrayList<String> values;


    public Stack(){
        this.values = new ArrayList<String>();
    }

    public boolean isEmpty(){
        return this.values.isEmpty();
    }
    public void add(String value){
        this.values.add(value);
    }
    public ArrayList<String> values(){
        return values;
    }
    public String take(){
        String taken = values.get(values.size()-1);
        values.remove(values.size()-1);
        return taken;
    }
}
