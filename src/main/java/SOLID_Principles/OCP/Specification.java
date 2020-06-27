package SOLID_Principles.OCP;

import java.util.List;
import java.util.stream.Stream;

//Step 1
//Determines if a product satisfies a criteria....
interface Specification<T> {
    boolean isSatisfied(T item);
}