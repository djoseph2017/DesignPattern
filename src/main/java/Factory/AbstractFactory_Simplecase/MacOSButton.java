package Factory.AbstractFactory_Simplecase;

public class MacOSButton implements Button {

    @Override
    public void click() {
        System.out.println("You have created MacOSButton.");
    }
}
