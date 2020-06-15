package com.fy.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class CommDBUtil {
	
	public static SqlSession getSqlSession() {
		SqlSession session = null;
		try {
			//1.查找mybatils
			InputStream config = Resources.getResourceAsStream("mybatils.xml");
			//2.厂设计类构建
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
			//3.打开会话
			session = ssf.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return session;
	}
	public static void close(SqlSession session) {
		if (session != null) {
			session.close();
		}
	}
}
