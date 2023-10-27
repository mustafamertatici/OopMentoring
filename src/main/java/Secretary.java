public class Secretary extends Worker implements Bonus{

   // private Secretary() {
   // }

    public Secretary(int age, String department, int baseSalary) {
        this.age = age;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public Secretary() {
    }

    public Secretary(String department) {
        super.name = department;
    }

    private int age;
  private   String department;
    int baseSalary;
    @Override
    int  calculateSalary(){
        System.out.println("secretary");
        return baseSalary+BONUS;
    }


}
