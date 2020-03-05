package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Lieu;

public class LieuDAO implements ILieuxDAO {

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	@Override
	public void createLocal(Lieu l) {
		session.beginTransaction();
		session.saveOrUpdate(l);
		session.getTransaction().commit();
		
	}

}
