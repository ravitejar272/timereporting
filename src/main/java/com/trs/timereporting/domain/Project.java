package com.trs.timereporting.domain;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by williamzappasodi on 1/10/16.
 *
 * A domain model is a representation of the data storage types required by the business logic.
 */

@XmlRootElement

public class Project {

    @NotEmpty(message="{NotNull.Project.hours.validation}")
    private String hours;
    @NotEmpty(message="{NotNull.Project.startdate.validation}")
    private String startDate;


    @NotEmpty(message="{NotNull.Project.duedate.validation}")
    private String dueDate;

    private String name;
    private String invoiceSent;

    @NotNull(message="{NotNull.Project.client.validation}")
    private Integer clientId;
    private Integer projectId;

    @NotEmpty(message="{NotNull.Project.description.validation}")
    private String description;


    public Project() {

    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String client) {
        this.name = client;
    }

    public String getInvoiceSent() {
        return invoiceSent;
    }

    public void setInvoiceSent(String invoiceSent) {
        this.invoiceSent = invoiceSent;
    }




    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
}
