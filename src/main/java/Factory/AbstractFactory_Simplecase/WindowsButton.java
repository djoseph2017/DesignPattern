package Factory.AbstractFactory_Simplecase;

public class WindowsButton implements Button {

    @Override
    public void click() {
        System.out.println("You have created WindowsButton.");
    }
}
