package FamilyTree;
import FamilyTree.Tree.Type;
import FamilyTree.Printer;

public class Program {
    public static void main(String[] args) {
  
    var irina = new Person("Ирина");
    var vasya = new Person("Вася");
    var masha = new Person("Маша");
    var jane = new Person("Женя");
    var ivan = new Person("Ваня");
  
      Tree ft = new Tree();
  
      ft.addNode(irina, Type.WIFE, vasya);
      ft.addNode(masha, Type.DAUGHTER, vasya);
      ft.addNode(jane, Type.DAUGHTER, vasya);
      ft.addNode(ivan, Type.SON, vasya);
  
      Research children = new Research(ft);
      Printer p = new Printer();
      System.out.println(p.people(children.findAll(vasya, Type.SON)));
      System.out.println(p.people(children.findAll(vasya, Type.DAUGHTER)));
    }
  
  }