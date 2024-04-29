public class denofunction {
    public void add(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }
    public void mul(int a,int b){
        int c=a*b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        denofunction d=new denofunction();
        d.add();
        d.mul(10,20);
    }
}
