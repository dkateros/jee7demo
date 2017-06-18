package gr.dkateros.demo.jee7;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import gr.dkateros.demo.jee7.control.DemoDao;

@ManagedBean
public class DemoView {
	
	@EJB DemoDao dao;
	
	public String getDemo() {
		return dao.get(1L);
	}

}
