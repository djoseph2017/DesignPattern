package SOLID_Principles.LSP;
//It says that when we have a class that is extending from the super class
//any change in the parameters should not effect the child class tha is inheriting from parent class.
//URL:https://dev.to/abdullahdibas/examples-on-the-violation-of-liskov-substitution-principle-lsp-43be

class LSPDemo {
    // maybe conform to ++
    static void useIt(Rectangle r) {
        int width = r.getWidth();
        //Note for here both the square and height is set to 10 so 10*10 = 100 whereas
        //width is still the same so width*10 is 5*10 = 50!!!!!!!Think!!!
        r.setHeight(10);
        System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
    }

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 3);
        useIt(rc);

        Rectangle sq = new Square();
        sq.setHeight(5);
        //sq.setWidth(10);
        useIt(sq);
    }
}