import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1(){
        System.out.println("Задача 1");
int[] thing =new int[3];
thing[0]=1;
thing[1]=2;
thing[2]=3;


double[] numbers = {1.57, 7.654, 9.986};


int[] something = new int[5];
        something[0]=0;
        something[1]=1;
        something[2]=2;
        something[3]=3;
        something[4]=4;

    }
    public static void task2(){
        System.out.println("Задача 2");
        int[] thing =new int[3];
        thing[0]=1;
        thing[1]=2;
        thing[2]=3;
        for (int i=0;i<thing.length;i++){
            System.out.print(thing[i]);
            if(i!= thing.length-1){
                System.out.print(" ,");
            }
        }
        System.out.println();

        double[] numbers = {1.57, 7.654, 9.986};
        numbers[0]=1.57;
        numbers[1]=7.654;
        numbers[2]=9.986;
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
            if(i!= numbers.length-1){
                System.out.print(" ,");
            }
        }
        System.out.println();

        int[] something = new int[5];
        something[0]=0;
        something[1]=1;
        something[2]=2;
        something[3]=3;
        something[4]=4;
        for (int i=0;i<something.length;i++){
            System.out.print(something[i]);
            if(i!= something.length-1){
                System.out.print(" ,");
            }
        }
        System.out.println();
    }

    public static void task3(){
        System.out.println("Задача 3");
        int[] thing =new int[3];
        thing[0]=1;
        thing[1]=2;
        thing[2]=3;
        for (int i=thing.length-1;i>=0;i--){
            System.out.print(thing[i]);
            if(i!=0){
                System.out.print(" ,");
            }
        }
        System.out.println();

        double[] numbers = {1.57, 7.654, 9.986};
        numbers[0]=1.57;
        numbers[1]=7.654;
        numbers[2]=9.986;
        for (int i=numbers.length-1;i>=0;i--){
            System.out.print(numbers[i]);
            if(i!=0){
                System.out.print(" ,");
            }
        }
        System.out.println();

        int[] something = new int[5];
        something[0]=0;
        something[1]=1;
        something[2]=2;
        something[3]=3;
        something[4]=4;
        for (int i=something.length-1;i>=0;i--){
            System.out.print(something[i]);
            if(i!=0){
                System.out.print(" ,");
            }
        }
        System.out.println();
    }
    public static void task4(){
        System.out.println("Задача 4");
        int[] thing =new int[3];
        thing[0]=1;
        thing[1]=2;
        thing[2]=3;
        for ( int i=0;i< thing.length;i++){
            if (thing[i] % 2 != 0) {
                thing[i] = thing[i] + 1;
            }
        }
        System.out.println(Arrays.toString(thing));

    }



}