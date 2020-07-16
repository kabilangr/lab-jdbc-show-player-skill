package dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO
{
	public List<Skill> Skills() throws SQLException, ClassNotFoundException, IOException
	{
		ConnectionManager ob=new ConnectionManager();
		List<Skill> list=new ArrayList<Skill>();
		String sql="Select * from skill order by name asc";
		Statement st=ob.getConnection().createStatement();
		ResultSet rs=st.executeQuery(sql);
		Skill obj=null;
		while(rs.next())
		{
			obj=new Skill(rs.getLong("ID"),rs.getString("NAME"));
			list.add(obj);
		}
		ob.getConnection().close();
		return list;
	}
}
