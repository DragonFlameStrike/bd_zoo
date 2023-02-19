package com.pankov.bd_zoo.component.worker;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDate;

@Table("worker")
public class Worker {
    @Id
    private Long id;

    @Column("name")
    private String name;

    @Column("sex")
    private String sex;

    @Column("profession")
    private String profession;

    @Column("birth_day_date")
    private LocalDate birthDayDate;

    @Column("hire_date")
    private LocalDate hireDate;

    @Column("prior_service")
    private int priorService;

    @Column("salary")
    private int salary;

    public Worker() {}

    public Worker(Long id, String name, String sex, String profession, LocalDate birthDayDate, LocalDate hireDate, int priorService, int salary) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.profession = profession;
        this.birthDayDate = birthDayDate;
        this.hireDate = hireDate;
        this.priorService = priorService;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public LocalDate getBirthDayDate() {
        return birthDayDate;
    }

    public void setBirthDayDate(LocalDate birthDayDate) {
        this.birthDayDate = birthDayDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int getPriorService() {
        return priorService;
    }

    public void setPriorService(int priorService) {
        this.priorService = priorService;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
