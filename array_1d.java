public class array_1d {
    public static void main(String[] args) {
        int arr[];
        arr = new int[20];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[5]=50;
        arr[4]=40;
        arr[6]=60;
        arr[7]=70;
        arr[8]=80;
        arr[9]=90;
        arr[10]=100;
        arr[11]=110;
        arr[12]=120;
        arr[13]=130;
        arr[14]=140;
        arr[15]=150;

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("array at index "+i+" is : "+arr[i]);
        }

    }
}
