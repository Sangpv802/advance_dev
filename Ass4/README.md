BT về Input/Output stream
    1. Viết chương trình Java để thực hiện các công việc sau:
    • Đếm số ký tự (bao gồm cả dấu cách), số từ và số dòng của một tệp văn bản .txt.
    • Các từ trong tệp được ngăn cách bởi dấu cách (space) hoặc các dấu phân cách như dấu chấm câu (ví dụ: dấu chấm . và dấu phẩy ,).
    • Sinh viên tự tạo tệp .txt và nội dung của tệp để kiểm tra chương trình.
    • Hiển thị kết quả đếm số ký tự, số từ và số dòng của tệp lên màn hình.
    2. Viết chương trình Java để thực hiện các công việc sau:
    • Kiểm tra sự tồn tại của một tệp văn bản có tên A.txt trong thư mục làm việc hiện tại.
        ◦ Nếu tệp không tồn tại, chương trình sẽ tạo tệp mới.
        ◦ Nếu tệp đã tồn tại, chương trình sẽ mở tệp và ghi tiếp dữ liệu mới vào cuối tệp mà không xóa nội dung cũ.
    • Ghi 150 số nguyên được tạo ngẫu nhiên (từ 0 đến 100) vào tệp. Các số nguyên phải được phân tách bằng dấu cách.
    • Đảm bảo rằng chương trình không ghi quá 10 số nguyên trên mỗi dòng, để giúp việc hiển thị dữ liệu trong tệp dễ đọc hơn.

    3. Viết chương trình Java để thực hiện các công việc sau:
    • Kiểm tra sự tồn tại của một tệp nhị phân có tên B.dat trong thư mục làm việc hiện tại.
        ◦ Nếu tệp không tồn tại, chương trình sẽ tạo tệp mới.
        ◦ Nếu tệp đã tồn tại, chương trình sẽ mở tệp và ghi tiếp dữ liệu mới vào cuối tệp mà không xóa nội dung cũ.
    • Ghi 150 số nguyên được tạo ngẫu nhiên (trong khoảng từ 0 đến 100) vào tệp. Số liệu sẽ được ghi vào tệp dưới dạng nhị phân (binary I/O), tức là dữ liệu được ghi dưới dạng byte thay vì dạng văn bản.

    4. Viết chương trình Java để thực hiện các công việc sau:
    • Tạo một tệp nhị phân có tên C.dat trong thư mục làm việc hiện tại. Nếu tệp đã tồn tại, chương trình sẽ ghi đè tệp cũ bằng tệp mới.
    • Ghi 100 số thực kiểu double ngẫu nhiên (trong khoảng từ 0.0 đến 100.0) vào tệp nhị phân bằng cách sử dụng phương thức writeDouble(double) của lớp DataOutputStream.
    • Sau khi ghi xong, chương trình sẽ mở lại tệp C.dat để đọc dữ liệu.
    • Tính và hiển thị giá trị trung bình của 100 số thực kiểu double đã ghi trong tệp lên màn hình.
    5. Viết chương trình Java:
    • Lưu một mảng gồm năm giá trị int 1, 2, 3, 4 và 5, một đối tượng Date lấy thời gian hiện tại và giá trị double 5.5 vào tệp có tên là D.dat. 
    • Đọc dữ liệu từ file và hiển thị ra màn hình.
    6. Tạo tệp dữ liệu Salary.txt (tương tự tệp Salary.txt được đính kèm) chứa thông tin của 1.000 nhân viên trong khoa Điện tử. Mỗi dòng trong tệp sẽ bao gồm 4 thông tin:
        ◦ First Name (tên): dạng FirstNamei, với i là chỉ số từ 1 đến 1000.
        ◦ Last Name (họ): dạng LastNamei, với i là chỉ số từ 1 đến 1000.
        ◦ Rank (chức vụ): được chọn ngẫu nhiên từ 3 chức vụ sau:
            ▪ assistant (trợ giảng)
            ▪ teacher (giảng viên)
            ▪ associate (phó giáo sư)
        ◦ Salary (tiền lương): là một số kiểu double được tạo ngẫu nhiên theo chức vụ như sau:
            ▪ assistant: lương nằm trong khoảng từ 50,000 đến 80,000.
            ▪ teacher: lương nằm trong khoảng từ 60,000 đến 110,000.
            ▪ associate: lương nằm trong khoảng từ 75,000 đến 130,000.
        ◦ Lưu ý định dạng tệp:
            ▪ Dữ liệu của mỗi thành viên sẽ được lưu trên một dòng, với định dạng như sau:
FirstNamei LastNamei rank salary
            ▪ Ví dụ dòng dữ liệu:
FirstName1 LastName1 assistant 60000.75
FirstName2 LastName2 teacher 85000.50
    7. Viết chương trình đọc dữ liệu từ tệp Salary.txt và tính tổng tiền lương cho từng chức vụ trong khoa:
            ▪ Tổng lương dành cho chức vụ assistant.
            ▪ Tổng lương dành cho chức vụ teacher.
            ▪ Tổng lương dành cho chức vụ associate.
            ▪ Hiển thị kết quả ra màn hình
