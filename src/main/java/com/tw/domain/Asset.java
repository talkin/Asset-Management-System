package com.tw.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GenerationType;

import java.io.Serializable;

@Entity
@Table(name = "Asset")
public class Asset implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "asset_type")
    private String assetType;

    @Column()
    private String name;

    @Column
    private String owner;

    @Column
    private String status;

    @Column(name = "order_date")
    private String orderDate;

    public Asset()
    {

    }

    public long getId()
    {
        return id;
    }

    public String getAssetType()
    {
        return assetType;
    }

    public void setAssetType(String assetType)
    {
        this.assetType = assetType;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getOrderDate()
    {
        return orderDate;
    }

    public void setOrderDate(String orderDate)
    {
        this.orderDate = orderDate;
    }
}
