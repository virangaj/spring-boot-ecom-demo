package com.ecommerce.demo.Listing;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Listing")
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "list_id")
    private int id;

    @Column(name = "list_name")
    private String name;

    @Column(name = "list_price")
    private float price;
}
