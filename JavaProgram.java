
class JavaProgram {
    public static void main(String []args) {
        Vehicle s1 = new Vehicle(args[0], args[1], args[2]);
        s1.Describe();
        s1.Accelerate();
        s1.Brake();
    }
}
