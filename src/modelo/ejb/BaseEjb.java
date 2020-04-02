package modelo.ejb;

import java.util.ArrayList;

import modelo.dao.BaseDao;
import modelo.pojo.Torneo;

public class BaseEjb {

	public ArrayList<Torneo> getTorneos(){
		BaseDao dao = new BaseDao();
		return dao.getTorneos();
	}
	
}
