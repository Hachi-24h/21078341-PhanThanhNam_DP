package XML;

//Adaptee - Lớp này chỉ hỗ trợ dữ liệu XML
public class XMLData {
 private String xmlData;

 // Constructor để nhận dữ liệu XML
 public XMLData(String xmlData) {
     this.xmlData = xmlData;
 }

 // Phương thức này trả về dữ liệu XML dưới dạng String
 public String convertToXML() {
     return this.xmlData;
 }
}
