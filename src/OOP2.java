public class OOP2 {
    public static void main(String[] args) {
        // You can test your program here
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}

class Timer{
    ClockHand hundredths;
    ClockHand seconds;
    public Timer(){
        this.hundredths = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    public String toString(){
        return this.seconds+":"+this.hundredths;
    }
    public void advance(){

        if(this.hundredths.value() >= 99){
            this.seconds.advance();
        }

        this.hundredths.advance();

    }
}

class ClockHand{

    private int value;
    private int limit;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void advance() {
        this.value = this.value + 1;

        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    public int value() {
        return this.value;
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }

        return "" + this.value;
    }
}
