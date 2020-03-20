package com.example.gsonexample;

import com.google.gson.annotations.SerializedName;

public class FamilyMember {
    @SerializedName("role")
    private String mRole;
    @SerializedName("age")
    private int mAge;

    public FamilyMember(String mRole, int mAge) {
        this.mRole = mRole;
        this.mAge = mAge;
    }

    public String getmRole() {
        return mRole;
    }

    public void setmRole(String mRole) {
        this.mRole = mRole;
    }

    public int getmAge() {
        return mAge;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }


}
