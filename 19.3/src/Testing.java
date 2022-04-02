public class Testing {
    public static void main (String[] args){
        MyOuterClass myOuterClassInstance1 = new MyOuterClass();
        MyOuterClass.MyInnerClass myInnerClassInstance1 = myOuterClassInstance1.new MyInnerClass();
        MyOuterClass.MyInnerClass myInnerClassInstance2 = myOuterClassInstance1.init();
        myInnerClassInstance1.printNumber();
        myInnerClassInstance2.printNumber();
    }
}
