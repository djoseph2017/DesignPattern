package SOLID_Principles.ISP;

class Photocopier implements Printer, IScanner {
    public void Print(Document d) throws Exception {
        throw new Exception();
    }

    public void Scan(Document d) throws Exception {
        throw new Exception();
    }
}
