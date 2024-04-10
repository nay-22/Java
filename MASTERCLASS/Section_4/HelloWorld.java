package MASTERCLASS.Section_4;

class HelloWorld {
    public static void main(String[] args) {
        double valOne = 20.00;
        double valTwo = 80.00;
        double res = (valOne+valTwo)*100;
        double rem = res%40.00;
        boolean val = false;
        if(rem==0.00) {
            val = true;
        }
        System.out.println(val);
        if(!val) {
            System.out.println("got some remainder");
        }
    }
}