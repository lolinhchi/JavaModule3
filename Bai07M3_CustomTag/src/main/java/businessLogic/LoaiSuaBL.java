package businessLogic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javaBeans.LoaiSua;

public class LoaiSuaBL {

	public static List<LoaiSua> docTatCa(){
		List<LoaiSua> dsls = null;
		try(Connection conn = CSDL.getConnection()){
			Statement stm = conn.createStatement();
			String query = "select * from loai_sua";
			ResultSet rs = stm.executeQuery(query);
			dsls = new ArrayList<LoaiSua>();
			while(rs.next()) {
				LoaiSua ls = new LoaiSua();
				ls.setMaLoai(rs.getString("ma_loai_sua"));
				ls.setTenLoai(rs.getString("ten_loai"));
				dsls.add(ls);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
		return dsls;
	}
	
	
}
