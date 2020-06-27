package SOLID_Principles.OCP;

import java.util.List;
import java.util.stream.Stream;

//Filter interface to pass the specification and can be used for various types
interface Filter<T> {
    Stream<T> filter(List<T> items, Specification<T> spec);
}
