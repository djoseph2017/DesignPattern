package SOLID_Principles.DIP;

/*
In object-oriented design, the dependency inversion principle is a specific form of decoupling
software modules. When following this principle, the conventional dependency relationships
established from high-level, policy-setting modules to low-level,
dependency modules are reversed, thus rendering high-level modules independent of the low-level
module implementation details. The principle states:[1]
1.High-level modules should not depend on low-level modules. Both should depend on abstractions
(e.g. interfaces).
2.Abstractions should not depend on details. Details (concrete implementations) should depend on
abstractions.
*/

class DIPDemo {
    public static void main(String[] args) {
        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");

        // low-level module
        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);

        new Research(relationships);
    }
}

