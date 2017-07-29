package com.company.project.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "GroupAppMap")
public class GroupApplicationMapping {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	
	@OneToOne(cascade=CascadeType.REMOVE)
	@JoinColumn(name="group_id", referencedColumnName="id")
	private VideoMetaData groupData;
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "application_id", referencedColumnName = "id")
	private VideoMetaData appData;

	public GroupApplicationMapping() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public VideoMetaData getAppData() {
		return appData;
	}

	public void setAppData(VideoMetaData appData) {
		this.appData = appData;
	}

	public VideoMetaData getGroupData() {
		return groupData;
	}

	public void setGroupData(VideoMetaData groupData) {
		this.groupData = groupData;
	}

}
