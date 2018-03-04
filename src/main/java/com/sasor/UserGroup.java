package com.sasor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserGroup {

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Id
    private String groupName;
}
