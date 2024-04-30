class phone{
    public void showtime(){
        System.out.println("this is 8 am");
    }
    public void on(){
        System.out.println("turning on the phone.......");
    }
}

class smartphone extends phone{
    public void music(){
        System.out.println("playing music.........");
    }
    public void on(){
        System.out.println("turning on smartphone...");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
       // phone obj=new phone();//allowed 
       // smartphone smobj=new smartphone();//allowed
       // obj.name();

       phone obj=new smartphone();//yes this is also allowed
       // smartphone obj2=new phone();//this is not allowed

        obj.showtime();
        obj.on();
       // smobj.on();
       // obj.music();//not allowed
    }
}
