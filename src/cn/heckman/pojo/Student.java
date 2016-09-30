package cn.heckman.pojo;

public class Student {

	private String name;
	private String clsname;

	public Student(String name, String clsname) {
		super();
		this.name = name;
		this.clsname = clsname;
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClsname() {
		return clsname;
	}

	public void setClsname(String clsname) {
		this.clsname = clsname;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", clsname=" + clsname + "]";
	}

}
