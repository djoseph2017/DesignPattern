package SOLID_Principles.DIP;

import java.util.List;

//Abstarting the logic and making it more reusable
public interface RelationshipBrowser {
    List<Person> findAllChildrenOf(String name);
}
