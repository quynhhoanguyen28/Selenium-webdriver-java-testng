# PROJECT 
  Automation Test cho website với Selenium

## GIỚI THIỆU
 - Ở trong project này, em tìm hiểu và cài đặt Selenium để viết automation test cho website

## TÁC GIẢ
- Tên: Nguyễn Thị Hoa - 20183746
  
## MÔI TRƯỜNG HOẠT ĐỘNG
Trên laptop cá nhân, test run trên 1 trong 3 trình duyệt: Chrome, Edge, Firefox
  
## HƯỚNG DẪN CÀI ĐẶT VÀ CHẠY THỬ
1. Cần cài đặt các mục sau:
- Java JDK latest version
- Selenium web driver latest version
- TestNG
- Inteliji

2. Cần add file jar của Selenium và TestNG vào thư mục libraries của dự án

## NGUYÊN LÝ CƠ BẢN

### Tìm hiểu chung về Selenium
### 1.Cơ chế hoạt động: 
Selenium 4 hoạt động theo mô hình client-server: Script (client) gửi lệnh qua W3C Protocol đến các browser driver (server), và driver thực hiện thao tác trên trình duyệt.
![image](https://github.com/user-attachments/assets/99e5eadf-6745-4cd9-9654-01d13e5686cd)

### 2. Các cách tương tác với element trên Website thông qua Selenium
1. Selenium locator
   - Selenium Locator là cách để xác định các phần tử HTML trên trang web, bằng cách sử dụng các hàm (methods) được cung cấp bởi Selenium WebDriver.
     ```
     driver.findElement(By.id("element_id"));
     driver.findElement(By.name("element_name"));
     driver.findElement(By.className("class_name"));
     driver.findElement(By.tagName("tag_name"));
     driver.findElement(By.linkText("full link text"));
     driver.findElement(By.partialLinkText("partial text"));
     driver.findElement(By.cssSelector("css_selector"));
     driver.findElement(By.xpath("xpath_expression")); 
     ```

3. Xpath
- XPath (XML Path Language) là một ngôn ngữ truy vấn giúp xác định vị trí phần tử trong cấu trúc cây HTML.
- Ưu điểm:
+ Có thể truy xuất phần tử phức tạp.
+ Hỗ trợ tìm từ cha đến con, hoặc theo điều kiện cụ thể.
```
input[type='text']
```

4. Css
- CSS Selector là cú pháp dùng trong CSS để chọn các phần tử HTML, và cũng được Selenium hỗ trợ làm locator.
- Ưu điểm:
+ Nhanh hơn XPath trong hầu hết trình duyệt.
+ Cú pháp ngắn gọn, dễ học.

5. Một số browser command phổ biến




### PHÁT SINH

_Các sự cố, vẫn đề, lỗi mà không xử lý được, hoặc xử lý mất quá 4h thì nên ghi vào đây, hoặc ghi vào [issue của GitHub](https://github.com/neittien0110/ProjectSample/issues). Sẽ được tính điểm. Ví dụ__

- __Lỗi: blablablabla__
  - Chi tiêt: .....
  - Nguyên nhân: ...
  - Giải pháp: chưa có

  
## KẾT QUẢ
Các ảnh chụp với caption giải thích.
Hoặc video sản phẩm

