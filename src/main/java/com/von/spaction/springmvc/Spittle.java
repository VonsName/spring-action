package com.von.spaction.springmvc;


import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/27 21:16
 */
public class Spittle {

    @NotNull(message = "id只能不能为空")
    private Long id;
    private String message;
    private Date date;
    private Double latitude;
    private Double longitude;
    @DecimalMax(value = "999.99",message = "最大金额不能超过999.99元")
    private BigDecimal money;

    public Spittle() {
    }

    public Spittle(String message, Date date) {
        this(message, date, null, null);
    }

    public Spittle(String message, Date date, Double latitude, Double longitude) {
        this.id = null;
        this.message = message;
        this.date = date;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object obj) {
//        return EqualsBuilder.reflectionEquals(this, obj, "id", "date");
        return this == obj;
    }
}
