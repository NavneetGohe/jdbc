package isolation;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

public class MarksheetModel {

	public void add(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "root");

		PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into marksheet values (?,?,?,?,?,?,?)");

		ps.setInt(1, bean.getId() );
		ps.setInt(2, testNxt());
		ps.setString(3, bean.getFname());
		ps.setString(4, bean.getLname());
		ps.setInt(5, bean.getPhy());
		ps.setInt(6, bean.getChe());
		ps.setInt(7, bean.getMat());

		ps.executeUpdate();

	}

	public void update(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "root");

		PreparedStatement ps = (PreparedStatement) con
				.prepareStatement("update Marksheet set Rol_lnmb=?, Fname =?,Lname=?,phy=?,che=?,math=? where id=?");

		ps.setInt(1, bean.getRolllno());
		ps.setString(2, bean.getFname());
		ps.setString(3, bean.getLname());
		ps.setInt(4, bean.getPhy());
		ps.setInt(5, bean.getChe());
		ps.setInt(6, bean.getMat());
		ps.setInt(7, bean.getId());

		ps.executeUpdate();

	}

	public void delete(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "root");

		PreparedStatement ps = (PreparedStatement) con.prepareStatement("delete from marksheet where id = ?");
		ps.setInt(1, bean.getId());

		ps.executeUpdate();
	}

	public void get(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "root");

		PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from Marksheet where id = ?");
		ps.setInt(1, bean.getId());

		ps.executeQuery();

//		while (rs.next()) {
//			System.out.print(rs.getString(1));
//			System.out.print("\t" + rs.getString(2));
//			System.out.print("\t" + rs.getString(3));
//			System.out.print("\t" + rs.getString(4));
//			System.out.print("\t" + rs.getString(5));
//			System.out.print("\t" + rs.getString(6));
//			System.out.print("\t" + rs.getString(7));
//		}
	}
	
	public int testNxt() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "root");
		int k  =0;
		PreparedStatement ps = (PreparedStatement) con.prepareStatement("select max(rol_lnmb) from marksheet");
		
		 ResultSet i = ps.executeQuery();
		while(i.next()) {
			k = i.getInt(1);
		}
		return k+1;
		
		
	}
		
	public List<MarksheetBean> meritList(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "root");

		PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * ,phy+che+math as total from marksheet where phy>40 and che>40 and math> 40 order by total desc limit 0,5;  ");
	

		ResultSet rs = ps.executeQuery();
		MarksheetBean bean1 = null;
		List<MarksheetBean> list1 = new ArrayList<MarksheetBean>();

		while (rs.next()) {
			bean1 = new MarksheetBean();
			bean1.setId(rs.getInt(1));
			bean1.setRolllno(rs.getInt(2));
			bean1.setFname(rs.getString(3));
			bean1.setLname(rs.getString(4));
			bean1.setPhy(rs.getInt(5));
			bean1.setChe(rs.getInt(6));
			bean1.setMat(rs.getInt(7));
			list1.add(bean1);
		}
return list1;
	}
	
}
