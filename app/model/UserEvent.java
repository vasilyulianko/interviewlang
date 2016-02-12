package model;


import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by VS-Support on 29/01/2016.
 */
public class UserEvent {


    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public Long getAffectedUser() {
        return affectedUser;
    }

    public void setAffectedUser(Long affectedUser) {
        this.affectedUser = affectedUser;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getSchoolSubject() {
        return schoolSubject;
    }

    public void setSchoolSubject(String schoolSubject) {
        this.schoolSubject = schoolSubject;
    }

    private Long user;
    private Long affectedUser;
    private String component;
    private String feature;

    private Date eventTime;
    private String action;
    private BigDecimal quantity;
    private String school;
    private String payload;
    private String function;
    private String schoolSubject;

    public String getSubfeature() {
        return subfeature;
    }

    public void setSubfeature(String subfeature) {
        this.subfeature = subfeature;
    }

    private String subfeature;

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    private String userRole;

}
