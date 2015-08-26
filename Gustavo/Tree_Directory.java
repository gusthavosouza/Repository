package uscs;

public class Tree_Directory {

	Node_Directory root;
	Integer size;

	public Tree_Directory() {
		this.root = null;
		this.size = null;
	}

	public void insert_root(Node_Directory root) {
		this.root = root;
		this.size = 1;
	}

	public void insert_filho(Node_Directory pai, Node_Directory filho) {

		this.size++;
		filho.parent = pai;

		if (pai.firstChild == null) {
			pai.firstChild = filho;
			return;
		}

		Node_Directory noTrab = pai.firstChild;

		while (noTrab.next != null)
			noTrab = noTrab.next;

		noTrab.next = filho;
	}

}
