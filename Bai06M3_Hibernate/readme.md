## Lớp persistent phải:
	1. Có phương thức khởi tạo không tham số
	2. Các thuộc tính thì private và có các phương thức getter setter
	3. Các lớp không kế thừa tường minh lớp khác
---
=> Ví dụ về khai báo (tạo mà chưa cấu hình) persistent class
![h1](https://user-images.githubusercontent.com/49097311/199010460-352e4458-39a6-44e3-b86e-9f9203bca1c8.PNG)

=> Mapping file: tên file nên đặt <tên-lớp>.hbm.xml

![h2](https://user-images.githubusercontent.com/49097311/199010729-f9eb487f-28a9-4430-923e-4b86f1261a7d.PNG)

---
### Ví dụ thiết lập quan hệ many-to-one giữa book và category, quan hệ many-to-many giữa book và author:
	- Một category có thể có nhiều book, 1 book thuộc 1 category
	- Một book có thể có nhiều author, 1 author có thể có nhiều book
==> Mapping file
---Hình 3---
----
## Session Factory
- Được tạo thông qua Configuration và tồn tạ xuyên suốt khi chương trình hoạt động
- Đối tượng này là "máy sản xuất" các đối tượng Session tương tác với cơ sở dữ liệu
- Mỗi csdl (có tập tin cấu hình riêng) cần một thể hiện của SessionFactory riêng
=> Thể hiện của Session được tạo mỗi lúc có tương tác với csdl, có thời gian tồn tại ngắn. Nhiệm vuj chính là để thực hiện các thao táo tạo, đọc, cập nhật và xóa các thể hiện của các lớp đối tượng được ánh xạ (các persistent object)
-------------------------
### Sử dụng Annotation
- Giả sử có lược đồ quan hệ như sau
---hình 4----
- Lớp Category định nghĩa (mapping với) bảng category
---hình 5---
*Đối với các trường có tên được tạo hoàn toàn giống với tên cột tương ứng dưới csdl thì có thể không cần tạo @Column(...)
-- hình 6---
-----
- Quan hệ Many-to-one của product và category
--hình 7---
- Quan hệ Many-to-Many của product và manufacturer
--- hình 8 + hình 9---
### Minh họa thêm mối sản phẩm
---hinh 10-----
 

