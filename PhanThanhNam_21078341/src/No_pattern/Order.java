package No_pattern;

//Order.java
public class Order {
 enum Status { NEW, PROCESSING, DELIVERED, CANCELLED }

 private Status status;

 public Order() { this.status = Status.NEW; }

 public void process() { if (status == Status.NEW) status = Status.PROCESSING; }
 public void deliver() { if (status == Status.PROCESSING) status = Status.DELIVERED; }
 public void cancel() { if (status != Status.DELIVERED) status = Status.CANCELLED; }

 public Status getStatus() { return status; }
}
