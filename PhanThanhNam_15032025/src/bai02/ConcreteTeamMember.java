package bai02;


//Concrete Observer
public class ConcreteTeamMember implements TeamMember {
 private String name;

 public ConcreteTeamMember(String name) {
     this.name = name;
 }

 @Override
 public void update(String status) {
     System.out.println("Team Member " + name + " notified. New task status: " + status);
 }
}