package bai02;

import java.util.ArrayList;
import java.util.List;

//Subject
public class Task {
 private List<TeamMember> observers = new ArrayList<>();
 private String status;

 public void addObserver(TeamMember teamMember) {
     observers.add(teamMember);
 }

 public void removeObserver(TeamMember teamMember) {
     observers.remove(teamMember);
 }

 public void setStatus(String status) {
     this.status = status;
     notifyObservers();
 }

 private void notifyObservers() {
     for (TeamMember teamMember : observers) {
         teamMember.update(status);
     }
 }
}