package Exercício3;

import java.util.ArrayList;
import java.util.UUID;

public class Archive {
	ArrayList<Archivable> archivablesList;

	public Archive(){
		archivablesList = new ArrayList<>();
	}

	public void insert(Archivable archivable){
		archivablesList.add((Archivable) archivable.getClone());
	}

	public Archivable find(UUID id){
		for (Archivable archivable : archivablesList){
			if (archivable.getID().compareTo(id) == 0){
				return (Archivable) archivable.getClone();
			}
		}
		return null;
	}

}
