package com.yasvand.firstspringboot.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "atbl_foreign")
public class ForeignTour {

	public ForeignTour() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ForeignTour(Long foreignId, String country, long noofpeople, boolean isPassportValid, Traveller trtourist) {
		super();
		this.foreignId = foreignId;
		this.country = country;
		this.noofpeople = noofpeople;
		this.isPassportValid = isPassportValid;
		this.trtourist = trtourist;
	}

	@Override
	public String toString() {
		return "ForeignTour [foreignId=" + foreignId + ", country=" + country + ", noofpeople=" + noofpeople
				+ ", isPassportValid=" + isPassportValid + ", trtourist=" + trtourist + "]";
	}

	public Long getForeignId() {
		return foreignId;
	}

	public void setForeignId(Long foreignId) {
		this.foreignId = foreignId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getNoofpeople() {
		return noofpeople;
	}

	public void setNoofpeople(long noofpeople) {
		this.noofpeople = noofpeople;
	}

	public boolean isPassportValid() {
		return isPassportValid;
	}

	public void setPassportValid(boolean isPassportValid) {
		this.isPassportValid = isPassportValid;
	}

	public Traveller getTrtourist() {
		return trtourist;
	}

	public void setTrtourist(Traveller trtourist) {
		this.trtourist = trtourist;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long foreignId;

	@Column(nullable = false)
	private String country;

	@Column(nullable = false)
	private long noofpeople;

	@Column(nullable = false)
	private boolean isPassportValid;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "travellercode", referencedColumnName = "travellerId")
	private Traveller trtourist;
	
}
