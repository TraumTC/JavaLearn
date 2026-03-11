package day09;

public class SynchronizedTest {
    static void main(String[] args) {
//        myRunnable r1=new myRunnable();
//        Thread t1=new Thread(new myRunnable());
//        t1.start();
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                SynchronizedTest st=new SynchronizedTest();
                st.test("test");
            }).start();
        }

    }

    public  synchronized  void test(String string){
       synchronized (string){
           System.out.println("54188");
           try {
               Thread.sleep(3000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println("14588");
        }

    }
}
