package br.com.jpa.liquibase;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main
{

	public static void main(String[] args)
	{
		final Logger logger = Logger.getGlobal();

		final EntityManagerFactory factory = Persistence.createEntityManagerFactory("liquibase");

		final EntityManager manager = factory.createEntityManager();

		logger.info(manager.toString());

		manager.close();

		factory.close();
	}

}
