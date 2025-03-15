package bai03;

public class Main {
    public static void main(String[] args) {
        Component file1 = new File("File1.txt");
        Component file2 = new File("File2.txt");
        Component folder1 = new Folder("Folder1");

        ((Folder) folder1).add(file1); // Chỉ có thể gọi add() trên folder1
        ((Folder) folder1).add(file2);

        Component folder2 = new Folder("Folder2");
        ((Folder) folder2).add(new File("File3.txt"));

        ((Folder) folder1).add(folder2); // Thêm folder2 vào folder1

        // Hiển thị cấu trúc
        folder1.display();
    }
}
