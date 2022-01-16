package com.Onely.crm.workbench.domain;

public class Activity {
    String id;//id
    String owner;//所有者，外键关联user
    String name;//活动名称
    String startDate;//开始时间
    String endDate;//结束时间
    String cost;//预算
    String description;//描述
    String createTime;//创建时间
    String createBy ;//创建人
    String editTime;//修改时间
    String editBy;//修改人

    public Activity() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public void setEditBy(String editBy) {
        this.editBy = editBy;
    }

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public String getEditTime() {
        return editTime;
    }

    public String getEditBy() {
        return editBy;
    }
}
