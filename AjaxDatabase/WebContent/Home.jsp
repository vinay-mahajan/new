
<%@ page import="java.sql.*"%>

<%
	String s = request.getParameter("val");
	if (s == null || s.trim().equals("")) {
		out.print("Please enter id");
	} else {
		/* int id = Integer.parseInt(s);
		out.print(id); */
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost/mt_db","root","root");
			PreparedStatement ps = con.prepareStatement("select * from customer_master where customer_id=?");
			//ps.setInt(1, id);
			ps.setString(1,s);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				out.print(rs.getString(1) + " " + rs.getString(2));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
%>
