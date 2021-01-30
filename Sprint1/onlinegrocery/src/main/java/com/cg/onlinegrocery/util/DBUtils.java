<<<<<<< HEAD
package com.cg.onlinegrocery.util;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.onlinegrocery.dao.AccountDAO;

public class DBUtils {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	AccountDAO obj=AccountDAOImpl(entityManager);
	private AccountDAO AccountDAOImpl(EntityManager entityManager2) {
		// TODO Auto-generated method stub
		return null;
	}
		
}

=======
package com.cg.onlinegrocery.util;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.onlinegrocery.dao.AccountDAO;

public class DBUtils {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	AccountDAO obj=AccountDAOImpl(entityManager);
	private AccountDAO AccountDAOImpl(EntityManager entityManager2) {
		// TODO Auto-generated method stub
		return null;
	}
		
}

>>>>>>> 2c0e3db (test)
