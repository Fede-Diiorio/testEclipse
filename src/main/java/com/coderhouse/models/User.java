package com.coderhouse.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(length = 20, nullable = false, unique = true)
	private String user;

	@Column(length = 20, nullable = false)
	private String name;

	@Column(length = 1)
	private char gender;

	@Column(nullable = false)
	private byte level = 0;

	@Column(length = 50, nullable = false)
	private String email;

	@Column(length = 20, nullable = false, unique = true)
	private String phone;

	@ManyToOne
	@JoinColumn(name = "brand_id", nullable = false)
	private Brand brand;

	@ManyToOne
	@JoinColumn(name = "company_id", nullable = false)
	private Company company;

	@Column(nullable = false)
	private float balance;

	@Column(nullable = false)
	private boolean asset = true;

	// Constructor
	public User() {
		super();
	}

	public User(String user, String name, char gender, String email, String phone, float balance) {
		super();
		validateBalance(balance);
		validateGender(gender);
		this.user = user;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.balance = balance;
	}

	public User(String user, String name, char gender, byte level, String email, String phone, Brand brand,
			Company company, float balance, boolean asset) {
		super();
		validateBalance(balance);
		validateGender(gender);
		this.user = user;
		this.name = name;
		this.gender = gender;
		this.level = level;
		this.email = email;
		this.phone = phone;
		this.brand = brand;
		this.company = company;
		this.balance = balance;
		this.asset = asset;
	}

	// Methods

	private void validateGender(char gender) {
		if (gender != 'M' && gender != 'F') {
			throw new IllegalArgumentException("Debe ingresar un género válido.");
		}
	}

	private void validateLevel(byte level) {
		if (level < 0 || level > 3) {
			throw new IllegalArgumentException("Debe seleccionar un nivel entre 0 y 3");
		}
	}

	private void validateBalance(float balance) {
		if (balance < 0) {
			throw new IllegalArgumentException("El saldo ingresado no puede ser menor a cero.");
		}
	}

	// GET y SET
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		validateGender(gender);
		this.gender = gender;
	}

	public byte getLevel() {
		return level;
	}

	public void setLevel(byte level) {
		validateLevel(level);
		this.level = level;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		validateBalance(balance);
		this.balance = balance;
	}

	public boolean isAsset() {
		return asset;
	}

	public void setAsset(boolean asset) {
		this.asset = asset;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", user=" + user + ", name=" + name + ", gender=" + gender + ", level=" + level
				+ ", email=" + email + ", phone=" + phone + ", brand=" + brand + ", company=" + company + ", balance="
				+ balance + ", asset=" + asset + "]";
	}

}
