## Bai tap 9 MVC
# Model
	1. Java bean
	=> LoaiSua, HangSua, Sua
	2. Business logic
	=> + LoaiSuaBL - docTatCa()->List<LoaiSua>
		+ HangSuaBL - docTatCa()-> List<HangSua>
					 - docTheoHang(String maHang) -> HangSua
		+ SuaBL - docTheoHangLoaiTen (String maHang, String maLoai, String tenSua)-> List<Sua>
# View
	3. JSP: tạo trang JSP sử dụng html, jslt, jsp tag, ...
# Controller
	4. Ser	vlet:
			- List<HangSua>
			- List<LoaiSua>
			- HangSua
			- List<Sua>