package isolation;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

public class TestMarksheetModel {
	public static void main(String[] args) throws Exception {
		//testAdd();
		//testUpdate();
		//testDelete();
		//testGet();
		testMerit();
	}

	public static void testDelete() throws Exception {
		MarksheetBean Bean = new MarksheetBean();
	    Bean.setId(16);
	    
       MarksheetModel m = new MarksheetModel();
		
		m.delete(Bean);
		
		System.out.println("DELETED");
	}
	public static void testMerit() throws Exception {
		MarksheetBean Bean = new MarksheetBean();
	    
	    List<MarksheetBean> mbean= new ArrayList<>();
	    
       MarksheetModel m = new MarksheetModel();
		
       mbean=	m.meritList(Bean);
       
		Iterator<MarksheetBean> it=mbean.iterator();
		while (it.hasNext()) {
			Bean=it.next();
		
			System.out.print("\t"+Bean.getId());
			System.out.print("\t"+Bean.getRolllno());
			System.out.print("\t"+Bean.getFname());
			System.out.print("\t"+Bean.getLname());
			System.out.print("\t"+Bean.getPhy());
			System.out.print("\t"+Bean.getChe());
			System.out.println("\t"+Bean.getMat());
			
		}
	}

	/*
	 * public static void testGet() throws Exception { MarksheetBean Bean = new
	 * MarksheetBean(); Bean.setId(3); ResultSet rs = Bean. while (rs.next()) {
	 * System.out.print(rs.getString(1)); System.out.print("\t" + rs.getString(2));
	 * System.out.print("\t" + rs.getString(3)); System.out.print("\t" +
	 * rs.getString(4)); System.out.print("\t" + rs.getString(5));
	 * System.out.print("\t" + rs.getString(6)); System.out.print("\t" +
	 * rs.getString(7)); }
	 * 
	 * 
	 * 
	 * MarksheetModel m = new MarksheetModel();
	 * 
	 * m.get(Bean);
	 * 
	 * }
	 * 
	 */	public static void testAdd() throws Exception {
    MarksheetBean Bean = new MarksheetBean();
    Bean.setId(15);
    //Bean.setRolllno(115);
    Bean.setFname("jehangir");
    Bean.setLname("jaha");
    Bean.setPhy(88);
    Bean.setChe(87);
    Bean.setMat(78);
   
    MarksheetModel m = new MarksheetModel();
    
    m.add(Bean);
    System.out.println("inserted");
    
    
	}
	public static void testUpdate() throws Exception {
		MarksheetBean Bean = new MarksheetBean();
		
		Bean.setRolllno(101);
		Bean.setFname("rozeen");
		Bean.setLname("john");
		Bean.setPhy(98);
		Bean.setChe(97);
		Bean.setMat(98);
		Bean.setId(1);
		
		
		MarksheetModel m = new MarksheetModel();
		
		m.update(Bean);
		
		
	}
	
  

}
