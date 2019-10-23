/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentBean;


public class CourseBean {

    @Override
    public String toString() {
        return id+"--"+ CourseName;
    }
    
    private int id;
    private String CourseName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public CourseBean(int id, String CourseName) {
        this.id = id;
        this.CourseName = CourseName;
    }
    
}
