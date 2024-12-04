package ExceptionTest;

public class Programm {
    public static void main(String[] args) throws MyException, TestExcpt {
        int value = 42;

        //ES WIRD IMMER EIN TRY_CATCH BLOCK BENÖTIGT... AUSNAHME THROWS AN DIE METHODE ANGEHÄNGT (FEHLERMESSAGE NICHT SO SCHÖN)
        try {
            if (value < 10) {
                throw new MyException("Value is too high", value);
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        //if(value == 42) throw new TestExcpt("TEST123123");

        try {
            if(value == 42) throw new MyException("Fehler");
        } catch (MyException e) {
            System.out.println(e.getError());
        }
    }
}
