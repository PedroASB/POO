package Exercício2;

import java.util.UUID;

public interface Archivable {
	UUID getID(); // public and abstract
	Object getClone(); // public and abstract
}
