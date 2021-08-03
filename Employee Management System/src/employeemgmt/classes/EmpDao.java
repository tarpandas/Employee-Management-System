package employeemgmt.classes;

import java.sql.*;

public class EmpDao {
	EmployeeBean eb; String c = new String(); double d;
	public EmpDao(EmployeeBean eb) {
		this.eb = eb;
	}
	public void saveEmp(){
		try {
			String url="jdbc:oracle:thin:password/TARPAN@localhost:1521:XE";
			String u = "TARPAN";
			String p = "password";
			String driver="oracle.jdbc.OracleDriver";
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,u,p);
			CallableStatement st = con.prepareCall("{call set_emp(?, ?, ?, ?, ?, ?, ?)}");
			st.setInt(1,this.eb.getEmpNo());
			st.setString(2,this.eb.getName());
			st.setString(3, this.eb.getDept());
			st.setDouble(4, this.eb.getSal());
			st.setString(5, this.eb.getAdd());
			st.setString(6, this.eb.getPhoneNo());
			st.setString(7, this.eb.getEmailId());
			st.executeQuery();
			st.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void displayAll(){
		
		try {
		 System.out.println("---Display the employee database---");

	        String url="jdbc:oracle:thin:password/TARPAN@127.0.0.1:1521:XE";
	        String uname = "TARPAN";
	        String pass = "password";
	        String query = "select * from Employees inner join EmployeeDetails on Employees.empNo = EmployeeDetails.empNo";

	        Class.forName("oracle.jdbc.OracleDriver");
	        Connection con = DriverManager.getConnection(url,uname,pass);
	        if(con==null) {
	        	System.out.println("Connection failed!");
	        }else {
	        	System.out.println("Connection successful!");
	        }
	        Statement st = con.createStatement();
	        ResultSet rs = st.executeQuery(query);
	        int c1; double c4;
	        String c2,c3,c5,c6,c7,c8;
	        while(rs.next()){
	            c1 = rs.getInt(1);
	            c2 = rs.getString(2);
	            c = c3 = rs.getString(3);
	            d = c4 = rs.getDouble(4);
	            c5 = rs.getString(5);
	            c6 = rs.getString(6);
	            c7 = rs.getString(7);
	            c8 = rs.getString(8);
	            System.out.println("'"+c1+"' '"+ c2 +"' '"+ c3+"' '" + c4 +"' '"+ c5+"' '" + c6 +"' '"+ c7+"' '"+c8+"'");
	            System.out.println("Estimated salary with bonuses: "+ calSal());
	        }
	        st.close();
	        con.close();
	        
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public double calSal(){
		//System.out.println(n+" "+salary);
		if(c.equalsIgnoreCase("cse"))
			d+= 5000;
		return d;
	}
}
