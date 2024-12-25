package Academy;

public class Academy {
    private String name;
    private String address;
    private Student[] students;
    private  int studentCount;


    public Academy(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void displayInfo() {
        System.out.println("Academy Name: " + name);
        System.out.println("Academy Address: " + address);
    }
  public void addStudent( Student student){
        if (studentCount ==student.length ){
            Student[] newStudents = new Student[student.length +5];
            for (int i=0; i<student.length; i++)
            {
                newStudents[i]=students[i];
            }students=newStudents;
        }students[studentCount]= student;
        studentCount++;
      System.out.println(student.getName() + "telebe olaraq elave edilir");
  }

}

