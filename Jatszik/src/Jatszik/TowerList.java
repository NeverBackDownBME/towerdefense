package Jatszik;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TowerList {

	private List<Tower> list;

	public  TowerList() {
		super();
		list= new ArrayList<Tower>();
	}
	public void ShootAll() {
		// TODO - implement TowerList.ShootAll
		for(Iterator<Tower> i = list.iterator(); i.hasNext(); ) {
			((Tower) i).Shoot();
			}
		System.out.println("Operation ShootAll have been called");

	}

	public void AddTower(Tower t) {
		// TODO - implement TowerList.AddTower
		list.add(t);
		System.out.println("Operation AddTower have been called");
	}

}