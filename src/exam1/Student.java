package exam1;

import java.util.ArrayList;

public class Student {
        private static  int counter=0;
        private int id;
        private String LastName;
        private String FirstName;
        private String MiddleName;
        private String DateofBirth;
        private String adress;
        private String PhoneNumber;
        private String Faculty;
        private int course;
        private int group;
        public Student( String lastName, String firstName, String middleName, String dateofBirth, String adress, String phoneNumber, String faculty, int course, int group) {
            this.id = counter++;
            this.LastName = lastName;
            this.FirstName = firstName;
            this.MiddleName = middleName;
            this.DateofBirth = dateofBirth;
            this.adress = adress;
            this.PhoneNumber = phoneNumber;
            this.Faculty = faculty;
            this.course = course;
            this.group = group;
        }
        public void show()
        {
            System.out.printf("%3s %11s %14s %16s %18s %12s %13s %14s %14s %16s",getId(),getLastName(),getFirstName(),getMiddleName(),
                    getDateofBirth(),getAdress(),getPhoneNumber(),getFaculty(),getCourse(),getGroup());
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
        }
        public  static void getStudentsOfFaculty(ArrayList<exam1.Student> list1,String faculty )
        {
//            Iterator<Student> iter= list1.iterator();
//            while(iter.hasNext())
//            {
//                if(iter.next().getFaculty().equals(faculty))
//                {
//                    iter.next().show();
//                }
//            }
            for(Student student:list1)
            {
                if(student.getFaculty().equalsIgnoreCase(faculty))
                {
                    student.show();
                }
            }
        }
        public  static void getStudentsOfFacultyAndCourse(ArrayList<exam1.Student> list2,String faculty, int course)
        {
//            Iterator<exam1.Student> iter=list2.iterator();
//            while(iter.hasNext())
//            {
//                if(iter.next().getFaculty().equals(faculty)&&iter.next().getCourse()==course)
//                {
//                    iter.next().show();
//                }
//            }
            for(Student student:list2)
            {
                if(student.getFaculty().equalsIgnoreCase(faculty)&&student.getCourse()==course)
                {
                    student.show();
                }
            }
        }
        public  static void getStudentsByYear(ArrayList<exam1.Student> list3, String Year)
        {
//            Iterator<exam1.Student> iter=list3.iterator();
//            while(iter.hasNext())
//            {
//                if(Year.equals(iter.next().getDateofBirth()))
//                {
//                    iter.next().show();
//                }
//            }
            for(Student student:list3)
            {
                //getDateofBirth().substring(6)

                if(student.getYear().equals(Year))
                {
                    student.show();
                }
            }
        }
        public  static void getStudentGroup(ArrayList<exam1.Student> list4, int group)
        {
//            Iterator<exam1.Student> iter=list4.iterator();
//            while(iter.hasNext())
//            {
//                if(iter.next().getGroup()==group)
//                {
//                    iter.next().show();
//                }
//            }
            for(Student student:list4)
            {
                if(student.getGroup()==group)
                {
                    student.show();
                }
            }
        }
        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", LastName='" + LastName + '\'' +
                    ", FirstName='" + FirstName + '\'' +
                    ", MiddleName='" + MiddleName + '\'' +
                    ", DateofBirth=" + DateofBirth +
                    ", adress='" + adress + '\'' +
                    ", PhoneNumber=" + PhoneNumber +
                    ", Faculty='" + Faculty + '\'' +
                    ", course=" + course +
                    ", group=" + group +
                    '}';
        }

        public int getId() {
            return id;
        }
//public String getYear(){
//          return  getDateofBirth().substring(6);
//}
        public void setId(int id) {
            this.id = id;
        }

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String lastName) {
            this.LastName = lastName;
        }

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            this.FirstName = firstName;
        }

        public String getMiddleName() {
            return MiddleName;
        }

        public void setMiddleName(String middleName) {
            this.MiddleName = middleName;
        }

        public String getDateofBirth() {
            return DateofBirth;
        }
    public String getYear() {
            String[] str=this.DateofBirth.split("(\\.|_|-|\\s|/)");
          int  index=0;
            for(int i=0;i< str.length;i++){
                if(str[i].length()==4)
                {
                    index=i;
                }
            }
        return str[index];
    }
        public void setDateofBirth(String dateofBirth) {
            this.DateofBirth = dateofBirth;
        }

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }

        public String getPhoneNumber() {
            return PhoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.PhoneNumber = phoneNumber;
        }

        public String getFaculty() {
            return Faculty;
        }

        public void setFaculty(String faculty) {
            this.Faculty = faculty;
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        public int getGroup() {
            return group;
        }

        public void setGroup(int group) {
            this.group = group;
        }
    }

