package net.tiffinservice.ts.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
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
