package com.company.project.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="VideoMetaData")
public class VideoMetaData implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="metadata_name")
	private String metaDataName;
	
	@Column(name="metadata_value")
	private String metaDataValue;

	public VideoMetaData() {
		// TODO Auto-generated constructor stub
	}
	
	public VideoMetaData(String name, String value) {
		this.metaDataName = name;
		this.metaDataValue = value;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMetaDataName() {
		return metaDataName;
	}

	public void setMetaDataName(String metaDataName) {
		this.metaDataName = metaDataName;
	}

	public String getMetaDataValue() {
		return metaDataValue;
	}

	public void setMetaDataValue(String metaDataValue) {
		this.metaDataValue = metaDataValue;
	}
	
}
