

public class TesrLogger {
    public static void main(String args[]){
        Logger instance1=Logger.getInstance();
        Logger instance2=Logger.getInstance();
        instance1.log("First message");
        instance2.log("Second message");
        System.out.println("Same instance? "+(instance1==instance2));
    }
}
