package conn;

import java.sql.*; //sql을 이용할 때 필요한 데이터 규격들이 들어 있어요

public class Sample1 {
	public static void main(String[] args) {
		//jdbc가 있어야 데이터베이스와 통신이 가능하다.
		Connection conn;	//접속회선
		Statement stmt;		//쿼리문을 전송하기 위한 규격
		ResultSet rs;		//select문의 결과를 받아오기 위한 규격
		
		String url="jdbc:mysql://127.0.0.1:3306/sample";	//접속위치
		String db_id="root";								//접속아이디
		String db_pw="iotiot";								//접속 비번
		String sql="select * from student order by sum desc";
		try {
			conn=DriverManager.getConnection(url, db_id, db_pw);	//회선가져옴
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("번호"+"\t"+"이름"+"\t"+"국어"+"\t"+"수학"+"\t"+"영어"+"\t"+"총점"+"\n");
			while(rs.next()) {
				String num=rs.getString(1);
				String name=rs.getString(2);
				String kor=rs.getString(3);
				String math=rs.getString(4);
				String eng=rs.getString(5);
				String Sum=rs.getString(6);
				System.out.println(num+"\t"+name+"\t"+kor+"\t"+math+"\t"+eng+"\t"+Sum);
			}
		}catch(Exception e) {
			System.out.println("접속중 오류발생 : "+e);
		}
	}
}