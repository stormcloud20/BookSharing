package com.booksharing.apisystem.model;

import jakarta.persistence.*;

import java.sql.Blob;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "roleId", nullable = false)
    private Role role;

    @Column
    private String userYear;

    @Lob
    @Column
    private byte[] pPic;

    @Column
    private int sellRate;

    @Column
    private int sellCount;

    @Column
    private int buyRate;

    @Column
    private int buyCount;

    public User() {
    }

    public User(Long userId, String username, String password, String email, Role role, String userYear, byte[] pPic, int sellRate, int sellCount, int buyRate, int buyCount) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.userYear = userYear;
        this.pPic = pPic;
        this.sellRate = sellRate;
        this.sellCount = sellCount;
        this.buyRate = buyRate;
        this.buyCount = buyCount;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUserYear() {
        return userYear;
    }

    public void setUserYear(String userYear) {
        this.userYear = userYear;
    }

    public byte[] getpPic() {
        return pPic;
    }

    public void setpPic(byte[] pPic) {
        this.pPic = pPic;
    }

    public int getSellRate() {
        return sellRate;
    }

    public void setSellRate(int sellRate) {
        this.sellRate = sellRate;
    }

    public int getSellCount() {
        return sellCount;
    }

    public void setSellCount(int sellCount) {
        this.sellCount = sellCount;
    }

    public int getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(int buyRate) {
        this.buyRate = buyRate;
    }

    public int getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }
}
