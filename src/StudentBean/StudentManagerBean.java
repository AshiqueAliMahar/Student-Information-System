package StudentBean;

public class StudentManagerBean {

    private int StudentId;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String FathersName;
    private String Surname;
    private String DateOfBirth;
    private String Gender;
    private String Address;
    private String Mail;
    private String ContactNumber;
    private String CourseName;
    private int Id;
    private String PhotoName;

    public String getPhotoName() {
        return PhotoName;
    }

    public void setPhotoName(String PhotoName) {
        this.PhotoName = PhotoName;
    }
    
    public StudentManagerBean(int StudentId, String FirstName, String MiddleName, String LastName, String FathersName, String Surname, String DateOfBirth, String Gender, String Mail, String ContactNumber, String Address,String CourseName,int id) {
        this.StudentId = StudentId;
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
        this.FathersName = FathersName;
        this.Surname = Surname;
        this.DateOfBirth = DateOfBirth;
        this.Gender = Gender;
        this.Mail = Mail;
        this.ContactNumber = ContactNumber;
        this.Address = Address;
        this.CourseName = CourseName;
        this.Id=id;
    }

    
    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getFathersName() {
        return FathersName;
    }

    public void setFathersName(String FathersName) {
        this.FathersName = FathersName;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
}
