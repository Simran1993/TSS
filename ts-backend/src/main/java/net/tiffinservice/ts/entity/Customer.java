package net.tiffinservice.ts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "first_name")
    private String firstName;

    @Column(name= "last_name")
    private String lastName;

    @Column(name = "email_id", nullable = false, unique = true)
    private String email;

    @Column(name = "phone_number", unique = true, length = 10)
    private String number;

//    public Long getId() {return id;}
//
//    public void setId(Long id) {this.id = id;}
//
//    public String getFirstName() {return firstName;}
//
//    public void setFirstName(String firstName) {this.firstName = firstName;}
//
//    public int getNumber() {return number;}
//
//    public void setNumber(int number) {this.number = number;}
//
//    public String getEmail() {return email;}
//
//    public void setEmail(String email) {this.email = email;}
//    public String getLastName() {return lastName;}
//    public void setLastName(String lastName) {this.lastName = lastName;}
}
