package SOLID_Principles.OCP;

//Create a specification for the type of filter ---> Color and check if it is satisfied
//Note isSatisfied is used in the iteration and an object is created
class ColorSpecification implements Specification<Product> {
    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product p) {
        return p.color == color;
    }
}
