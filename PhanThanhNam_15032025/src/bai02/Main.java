package bai02;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng công việc
        Task task = new Task();

        // Tạo các thành viên nhóm
        TeamMember member1 = new ConcreteTeamMember("Tom");
        TeamMember member2 = new ConcreteTeamMember("Jerry");

        // Đăng ký thành viên nhóm với công việc
        task.addObserver(member1);
        task.addObserver(member2);

        // Thay đổi trạng thái công việc, tất cả các thành viên nhóm sẽ nhận thông báo
        System.out.println("Changing task status to In Progress");
        task.setStatus("In Progress");

        // Thay đổi trạng thái công việc lần nữa
        System.out.println("Changing task status to Completed");
        task.setStatus("Completed");
    }
}
