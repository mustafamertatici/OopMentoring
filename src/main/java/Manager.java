public class Manager extends Secretary implements Bonus {

  private   String project;

    int baseSalary;
    @Override
  int  calculateSalary(){
    System.out.println("manager");
    return baseSalary+BONUS;
  }

}
