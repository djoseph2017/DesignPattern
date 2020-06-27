package SOLID_Principles.ISP;

class MultiFunctionMachine implements Printer, IScanner {
    // compose this out of several modules
    private Printer printer;
    private IScanner scanner;

    public MultiFunctionMachine(Printer printer, IScanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    public void Print(Document d) throws Exception {
        printer.Print(d);
    }

    public void Scan(Document d) throws Exception {
        scanner.Scan(d);
    }
}