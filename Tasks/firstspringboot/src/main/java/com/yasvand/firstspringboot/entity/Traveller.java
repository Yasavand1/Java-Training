package com.yasvand.firstspringboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "btbl_traveller")
public class Traveller {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long travellerId;
		
		@Column(nullable = false,unique = true)
		private String travellerName;
		
		@Column(nullable = false)
		private String travellerPwd;
		
		@Column(nullable = false)
		private String roles;

		public Long getTravellerId() {
			return travellerId;
		}

		public void setTravellerId(Long travellerId) {
			this.travellerId = travellerId;
		}

		public String getTravellerName() {
			return travellerName;
		}

		public void setTravellerName(String travellerName) {
			this.travellerName = travellerName;
		}

		public String getTravellerPwd() {
			return travellerPwd;
		}

		public void setTravellerPwd(String travellerPwd) {
			this.travellerPwd = travellerPwd;
		}

		public String getRoles() {
			return roles;
		}

		public void setRoles(String roles) {
			this.roles = roles;
		}

		public Traveller() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Traveller(Long travellerId, String travellerName, String travellerPwd, String roles) {
			super();
			this.travellerId = travellerId;
			this.travellerName = travellerName;
			this.travellerPwd = travellerPwd;
			this.roles = roles;
		}

		@Override
		public String toString() {
			return "Traveller [travellerId=" + travellerId + ", travellerName=" + travellerName + ", travellerPwd="
					+ travellerPwd + ", roles=" + roles + "]";
		}
		
		
	}


