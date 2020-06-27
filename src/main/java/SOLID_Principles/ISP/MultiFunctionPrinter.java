package SOLID_Principles.ISP;

// ok if you need a multifunction machine
class MultiFunctionPrinter implements Machine {

    @Override
    public void print(Document d) {

    }

    @Override
    public void fax(Document d) throws Exception {

    }

    @Override
    public void scan(Document d) throws Exception {

    }
}
