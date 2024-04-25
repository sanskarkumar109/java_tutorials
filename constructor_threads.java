class mythar extends Thread{
    public mythar(String name){
        super (name);
    }
    public void run(){
        int i=34;
        System.out.println("thank you");
       // while(true){
         //   System.out.println("i am a thread");
        //}
    }
}
public class constructor_threads {
    public static void main(String[] args) {
       mythar t1=new mythar("sanskar");
       mythar t2=new mythar("ran charan");
       t1.start();
       t2.start();
       System.out.println("the is of threat t is " + t1.getId());
       System.out.println("the name of thread t is " +t1.getName());
       System.out.println("the id of thread t is " +t2.getId());
       System.out.println("the name of thread t is " + t2.getName()); 
    }
}
