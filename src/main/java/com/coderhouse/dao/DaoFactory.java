package com.coderhouse.dao;

import org.springframework.stereotype.Service;

import com.coderhouse.models.Brand;
import com.coderhouse.models.Company;
import com.coderhouse.models.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Service
public class DaoFactory {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void createBrand(Brand brand) {
		entityManager.persist(brand);
	}

	@Transactional
	public Brand getBrandById(long brandId) throws Exception {
	    try {
	        TypedQuery<Brand> query = entityManager.createQuery(
	            "SELECT br FROM Brand br WHERE br.id = :brandId", Brand.class);
	        query.setParameter("brandId", brandId);
	        return query.getSingleResult();
	    } catch (NoResultException e) {
	        throw new Exception("La marca no existe");
	    }
	}
	
	@Transactional
	public void createCompany(Company company) {
		entityManager.persist(company);
	}

	public Company getCompanyById(long companyId) throws Exception {

		try {
			TypedQuery<Company> query = entityManager.createQuery("SELECT co FROM Company co WHERE co.id = :companyId",
					Company.class);
			query.setParameter("companyId", companyId);
			return query.getSingleResult();
		} catch (NoResultException e) {
			throw new Exception("La comapañia no existe");
		}
	}

	@Transactional
	public void createUser(User user) {
		entityManager.persist(user);
	}
}
