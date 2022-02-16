package Exercício2;

import java.util.UUID;
import java.util.ArrayList;

public class Archive {
	ArrayList<Archivable> archivablesList;

	public Archive(){
		archivablesList = new ArrayList<>();
	}

	void insert(Archivable archivable){
		archivablesList.add((Archivable) archivable.getClone());
	}

	Archivable find(UUID id){
		for (Archivable archivable : archivablesList){
			if (archivable.getID().compareTo(id) == 0){
				return (Archivable) archivable.getClone();
			}
		}
		return null;
	}

}
