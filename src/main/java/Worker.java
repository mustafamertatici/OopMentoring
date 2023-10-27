public class Worker extends People implements Bonus {


    int baseSalary;

        @Override
    int  calculateSalary(){
        System.out.println("worker");
        return baseSalary+BONUS;
    }

    private String giveMeName(){
        return this.name;
    }


}
