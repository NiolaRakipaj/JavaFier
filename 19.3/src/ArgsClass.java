public class ArgsClass {
    void printNumbers(int firstArg,int ...numbers){
        System.out.println("First argument "+ firstArg);
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
