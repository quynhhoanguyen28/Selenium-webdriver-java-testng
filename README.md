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
### Cơ chế hoạt động: 
Selenium 4 hoạt động theo mô hình client-server: Script (client) gửi lệnh qua W3C Protocol đến các browser driver (server), và driver thực hiện thao tác trên trình duyệt.
![image](https://github.com/user-attachments/assets/99e5eadf-6745-4cd9-9654-01d13e5686cd)

### Các cách tương tác với element trên Website thông qua Selenium
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
```
input[type='text']
```

4. Css
- CSS Selector là cú pháp dùng trong CSS để chọn các phần tử HTML, và cũng được Selenium hỗ trợ làm locator.

### Cách giả lập các tương tác trên browser thông qua Selenium
1. Browser command là các lệnh được cung cấp bởi Selenium WebDriver để điều khiển trình duyệt web

2. Các Browser command phổ biến
```java
// Browser Commands trong Selenium WebDriver

// Mở một trang web
driver.get("https://example.com");

// Lấy tiêu đề trang hiện tại
String title = driver.getTitle();  // Trả về "Example Domain"

// Lấy URL hiện tại
String currentUrl = driver.getCurrentUrl();  // Trả về "https://example.com"

// Lấy toàn bộ mã nguồn HTML của trang
String pageSource = driver.getPageSource();

// Điều hướng đến một URL khác (tương tự driver.get)
driver.navigate().to("https://google.com");

// Quay lại trang trước đó
driver.navigate().back();

// Tiến tới trang tiếp theo
driver.navigate().forward();

// Tải lại trang hiện tại
driver.navigate().refresh();

// Đóng tab hiện tại
driver.close();

// Đóng toàn bộ trình duyệt và kết thúc session WebDriver
driver.quit();
```
  
## KẾT QUẢ
Video demo:


