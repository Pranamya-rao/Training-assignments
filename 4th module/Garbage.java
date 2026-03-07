class Garbage {

    protected void Finalize() {
        System.out.println("Garbage Collector called and object destroyed");
    }

    public static void main(String[] args) {

        Garbage obj1 = new Garbage();
        Garbage obj2 = new Garbage();

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}