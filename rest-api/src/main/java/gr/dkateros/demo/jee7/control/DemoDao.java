package gr.dkateros.demo.jee7.control;

import javax.ejb.Stateless;

import gr.dkateros.demo.jee7.entity.Demo;
import gr.dkateros.demo.jee7.util.BaseDao;

@Stateless
public class DemoDao extends BaseDao<Demo>{

	public DemoDao() {
		super(Demo.class);
	}
	
}
