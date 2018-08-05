package efrge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		Page p1 = new Page();
		System.out.println(p1.compareLabels(new Label("x"), new Label("x")));
		ArrayList<Label> labels = new ArrayList<>();
		labels.add(new Label("12345"));
		labels.add(new Label("67"));
		labels.add(new Label("673"));

		try {
			System.out.println(p1.setTreeSet(labels).size());
		} catch (MyException2 e) {
			e.printStackTrace();
		}
		try {
			System.out.println(p1.showThirdDropdown());
		} catch (MyException1 e) {
			e.printStackTrace();
		}
		// LinkedList<Field> fields = new LinkedList<>();
		// fields.add(new Field(0,"dfsfs"));
		// fields.add(new Field(1,"dfjhk"));
		// try {
		// System.out.println(p1.getFirstField());
		// } catch (MyException e) {
		// e.printStackTrace();
		// }

	}

}
