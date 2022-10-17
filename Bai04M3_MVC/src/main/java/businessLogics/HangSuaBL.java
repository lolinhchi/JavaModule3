package businessLogics;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javaBeans.HangSua;

public class HangSuaBL {

	public static List<HangSua> docTatCa() {
		List<HangSua> dshs = null;
		try(Connection conn = CSDL.getConnection()) {
			Statement stm = conn.createStatement();
			String query = "select * from hang_sua";
			ResultSet rs = stm.executeQuery(query);
			dshs = new ArrayList<HangSua>();
			while(rs.next()) {
				HangSua hs = new HangSua();
				hs.setMaHang(rs.getString("ma_hang_sua"));
				hs.setTenHang(rs.getString("ten_hang_sua"));
				hs.setDiaChi(rs.getString("dia_chi"));
				hs.setDienThoai(rs.getString("dien_thoai"));
				hs.setEmail(rs.getString("email"));
				dshs.add(hs);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dshs;
	}
	public static HangSua docTheoMaHang(String maHang) {
		HangSua hs = new HangSua();
		try(Connection conn = CSDL.getConnection()) {
			Statement stm = conn.createStatement();
			String query = "select * from hang_sua where ma_hang_sua = " + maHang;
			ResultSet rs = stm.executeQuery(query);
			while(rs.next()) {
				hs.setMaHang(rs.getString("ma_hang_sua"));
				hs.setTenHang(rs.getString("ten_hang_sua"));
				hs.setDiaChi(rs.getString("dia_chi"));
				hs.setDienThoai(rs.getString("dien_thoai"));
				hs.setEmail(rs.getString("email"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return hs;
	}
}
