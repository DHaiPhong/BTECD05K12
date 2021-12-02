/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10;

/**
 *
 * @author NC
 */
public class Employee {

    private String name;
    private String email;
    private String phone;

    public Employee(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public String getName() {

        return name;
    }
    public void setName( String name ) {

        this.name = name;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }
    public String getPhone() {

        return phone;
    }
    public void setPhone ( String phone ) {

        this.phone = phone;
    }
}
