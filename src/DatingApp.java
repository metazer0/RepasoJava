public class DatingApp {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);

        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week = week + 1;
        }


        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
        //    System.out.println("Try " + date.afterNumberOfDays(790));
    }

}

class SimpleDate{
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance(){
        this.day++;
        if(this.day > 30){
            this.day = 1;
            if(this.month == 12){
                this.month = 1;
                this.year++;
            }else{
                this.month++;
            }
        }
    }

    public void advance(int howManyDays){
        this.day += howManyDays;
        if(this.day > 30){
            this.day -= 30;
            if(this.month == 12){
                this.month = 1;
                this.year++;
            }else{
                this.month++;
            }
        }
    }

    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(this.day,this.month,this.year);

        newDate.advance(days);

        return newDate;
    }
}
