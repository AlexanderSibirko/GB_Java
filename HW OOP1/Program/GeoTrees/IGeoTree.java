package Program.GeoTrees;

import java.util.ArrayList;

import Program.Person.Person;

public interface IGeoTree {

    public ArrayList<RelationsNode> getTree();

    public void append(Person parent, Person children);

    public void addFamily(Person parent1, Person parent2, Person[] childrens);
}
