package com.eazybytes.eazyschool.model;

import lombok.Data; /**No need to use boilerplate code*/



@Data
public class Contact {

    private String name;
    private String mobileNum;
    private String email;
    private String subject;
    private String message;

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }*/
}


/**Alternative to using Lombok (Java 14 or up required)
public record Contact (String name,
                       String mobileNum,
                       String email,
                       String subject,
                       String message) {}
 */