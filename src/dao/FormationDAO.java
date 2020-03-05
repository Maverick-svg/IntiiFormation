package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Formation;
import model.Lieu;

public class FormationDAO implements IFormationDAO {

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	
	@Override
	public void saveFormation(Formation f) {
		session.beginTransaction();
		session.saveOrUpdate(f);
		session.getTransaction().commit();
		
	}

	@Override
	public List<Formation> getFormationByLoacl(Lieu lieu) {
		List<Formation> formations = new ArrayList<Formation>();
		Query query = session.createQuery("from Formation where lieu.ville = :fff");
				query.setParameter("fff", lieu.getVille());
		formations =query.list();
		return formations;
	}

}
