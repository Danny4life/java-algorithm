package tutorial;

public class Table {
    synchronized void printTable(int n){
        for(int i = 1; i <= 5; i++){
            System.out.println(n * i);

            try{
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class Mythread1 extends Thread{
        Table t;

        public Mythread1(Table t) {
            this.t = t;
        }

       public void run(){
            t.printTable(5);

        }
    }

    static class Mythread2 extends Thread{
        Table t;

        public Mythread2(Table t) {
            this.t = t;
        }

        public void run(){
            t.printTable(100);

        }
    }
}
