/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egovernment.model;

/**
 *
 * @author kadir
 */
public class User {
    
private String identificationNo;
private String name;
private String surname;
private String password;
private String familyCode;

    public User() {
    }
    public User(String identificationNo, String name, String surname, String password, String familyCode) {
        this.identificationNo = identificationNo;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.familyCode = familyCode;
    }

    public String getIdentificationNo() {
        return identificationNo;
    }

    public void setIdentificationNo(String identificationNo) {
        this.identificationNo = identificationNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFamilyCode() {
        return familyCode;
    }

    public void setFamilyCode(String familyCode) {
        this.familyCode = familyCode;
    }


    
}
