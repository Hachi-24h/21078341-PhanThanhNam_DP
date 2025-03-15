package XML;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng XMLData (dữ liệu XML)
        XMLData xmlData = new XMLData("<name>John Doe</name>");

        // Sử dụng Adapter để chuyển đổi XML thành JSON
        JSONData jsonAdapter = new JSONAdapter(xmlData);  // Tạo JSONAdapter với XMLData
        String json = jsonAdapter.convertToJSON();  // Chuyển đổi XML thành JSON

        // Hiển thị kết quả JSON
        System.out.println("Converted JSON: " + json);

        // Thêm ví dụ khác
        XMLData xmlData2 = new XMLData("<age>30</age>");
        JSONData jsonAdapter2 = new JSONAdapter(xmlData2);
        String json2 = jsonAdapter2.convertToJSON();
        System.out.println("Converted JSON: " + json2);

        // Ví dụ với dữ liệu phức tạp hơn
        XMLData xmlData3 = new XMLData("<person><name>Jane Doe</name><age>25</age></person>");
        JSONData jsonAdapter3 = new JSONAdapter(xmlData3);
        String json3 = jsonAdapter3.convertToJSON();
        System.out.println("Converted JSON: " + json3);
    }
}
