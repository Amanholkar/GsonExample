package com.example.gsonexample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {
    @SerializedName("first_Name")
    private String mFirstName;
    @SerializedName("age")
    private int mAge;
    @SerializedName("mail")
    private String mMail;
    @SerializedName("address")
    private Address mAddress;
    @SerializedName("family")
    private List<FamilyMember> mFamily;


    public Employee(String mFirstName, int mAge, String mMail, Address mAddress, List<FamilyMember> mFamily) {
        this.mFirstName = mFirstName;
        this.mAge = mAge;
        this.mMail = mMail;
        this.mAddress = mAddress;
        this.mFamily = mFamily;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public int getmAge() {
        return mAge;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    public String getmMail() {
        return mMail;
    }

    public void setmMail(String mMail) {
        this.mMail = mMail;
    }

    public Address getmAddress() {
        return mAddress;
    }

    public void setmAddress(Address mAddress) {
        this.mAddress = mAddress;
    }

    public List<FamilyMember> getmFamily() {
        return mFamily;
    }

    public void setmFamily(List<FamilyMember> mFamily) {
        this.mFamily = mFamily;
    }
}
