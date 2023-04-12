package Volatile;


public class Volatile {

    private static volatile int MY_INT = 0;

    public static void main(String[] args) {

        ChangeMaker changeMaker = new ChangeMaker();
        changeMaker.start();

        ChangeListener changeListener = new ChangeListener();
        changeListener.start();

    }

    static class ChangeMaker extends Thread {

        @Override
        public void run() {
            while (MY_INT < 5){
                System.out.println("Incrementing MY_INT "+ ++MY_INT);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    static class ChangeListener extends Thread {

        int local_value = MY_INT;

        @Override
        public void run() {
            while ( MY_INT < 5){
                if( local_value!= MY_INT){
                    System.out.println("Got Change for MY_INT "+ MY_INT);
                    local_value = MY_INT;
                }
            }
        }
    }

}