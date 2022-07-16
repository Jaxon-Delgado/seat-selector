package main.persons;


import main.sqlManager.SQLConnection;

import java.sql.*;
import java.util.ArrayList;

public class Student {

  private long id;
  private String name;
  private Date dob;
  private String math;
  private String science;
  private String english;
  private String history;
  private long gradeLvl;
  private long delincCount;

  public ResultSet rs;

//  public Student(long id) {
//    this.id = id;
//  }

  public void getStudents() {
    // long n = getId();
    // String sql = "SELECT * FROM admin WHERE id = " + n;
    String sql = "SELECT * FROM student";

    try (Connection con = SQLConnection.connectDB()) {
      assert con != null;
      try (Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery(sql)) {
        this.rs = rs;
        displayStudent(rs);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  public void displayStudent(ResultSet rs) throws SQLException {
    this.rs = rs;
    ArrayList<String> studentList = new ArrayList<>();
    while (rs.next()) {

      String idString = String.valueOf(getId());
      String dobString = getDob().toString();
      String nameString = getName();

      studentList.add(idString);
      studentList.add(nameString);
      studentList.add(dobString);
      studentList.add(getMath());
      studentList.add(getScience());
      studentList.add(getEnglish());
      studentList.add(getHistory());
      studentList.add(getElective1());
      studentList.add(getElective2());
      studentList.add(getElective3());
      studentList.add(getElective4());
      studentList.add(String.valueOf(getGradeLvl()));
      studentList.add(String.valueOf(getDelincCount()));

      studentList.add("\n");
    }
    System.out.println(studentList);

  }

  public long getId() {
    return id;
  }

  public String getName() throws SQLException {
    return name = rs.getString("first_name") + " " + rs.getString("last_name");
  }

  public void setName(String name) {
    this.name = name;
  }


  public Date getDob() throws SQLException {
    return dob = rs.getDate("dob");
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }


  public String getMath() throws SQLException {
    math = "No Math";
    if (rs.getBoolean("math")) {
      return math = "Math";
    }
    return math;
  }

  public void setMath(String math) {
    this.math = math;
  }


  public String getScience() throws SQLException {
    science = "No Science";
    if (rs.getBoolean("science")) {
      return science = "Science";
    }
    return science;
  }

  public void setScience(String science) {
    this.science = science;
  }


  public String getEnglish() throws SQLException {
    english = "No English";
    if (rs.getBoolean("english")) {
      return english = "English";
    }
    return english;
  }

  public void setEnglish(String english) {
    this.english = english;
  }


  public String getHistory() throws SQLException {
    history = "No History";
    if (rs.getBoolean("history")) {
      return history = "History";
    }
    return history;  }

  public void setHistory(String history) {
    this.history = history;
  }


  public String getElective1() throws SQLException {
    if (rs.getString("elective_1") != null) {
      return rs.getString("elective_1");
    }
    return "No Elective";  }

  public void setElective1(String elective1) {
  }


  public String getElective2() throws SQLException {
    if (rs.getString("elective_2") != null) {
      return rs.getString("elective_2");
    }
    return "No Elective";
  }

  public void setElective2(String elective2) {
  }


  public String getElective3() throws SQLException {
    if (rs.getString("elective_3") != null) {
      return rs.getString("elective_3");
    }
    return "No Elective";
  }

  public void setElective3(String elective3) {
  }


  public String getElective4() throws SQLException {
    if (rs.getString("elective_4") != null) {
      return rs.getString("elective_4");
    }
    return "No Elective";
  }

  public void setElective4(String elective4) {
  }


  public long getGradeLvl() throws SQLException {
    return gradeLvl = rs.getInt("grade_lvl");
  }

  public void setGradeLvl(long gradeLvl) {
    this.gradeLvl = gradeLvl;
  }


  public long getDelincCount() throws SQLException {
    return delincCount = rs.getInt("delinc_count");
  }

  public void setDelincCount(long delincCount) {
    this.delincCount = delincCount;
  }

}
