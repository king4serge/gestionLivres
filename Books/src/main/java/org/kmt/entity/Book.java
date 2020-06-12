package org.kmt.entity;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name = "book")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Book implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String sku;
	private String name;
	private String description;
	@Column(name = "unit_price")
	private double unitPrice;
	@Column(name = "image_url")
	private String imageUrl;
	private boolean active;
	@Column(name = "units_in_stock")
	private int unitsInStock;
	@Column(name = "date_created")
	private Date createdOn;
	@Column(name = "last_updated")
	private Date updatedOn;
	@ManyToOne
	@JoinColumn(name = "category_id", nullable=false)
	private Category category;

}
