class Student {
  private String firstName;
  private String lastName;
  int id;

  public Student(String string1, String string2, int id) {
	  this.firstName = string1;
	  this.lastName = string2;
	  this.id = id;
  }


 
  public String getFirstName() {
    return firstName;
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public int getId() {
	  return id;
  }
  
  public void setId(int id) {
	  this.id=id;
  }


@Override
public String toString() {
	return "Student [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
}

  
  
}