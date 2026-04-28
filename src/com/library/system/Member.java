package com.library.system;

public class Member extends User {
    private String email;
    private String phone;

    public Member(String memeberId, String name, String email, String phone){
        super(memeberId, name);
        this.email = email;
        this.phone = phone;
     }

      public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    
    @Override
    public boolean canBorrow(){
        return true;
    }

}

