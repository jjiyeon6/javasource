package timetable;

import java.util.ArrayList;

import board.Board;

public class ServiceImpl implements Service {
	private Dao dao;
	
	public ServiceImpl() {
		dao = new DaoImpl();
	}

	@Override
	public ArrayList<Timetable> getAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}
	
}
