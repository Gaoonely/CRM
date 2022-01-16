package com.Onely.crm.workbench.domain;

public class Activity_remark {
    String id;//id
    String noteContent;//所有者，外键关联user
    String createTime;//创建时间
    String createBy;//创建人
    String editTime;//修改时间
    String editBy;//修改人
    String editFlag;//标记：是否修改过
    String activityId;//活动id，外键关联activity

    public Activity_remark() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
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

    public void setEditFlag(String editFlag) {
        this.editFlag = editFlag;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getId() {
        return id;
    }

    public String getNoteContent() {
        return noteContent;
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

    public String getEditFlag() {
        return editFlag;
    }

    public String getActivityId() {
        return activityId;
    }
}
