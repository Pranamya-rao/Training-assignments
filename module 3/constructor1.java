class constructor1{
    String name;
    int material;
    
    constructor1(String n, int m) {
        name = n;
        material = m;
    }
    void show( ) {
        System.out.println("constructor1:" + name +" | material:" + material);
    }
    public static void main(String [] args) {
        constructor1 c1 =new constructor1("amit",101);
        constructor1 c2 =new constructor1("aman",21);
        c1.show();
        c2.show();
    }
}