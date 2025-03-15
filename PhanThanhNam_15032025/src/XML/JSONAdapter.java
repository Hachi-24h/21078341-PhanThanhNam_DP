package XML;

//Adapter - JSONAdapter chuyển đổi XML thành JSON
public class JSONAdapter implements JSONData {
 private XMLData xmlData;

 // Constructor nhận vào đối tượng XMLData (adaptee)
 public JSONAdapter(XMLData xmlData) {
     this.xmlData = xmlData;
 }

 // Phương thức chuyển đổi XML thành JSON
 @Override
 public String convertToJSON() {
     String xmlContent = xmlData.convertToXML();  // Lấy nội dung XML từ XMLData
     // Chuyển XML thành JSON (Giả sử chuyển đổi đơn giản, chỉ bao bọc XML trong JSON)
     String jsonContent = "{\"data\": \"" + xmlContent + "\"}"; 
     return jsonContent;
 }
}
