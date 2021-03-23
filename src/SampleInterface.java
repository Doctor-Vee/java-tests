public interface SampleInterface {
    int sayHello();
    void sayGoodbye();

    default String sayMyName(){
        return "Doctor Vee";
    }

    static String saySomethingElse(){
        return "Helo word";
    }
}
