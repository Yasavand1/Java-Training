package com.deeps;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "menutable")
public class Menu {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long menuid;

  	
	@Column(name="menuname", nullable = false)
    @NotBlank
    @Size(max = 256)
    private String menuName;
    
    @Column(name="cuisine", nullable = false)
    @NotBlank
    @Size(max = 256)
    private String cuisine;
    
    
	public long getMenuid() {
		return menuid;
	}

	public void setMenuid(long menuid) {
		this.menuid = menuid;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	  @Override
		public String toString() {
			return "Menu [menuid=" + menuid + ", menuName=" + menuName + ", cuisine=" + cuisine + "]";
		}
	  public Menu(long menuid, String menuName, String cuisine) {
			super();
			this.menuid = menuid;
			this.menuName = menuName;
			this.cuisine = cuisine;
		}
	  
	  public Menu() {
			super();
		
		}
	  
	  

}
