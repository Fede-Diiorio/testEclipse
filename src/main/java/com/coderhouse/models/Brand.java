package com.coderhouse.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "brands")
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(length = 30, nullable = false, unique = true)
	private String name;

	@OneToMany(mappedBy = "brand", fetch = FetchType.EAGER)
	Set<User> users = new HashSet<User>();

	public Brand() {
		super();
	}

	public Brand(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + ", users=" + users + "]";
	}

}
