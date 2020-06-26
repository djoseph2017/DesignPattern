package SOLID_Principles.OCP;

//Create a specification for the type of filter ---> Size and check if it is satisfied
//Note isSatisfied is used in the iteration and an object is created
class SizeSpecification implements Specification<Product> {
    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product p) {
        return p.size == size;
    }
}