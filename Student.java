public class Student {
    private String name;
    private int idNumber;
    private String contactNumber;

    public Student(String name, int idNumber, String contactNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.contactNumber = contactNumber;
    }
    public Student() {
        this.name = "maiaroi";
        this.idNumber = 123;
        this.contactNumber = "0767676767";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(int idNumber) {
        // check if idNumber has 8 digits and does not start with 0
        if (String.valueOf(idNumber).length() == 8 && String.valueOf(idNumber).charAt(0) != '0') {
            this.idNumber = idNumber;
        } else {
            System.out.println("Invalid idNumber. Must have 8 digits and cannot start with 0.");
        }
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        // check if contactNumber starts with 0
        if (contactNumber.charAt(0) != '0') {
            System.out.println("Invalid contact number. Must start with 0");
        } 
        // check if contactNumber is a landline number
        else if (contactNumber.startsWith("02") && contactNumber.length() == 11) {
            this.contactNumber = contactNumber;
        } 
        // check if contactNumber is a mobile number
        else if (contactNumber.length() == 11) {
            this.contactNumber = contactNumber;
        } else {
            System.out.println("Invalid contact number. Landline numbers should start with 02 and be 9 digits long. Mobile numbers should be 10 digits long");
        }
    }

    public String toString() {
        return "Student" + name + ", idNumber=" + idNumber + ", contactNumber=" + contactNumber;
    }
}