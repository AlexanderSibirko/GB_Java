package Program.GeoTrees;

import java.util.ArrayList;

import Program.Person.Person;

public class GeoTree implements IGeoTree {
    private ArrayList<RelationsNode> tree = new ArrayList<>();

    @Override
    public ArrayList<RelationsNode> getTree() {
        return tree;
    }

    @Override
    public void append(Person parent, Person children) {
        tree.add(new RelationsNode(parent, RelationType.PARENTOF, children));
        tree.add(new RelationsNode(children, RelationType.CHILDOF, parent));
    }

    @Override
    public void addFamily(Person parent1, Person parent2, Person[] childrens) {
        tree.add(new RelationsNode(parent1, RelationType.HUSBANDWIFEOF, parent2));
        for (Person child : childrens) {
            tree.add(new RelationsNode(parent1, RelationType.PARENTOF, child));
            tree.add(new RelationsNode(parent2, RelationType.PARENTOF, child));
            tree.add(new RelationsNode(child, RelationType.CHILDOF, parent1));
            tree.add(new RelationsNode(child, RelationType.CHILDOF, parent2));
        }
    }
}
