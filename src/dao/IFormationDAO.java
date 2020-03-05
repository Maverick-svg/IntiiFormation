package dao;

import java.util.ArrayList;
import java.util.List;

import model.Formation;
import model.Lieu;

public interface IFormationDAO {

	public void saveFormation(Formation f);
	public List<Formation> getFormationByLoacl( Lieu lieu);
}
