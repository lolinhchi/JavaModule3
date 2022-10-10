# Các JSP tags dùng trong trang JSP
1. <%@khai báo lớp, tập tin, thư viện%>
2. <%!khai báo biến, hàm dùng chung %>
3. <% các lệnh java%>
4. <%=biểu thức in ra%>
5. <jsp:actionName (các hành động được đặt tên) />
6. <%--ghi chú trong jsp -->

# Các biến ẩn trong JSP
1. application: phạm vi toàn chương trình, kết thúc khi đóng server??
2. session :phạm vi toàn chương trình trong phiên, biến mất khi đóng trình duyệt??
3. request
4. pageContext
....

# Java Bean : là lớp đơn giản thỏa 4 yêu cầu
1. thực thi giao tiếp Serializable
2. thành phần dữ liệu private
3. có các hàm getter và setter
4. có phương thức khởi tạo không tham số
