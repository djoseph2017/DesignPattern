package SOLID_Principles.OCP;

import java.util.List;
import java.util.stream.Stream;


//Main class that connects Specification(color and size) and also Product
class BetterFilter implements Filter<Product> {
    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(p -> spec.isSatisfied(p));
    }
}