public class University_main {

    public static void main(String[] args) {
        Cse discipline = new Cse();
        // faculty class is override as a result the parent class method don't execute
        discipline.Faculty();

        // it executes the parent class service method.
        discipline.Service();
    }
}