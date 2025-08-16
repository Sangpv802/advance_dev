# 📘 Java Exercises

## 1. Point2D Class
- Xây dựng lớp **Point2D** để biểu diễn một điểm trong hệ tọa độ hai chiều.  
- Thực hiện các phương thức trong biểu đồ lớp được cho.  
- Viết chương trình sử dụng lớp `Point2D`.
<img src="images/1.png" alt="Class Diagram" width="400"/>

---

## 2. TV Class
- Xây dựng lớp **TV** để biểu diễn chiếc tivi theo biểu đồ lớp.  
- Viết chương trình sử dụng lớp `TV`.

---

## 3. Random Numbers
- Sử dụng lớp `java.util.Random`.  
- Viết chương trình tạo một đối tượng `Random` với **seed = 1000**.  
- Chương trình sẽ tạo và hiển thị **50 số nguyên ngẫu nhiên đầu tiên** trong khoảng từ `0` đến `100` (không bao gồm `100`) bằng phương thức `nextInt(100)`.

---

## 4. StopWatch Class
Xây dựng lớp **StopWatch** với các yêu cầu sau:  

### Thuộc tính
- `startTime`: lưu thời gian bắt đầu của đồng hồ.  
- `endTime`: lưu thời gian kết thúc của đồng hồ.  
- `pauseTime`: lưu thời gian khi đồng hồ bị tạm dừng.  
- `elapsedPausedTime`: lưu tổng thời gian đã bị tạm dừng trong suốt quá trình đo.  

### Phương thức
- **Constructor**: không đối số, khởi tạo `startTime` bằng thời gian hiện tại của hệ thống.  
- `start()`: đặt lại `startTime` về thời gian hiện tại và bắt đầu đồng hồ.  
- `stop()`: đặt `endTime` về thời gian hiện tại và dừng đồng hồ.  
- `pause()`: tạm dừng đồng hồ, lưu lại thời gian tại thời điểm dừng.  
- `resume()`: tiếp tục đo thời gian sau khi tạm dừng, không làm mất đi thời gian đã đo trước đó.  
- `getElapsedTime()`: trả về tổng thời gian đã trôi qua (không tính thời gian tạm dừng), đơn vị **mili giây**.  
- `isRunning()`: kiểm tra đồng hồ có đang chạy hay không.  

### Yêu cầu
- Viết chương trình sử dụng lớp `StopWatch`.
