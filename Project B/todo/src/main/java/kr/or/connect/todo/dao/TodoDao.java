package kr.or.connect.todo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.or.connect.todo.dto.TodoDto;

public class TodoDao {
	private static String dbUrl = "jdbc:mysql://localhost:3306/tododb";
	private static String dbUser = "todouser";
	private static String dbPassword = "todo";

	public int addTodo(TodoDto dto) {
		int insertCount = 0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "insert into todo(title, name, sequence) values(?, ?, ?)";
//		"insert into todo(title, name, sequence) values('자바스크립트공부하기', '홍길동', 1)";
//		"insert into todo(title, name, sequence) values('리포트 제출하기', '홍길동', 1)";

		try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
				PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setString(1, dto.getTitle());
			ps.setString(2, dto.getName());
			ps.setInt(3, dto.getSequence());

			insertCount = ps.executeUpdate();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return insertCount;
	}

	public List<TodoDto> getTodos() {
		List<TodoDto> list = new ArrayList<>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String sql = "select id, title, name, sequence, type, regdate from todo order by regdate desc";
//		String sql = "select id, title, name, sequence, type, regdate from todo where type = 'TODO' order by regdate desc";
//		String sql = "select id, title, name, sequence, type, regdate from todo where type = 'DOING' order by regdate desc";

		try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
				PreparedStatement ps = conn.prepareStatement(sql)) {

			try (ResultSet rs = ps.executeQuery()) {

				while (rs.next()) {
					Long id = rs.getLong(1);
					String title = rs.getString(2);
					String name = rs.getString(3);
					int sequence = rs.getInt("sequence");
					String type = rs.getString("type");
					String regdate = rs.getString("regdate");

					TodoDto dto = new TodoDto(id, title, name, sequence, type, regdate);
					list.add(dto); // list에 반복할때마다 TodoDto 인스턴스를 생성하여 list에 추가한다.
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return list;
	}

	public int updateTodo(TodoDto dto) {
		int updateCount = 0;

		Connection conn = null;
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

			String sql = "update todo set type = ? where id = ?";
//			"update todo set type = 'DOING' where id = 1";
//			"update todo set type = 'DONE' where id = 1";

			ps = conn.prepareStatement(sql);

			ps.setString(1, dto.getType());
			ps.setLong(2, dto.getId());

			updateCount = ps.executeUpdate();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			} // if

			if (conn != null) {
				try {
					conn.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			} // if
		} // finally

		return updateCount;
	}

}
