package InterfaceAbstract;

interface Defif
{
    //static ist wie Default... aber Default ist nicht über das interfac aufrufbar
    public default void bar() {
        System.out.print("Hello");
        baz();
    }

    private void baz() {
        System.out.println(" world!");
    }

    public static void buzz() {
        System.out.print("Hello");
        staticBaz();
    }

    private static void staticBaz() {
        System.out.println(" static world!");
    }

}
