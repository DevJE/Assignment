package ncs.test8;

public class User {
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	public User() {}

	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return this.id + " " + this.password + " " + this.name + " " + this.age + " " + this.gender + " "
				+ this.phone;
	}
	@Override
	public boolean equals(Object obj) {
		User copyUsers = (User)obj;
		return (this.id.equals(copyUsers.id) && this.name.equals(copyUsers.name) && this.password.equals(copyUsers.password) 
				&& this.age == copyUsers.age &&
				this.gender == copyUsers.gender && this.phone.equals(copyUsers.phone));
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new User(this.id, this.password, this.name, this.age, this.gender, this.phone);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
