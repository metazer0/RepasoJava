public class Methods {
    public static void main(String[] args) {
//        printUntilNumber(2);
//        divisibleByThreeInRange(2,10);\
        String s = word();
        System.out.println(s);
    }

    public static void printUntilNumber(int number){
        int i = 0;
        while(i < number){
            System.out.println(i+1);
            i++;
        }
    }

    public static void divisibleByThreeInRange(int beginning, int end){
        for (int i = beginning ; i <= end ; i++ ){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }

    public static String word(){
        return "Hola";
    }
}
