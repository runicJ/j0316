package t9_exam;

public class Test1VO {
	private String name;
	private int age;
	private String gender;
	private String address;
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() { 	// 값이 넘어왔는지 아닌지 체크(컬렉션 객체만 자동으로 오버라이드 되어있는것 나머지는 toString사용, 롬복)
		return "Test1VO [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}	
}