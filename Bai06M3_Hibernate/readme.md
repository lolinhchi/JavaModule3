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

![h3](https://user-images.githubusercontent.com/49097311/199011103-fe0c8514-09d0-4ffb-abae-edd2ccb13929.PNG)

----
## Session Factory
- Được tạo thông qua Configuration và tồn tạ xuyên suốt khi chương trình hoạt động
- Đối tượng này là "máy sản xuất" các đối tượng Session tương tác với cơ sở dữ liệu
- Mỗi csdl (có tập tin cấu hình riêng) cần một thể hiện của SessionFactory riêng
=> Thể hiện của Session được tạo mỗi lúc có tương tác với csdl, có thời gian tồn tại ngắn. Nhiệm vuj chính là để thực hiện các thao táo tạo, đọc, cập nhật và xóa các thể hiện của các lớp đối tượng được ánh xạ (các persistent object)
-------------------------
### Sử dụng Annotation
- Giả sử có lược đồ quan hệ như sau

![h4](https://user-images.githubusercontent.com/49097311/199011580-47ed2c97-e0b4-436e-8958-c38475a0f7a1.PNG)


- Lớp Category định nghĩa (mapping với) bảng category

![h5](https://user-images.githubusercontent.com/49097311/199011873-8953a0fe-777f-4c19-a712-f4b758b13ba9.PNG)

*Đối với các trường có tên được tạo hoàn toàn giống với tên cột tương ứng dưới csdl thì có thể không cần tạo @Column(...)

![h6](https://user-images.githubusercontent.com/49097311/199408318-0e2374d1-c9ac-4693-a12f-2c1eb0afd430.PNG)

-----
- Quan hệ Many-to-one của product và category

![h7](https://user-images.githubusercontent.com/49097311/199408427-06c2d248-fd7f-44f6-a049-f7478ef92799.PNG)

- Quan hệ Many-to-Many của product và manufacturer

![h8](https://user-images.githubusercontent.com/49097311/199408621-204954ca-2b50-40ca-a323-2f8c0d255d69.PNG)
![h9](https://user-images.githubusercontent.com/49097311/199408630-ec787843-6ad6-4738-b7e4-058889bf0f72.PNG)

### Minh họa thêm mới sản phẩm

![h10](https://user-images.githubusercontent.com/49097311/199408642-ec78ee02-12f4-4325-b369-0d48689eb87c.PNG)
 

