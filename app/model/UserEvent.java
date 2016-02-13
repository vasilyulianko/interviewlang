package model;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by VS-Support on 29/01/2016.
 */
public class UserEvent implements Serializable {

    private Date eventTime;
    private String school;
    private Long user;
    private String userRole;
    private Long affectedUser;
    private String component;
    private String feature;
    private String subfeature;
    private String action;
    private BigDecimal quantity;
    private String payload;

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
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

    public String getSubfeature() {
        return subfeature;
    }

    public void setSubfeature(String subfeature) {
        this.subfeature = subfeature;
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

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}
