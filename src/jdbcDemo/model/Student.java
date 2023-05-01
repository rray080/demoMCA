package jdbcDemo.model;

public class Student {
	
	private int id;
	private String name;
	private String regd;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegd() {
		return regd;
	}
	public void setRegd(String regd) {
		this.regd = regd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=").append(id).append(", name=").append(name).append(", regd=").append(regd)
				.append(", age=").append(age).append("]");
		return builder.toString();
	}
	
	
}
