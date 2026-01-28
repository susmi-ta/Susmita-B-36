import java.util.Arrays;
public class array_change{
    public static void main(String args[]){
        int[] arr={10,20,30,40,50};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num){
        num[0]=60;
        num[1]=70;
        num[2]=70;
        num[3]=70;
        num[4]=70;
    }
}