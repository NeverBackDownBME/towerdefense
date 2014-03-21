package Jatszik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreatureList {
	private List<Creature> list;

	public CreatureList() {
		super();
		list= new ArrayList<Creature>();
	}


	public void AddCreature(Creature c) {
		// TODO - implement CreatureList.AddCreature
		list.add(c);
		System.out.println("Operation AddCreature have been called");
	}

	public Creature GetTargetCreature() {
		// TODO - implement CreatureList.GetTargetCreature
		
		System.out.println("Operation GetTargetCreature have been called");
		return list.get(0);
				}

	public void MoveAllCreature() {
		// TODO - implement CreatureList.MoveAllCreature
		
		for(Iterator<Creature> i = list.iterator(); i.hasNext(); ) {
			((Creature) i).Move();
			}
		System.out.println("Operation MoveAllCreature have been called");
			
	}

	public void RemoveCreature(Creature c) {
		// TODO - implement CreatureList.RemoveCreature
		list.remove(c);
		System.out.println("Operation RemoveCreature have been called");
	}

}