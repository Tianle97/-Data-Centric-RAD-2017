
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
    @SessionScoped
    @RequestScoped
	@ManagedBean
	public class Student {
		private String firstName;
		private String surname;
		private String address;
		private String phone;
		private int age;
		private String sex;
		private int yearBorn;
        private String course;
	  
      
	  public Student() {
	  }

	  public String getsurname() {
	    return surname;
	  }
	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }
	  public String getFirstName() {
	    return firstName;
	  }
	  public void setSurname(String surname) {
	    this.surname = surname;
	  }
	  
	  public String getAddress() {
		return address;
	  }
	  
	  public void setAddress(String address) {
		this.address = address;
	  }

		public String getPhone() {
			return phone;
		}
	
		public void setPhone(String phone) {
			this.phone = phone;
		}
	
		public int getAge() {
			return age;
		}
	
		public void setAge(int age) {
			this.age = age;
		}
	
		public String getSex() {
			return sex;
		}
	
		public void setSex(String sex) {
			this.sex = sex;
		}
	
		public int getYearBorn() {
			return yearBorn;
		}
	
		public void setYearBorn(int yearBorn) {
			this.yearBorn = yearBorn;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}
		
	
}
