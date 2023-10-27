public class Runner {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        Worker worker=new Worker();
        Manager manager=new Manager();
        Secretary secretary=new Secretary();

        Worker secretary1=new Secretary();
        calculator.giveMeResult(secretary1);

    }
}
