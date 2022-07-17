package Program.GeoTrees;
import java.util.ArrayList;

import Program.Person.Person;

public class AnotherGeoTree implements IGeoTree{
    private ArrayList<RelationsNode> tree = new ArrayList<>();
    
    @Override
    public ArrayList<RelationsNode> getTree() {
        return tree;
    }

    @Override
    public void append(Person parent, Person children) {
        treeAdder(children, RelationType.CHILDOF, parent);
        treeAdder(parent, RelationType.PARENTOF, children);
    }

    @Override
    public void addFamily(Person parent1, Person parent2, Person[] childrens) {
        treeAdder(parent1, RelationType.HUSBANDWIFEOF, parent2);
        for (Person child : childrens) {
            treeAdder(child, RelationType.CHILDOF, parent1);    
            treeAdder(child, RelationType.CHILDOF, parent2);
            treeAdder(parent1, RelationType.PARENTOF, child);
            treeAdder(parent2, RelationType.PARENTOF, child);
        }
    }

    private void treeAdder(Person person1, RelationType relation, Person person2){
        tree.add(new RelationsNode(person1, relation, person2));
    }
}
