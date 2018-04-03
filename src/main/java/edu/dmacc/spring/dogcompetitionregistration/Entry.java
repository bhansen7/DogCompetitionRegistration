package edu.dmacc.spring.dogcompetitionregistration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="entry")
public class Entry {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "entry_id")
	private int entryId;
	@Column(name = "competition_type")
	private String competitionType;
	@Column(name = "competition_class")
	private String competitionClass;
	@Column(name = "dog_name")
	private String dogName;
	@Column(name = "owner_name")
	private String ownerName;  

	public int getEntryId() {
		return entryId;
	}



	public void setEntryId(int entryId) {
		this.entryId = entryId;
	}

	public String getCompetitionType() {
		return competitionType;
	}

	public void setCompetitionType(String competitionType) {
		this.competitionType = competitionType;
	}

	public String getCompetitionClass() {
		return competitionClass;
	}

	public void setCompetitionClass(String competitionClass) {
		this.competitionClass = competitionClass;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
}
