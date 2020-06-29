package SOLID_Principles.DIP;

import java.util.List;

class Research {

    //The business Logic should not be included in this as object only needs its Values!!!!!!!
    //This makes higher classes independent of one using it
    /*public Research(Relationships relationships) {
        // high-level: find all of john's children
        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
        relations.stream()
                .filter(x -> x.getValue0().name.equals("John")
                        && x.getValue1() == Relationship.PARENT)
                .forEach(ch -> System.out.println("John has a child called " + ch.getValue2().name));
    }*/

    //See this is depending on Abstraction and not like before where the logic is in constructor and also
    //depending on class.
    public Research(RelationshipBrowser browser) {
        List<Person> children = browser.findAllChildrenOf("John");
        for (Person child : children)
            System.out.println("John has a child called " + child.name);
    }
}

