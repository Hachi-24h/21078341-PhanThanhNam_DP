package bai03;



import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {
 private String name;
 private List<Component> children = new ArrayList<>();

 public Folder(String name) {
     this.name = name;
 }

 public void add(Component component) {
     children.add(component);
 }

 public void remove(Component component) {
     children.remove(component);
 }

 @Override
 public void display() {
     System.out.println("Folder: " + name);
     for (Component component : children) {
         component.display();
     }
 }
}
