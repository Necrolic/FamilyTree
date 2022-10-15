package FamilyTree;
import java.util.ArrayList;

public class Tree {
    private ArrayList<Node> tree = new ArrayList<>();

    enum Type {
        MOTHER, FATHER, DAUGHTER, SON, BROTHER, SISTER, WIFE, HUSBAND
    }

    class Node {

        Person who;
        Type re;
        Person toWhom;

        public Node(Person who, Type re, Person toWhom) {
            this.who = who;
            this.re = re;
            this.toWhom = toWhom;
        }

        public Node(Type re, Person toWhom) {
            this.who = null;
            this.re = re;
            this.toWhom = toWhom;
        }

        public Node(Person who, Type re) {
            this.who = who;
            this.re = re;
            this.toWhom = null;
        }

        public String toString() {
            return String.format("<%s %s %s>", who, re, toWhom);
        }
    }

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void addNode(Person who, Type re, Person toWhom) {
        tree.add(new Node(who, re, toWhom));
    }
}
