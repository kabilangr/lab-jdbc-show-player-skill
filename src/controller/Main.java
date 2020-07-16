package controller;


import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.SkillDAO;
import model.Skill;
public class Main
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException
	{
      List<Skill> ob=new ArrayList<Skill>();
      SkillDAO obj=new SkillDAO();
      ob=obj.Skills();

      System.out.println("ID  \t\t  Skills");
		for(int i=0;i<ob.size();i++)
			System.out.println(ob.get(i).getSkilld()+" \t\t " +ob.get(i).getSkillName());
	}
}
