public class TryCatchFinally {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        try{
            System.out.println(a[3]);
        } catch (RuntimeException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println(a[2]);
            System.out.println("What exactly is this biko?");
        }
        System.out.println("The rest of the code");
    }

}
