package efrge;

public class Label implements Comparable {
	private String name;

	public String asString() {
		return name;
	}

	public Label(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		if (!(o instanceof Label)) {
			throw new ClassCastException();
		}
		Label l = (Label) o;
		int result = name.compareTo(l.name);
		if (result == 0) {
			return 0;
		} else {
			return (name.compareTo(l.name) / Math.abs(name.compareTo(l.name)));
		}
	}

}
