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

### Các hàm kiểm tra trạng thái của các element trên website
```java
// Web Element Commands – Kiểm tra trạng thái phần tử

// Tìm một phần tử bất kỳ
WebElement element = driver.findElement(By.id("submitBtn"));

// Kiểm tra phần tử có hiển thị (visible) không
boolean isDisplayed = element.isDisplayed();  // true nếu phần tử đang hiển thị

// Kiểm tra phần tử có thể thao tác (enabled) không
boolean isEnabled = element.isEnabled();  // true nếu có thể click, nhập liệu...

// Kiểm tra phần tử có được chọn (selected) không
// (thường dùng với checkbox, radio button)
boolean isSelected = element.isSelected();  // true nếu đã được chọn

// Lấy văn bản hiển thị trong phần tử
String text = element.getText();

// Lấy giá trị thuộc tính bất kỳ (ví dụ: value, placeholder, class, v.v.)
String value = element.getAttribute("value");
String placeholder = element.getAttribute("placeholder");
```
  
## KẾT QUẢ
### Video demo phần Selenium locator: https://drive.google.com/file/d/1qPzqKxTEqKMD-iXe8X5FSYUlTjYsL7cq/view?usp=sharing

### Video demo phần Xpath: https://drive.google.com/file/d/1EchynfvZa3U-t8WlV7U1_-HFJEUMWMhT/view?usp=sharing
Description: Check một số case register tài khoản trên trang https://alada.vn/tai-khoan/dang-ky.html
Case 1: Register với empty data
Case 2: Register với invalid email
Case 3: Register với invalid confirm email
Case 4: Register với invalid password
Case 5: Register với incorrect confirm password
Case 6: Register với invalid phone number

### Video demo phần Browser command: https://drive.google.com/file/d/1mNwfqMYN1COJN-9URT38Kejc6qso9WqW/view?usp=sharing
Case 1: Verify URL (getCUrrentUrl)
Case 2: Verify Title (getTitle)
Case 3: Navigate page (Back/ forward)
Case 4: Get page source code (getPageSource)

### Video demo phần Web element: https://drive.google.com/file/d/1AEW6X9oz9LELdwpsWD6Cyuch7HDdcRSP/view?usp=sharing
Case 1: Kiểm tra phần tử display (isDisplayed)
Case 2: Kiểm tra phần tử enabled/ disabled (isEnabled)
Case 3: Kiểm tra phần tử selected (isSelected)
Case 4: Register fucntion trên web https://login.mailchimp.com/signup/

### Video demo 1 case full luồng nhiều steps kết hợp các kiến thức trên: https://drive.google.com/file/d/1lxfUcsF40aD6bDUDUOYR7Bm93adg2zWj/view?usp=sharing
Step 01 – Truy cập vào trang: http://live.techpanda.org/
Step 02 – Click vào link "My Account" để tới trang đăng nhập
Step 03 – Click CREATE AN ACCOUNT button để tới trang đăng kí tài khoản
Step 04 – Nhập thông tin hợp lệ vào tất cả các field: First Name / Last Name / Email Address / Password / Confirm Password
(Tạo random cho dữ liệu tại field Email Address)
Step 05 – Click REGISTER button
Step 06 – Verify message xuất hiện khi đăng kí thành công: "Thank you for registering with Main Website Store."
Step 07 – Verify User được tạo mới với thông tin: Firstname / Lastname / Email hiển thị ở trang My Dashboard
Step 08 - Chuyển qua tab Mobile
Step 09 - Bấm chọn sản phẩm Samsung Galaxy
Step 10 - Chọn Add your review
Step 11 - Điền các thông tin và ấn Submit
Step 12 - Verify message xuất hiện "Your review has been accepted for moderation"



