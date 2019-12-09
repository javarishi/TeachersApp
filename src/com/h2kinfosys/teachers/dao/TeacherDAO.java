package com.h2kinfosys.teachers.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.h2kinfosys.teachers.dto.TeacherDTO;

public class TeacherDAO {
	
	/**
	 * CREATE TABLE `teacher` (
	  `teacher_id` int(11) NOT NULL AUTO_INCREMENT,
	  `first_name` varchar(45) DEFAULT NULL,
	  `last_name` varchar(45) DEFAULT NULL,
	  `skill` varchar(45) DEFAULT NULL,
	  PRIMARY KEY (`teacher_id`),
	  UNIQUE KEY `teacher_id_UNIQUE` (`teacher_id`)
		) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Teacher Table from Servlet Example';

	 */
	
	private static String url =  "jdbc:mysql://localhost:3306/sakila";
	private static String userName = "root";
	private static String password = "password";
	private static String getTeacher = "Select * from Teacher where teacher_id = ?";
	
	public static Connection getConnection() throws ClassNotFoundException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties props = new Properties();
			props.setProperty("user", userName);
			props.setProperty("password", password);
			conn = DriverManager.getConnection(url, props);
		}catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
		return conn;
	}
	
	
	public TeacherDTO getTeacherById(String id) {
		TeacherDTO teacher = null;
		try {
			Connection conn = getConnection();
			PreparedStatement pStat = conn.prepareStatement(getTeacher);
			pStat.setInt(1, Integer.parseInt(id));
			ResultSet rs = pStat.executeQuery();
			while(rs.next()) {
				teacher = new TeacherDTO();
				teacher.setTeacherId(rs.getInt("teacher_id"));
				teacher.setFirstName(rs.getString("first_name"));
				teacher.setLastName(rs.getString("last_name"));
				teacher.setSkill(rs.getString("skill"));
			}
			conn.close();
		}catch(Exception sqlEx) {
			sqlEx.printStackTrace();
		}
		return teacher;
	}
	
	public int saveTeacher(TeacherDTO teacher) {
		// Write JDBC Call to save teacher and return teacherId
		return 0;
	}
	


}
