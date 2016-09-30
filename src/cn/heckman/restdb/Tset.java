package cn.heckman.restdb;

import java.util.List;

import org.rex.DB;
import org.rex.db.Ps;
import org.rex.db.exception.DBException;

import cn.heckman.pojo.Student;

public class Tset {

	public static void main(String[] args) {

		try {

			/*
			 * String sql =
			 * "INSERT INTO `student` (`name`, `clsname`) VALUES (?,?)";
			 * DB.update(sql, new Object[] { "sdfsdf", "6" }); DB.update(sql,
			 * new Ps(new Student("xxxx", "5")));
			 */

			Student st = new Student("sssssssssssss", "12");
			insert2(st);

			List<Student> list = DB.getList("select * from student",
					Student.class);
			for (Student s : list) {
				System.out.println(s);
			}

		} catch (DBException e) {
			e.printStackTrace();
		}
	}

	public static void insert(Student stu) {
		String sql = "INSERT INTO `student` (`name`, `clsname`) VALUES (?,?)";
		try {
			DB.update(sql, new Ps(stu.getName(), stu.getClsname()));
		} catch (DBException e) {
			e.printStackTrace();
		}
	}

	public static void insert2(Student stu) {
		String sql = "INSERT INTO `student` (`name`, `clsname`) VALUES (?,?)";
		String sql2 = "INSERT INTO `test` (`id`, `name`) VALUES ('3', 'qw')";
		try {
			DB.beginTransaction();
			DB.update(sql, new Ps(stu.getName(), stu.getClsname()));
			DB.update(sql2);
			DB.commit();
		} catch (DBException e) {
			e.printStackTrace();
		}
	}

}
