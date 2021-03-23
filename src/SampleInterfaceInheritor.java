public class SampleInterfaceInheritor implements SampleInterface{
    @Override
    public int sayHello() {
        return 0;
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Good bye y'all");
    }

    @Override
    public String sayMyName() {
        return "Sorry Doctor Vee ... No vex, we've modified your response";
    }
}
