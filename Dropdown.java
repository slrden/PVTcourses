package efrge;
import java.util.ArrayList;
import java.util.List;

public class Dropdown implements Comparable {
	List<String> options = new ArrayList<String>();
	boolean isSelected;
	String name;

	public Dropdown(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		if (!(o instanceof Dropdown)) {
			throw new ClassCastException();
		}
		Dropdown d = (Dropdown) o;
		int result = name.compareTo(d.name);
		if (result == 0) {
			return 0;
		} else {
			return (name.compareTo(d.name) / Math.abs(name.compareTo(d.name)));
		}
	}
}
