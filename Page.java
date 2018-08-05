package efrge;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Page {

	ArrayList<Button> buttons;
	LinkedList<Field> fields;
	HashSet<Label> labels;
	TreeSet<Dropdown> dropdowns;
	float id;
	String title;

	public Page() {
		this.buttons = new ArrayList<Button>();
		this.fields = new LinkedList<Field>();
		this.labels = new HashSet<Label>();
		this.dropdowns = new TreeSet<Dropdown>();
		this.id = 0;
		this.title = null;

	}

	public Page(ArrayList<Button> buttons, LinkedList<Field> fields, HashSet<Label> labels, TreeSet<Dropdown> dropdows,
			float id, String title) {
		this.buttons = buttons;
		this.fields = fields;
		this.labels = labels;
		this.dropdowns = dropdows;
		this.id = id;
		this.title = title;

	}

	public boolean containButton(Button button) {
		return buttons.contains(button);
	}

	public Field getFirstField() throws MyException {
		Field field = fields.getFirst();
		if (field == null)
			throw new MyException();
		return field;

	}

	public Field getLastField() throws MyException {
		Field field = fields.getLast();
		if (field == null)
			throw new MyException();
		return field;

	}

	public HashSet<Label> setHashset(Label[] labels) {
		HashSet<Label> mySet = new HashSet<Label>(Arrays.asList(labels));
		this.labels.addAll(mySet);
		return this.labels;
	}

	public TreeSet<Dropdown> setTreeSet(ArrayList<Label> labels) throws MyException2 {
		if (!labels.isEmpty()) {
			TreeSet<Dropdown> dropdowns = new TreeSet<Dropdown>();
			for (Label label : labels) {
				String labelAsString = label.asString();
				Dropdown d = new Dropdown(labelAsString);
				dropdowns.add(d);
			}
			this.dropdowns = dropdowns;
			return this.dropdowns;
		} else {
			throw new MyException2();
		}
	}

	public int compareLabels(Label label1, Label label2) {
		return label1.compareTo(label2);
	}

	public LinkedHashSet<Dropdown> showThirdDropdown() throws MyException1 {
		LinkedHashSet<Dropdown> dropdownsSet = new LinkedHashSet<Dropdown>(this.dropdowns);
		if (dropdownsSet.size() > 2) {
			Iterator<Dropdown> itr = dropdownsSet.iterator();

			for (int i = 0; itr.hasNext(); i++) {
				if (i == 2) {
					System.out.println(itr.next());
					break;
				}
			}

		} else {
			throw new MyException1();
		}

		return dropdownsSet;
	}
}
