package Singleton.Multiton;

public class Multiton {
    public static void main(String[] args) {
        Printer main = Printer.get(Subsystem.PRIMARY);
        Printer aux = Printer.get(Subsystem.AUXILIARY);
        Printer aux2 = Printer.get(Subsystem.AUXILIARY);//NO INSTANCE CREATED
        Printer tst = Printer.get(Subsystem.FALLBACK);
    }
}

