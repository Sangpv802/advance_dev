BT về xử lý ngoại lệ
    1. Viết chương trình nhắc người dùng đọc hai số nguyên và hiển thị tổng của chúng. Chương trình của bạn sẽ nhắc người dùng đọc lại số nếu đầu vào không chính xác. (Gợi ý:sử dụng lớp ngoại lệ InputMismatchException)
    2. Viết chương trình đáp ứng các yêu cầu sau:   Tạo một mảng với 100 số nguyên được chọn ngẫu nhiên. Nhắc người dùng nhập chỉ số của mảng, sau đó hiển thị giá trị phần tử tương ứng. Nếu chỉ mục được chỉ định nằm ngoài giới hạn, hiển thị thông báo "Ngoài giới hạn". (Gợi ý: sử dụng lớp ngoại lệ ArrayIndexOutOfBoundsException)
    3. 
    Viết chương trình Java để quản lý thông tin sản phẩm trong kho hàng. Mỗi sản phẩm bao gồm các thuộc tính như mã sản phẩm, tên sản phẩm, số lượng trong kho, và giá. Sinh viên cần xây dựng lớp Product và các phương thức để nhập, xuất sản phẩm, và cập nhật số lượng sản phẩm trong kho.
    Chương trình phải xử lý các tình huống ngoại lệ sau:
        1. Khi số lượng nhập vào không hợp lệ (ví dụ: số lượng âm).
        2. Khi số lượng sản phẩm trong kho không đủ để xuất.
        3. Khi người dùng nhập sai định dạng (ví dụ: nhập ký tự thay vì số).
Yêu cầu:
    1. Xây dựng lớp Product với các thuộc tính:
        ◦ String productId
        ◦ String productName
        ◦ int quantity
        ◦ double price
    2. Tạo các phương thức:
        ◦ public void addStock(int amount) để thêm sản phẩm vào kho.
        ◦ public void removeStock(int amount) để xuất sản phẩm ra khỏi kho.
    3. Xử lý ngoại lệ với các trường hợp sau:
        ◦ Sử dụng IllegalArgumentException khi nhập số lượng âm.
        ◦ Sử dụng một ngoại lệ tùy chỉnh (tạo lớp ngoại lệ riêng) cho trường hợp xuất số lượng lớn hơn số lượng hiện có trong kho.
        ◦ Xử lý InputMismatchException khi người dùng nhập dữ liệu không đúng kiểu.
    4. Viết chương trình chính để thử nghiệm các tình huống ngoại lệ.

