package uscs;

public class Node_Directory {

	String item;
	Integer fileSize;
	Node_Directory parent;
	Node_Directory firstChild;
	Node_Directory next;

	public Node_Directory(String item, Integer fileSize) {
		super();
		this.item = item;
		this.fileSize = fileSize;
	}

	public Integer total() {

		Integer soma = this.fileSize;

		if (this.firstChild != null) {

			Node_Directory noTrab = this.firstChild;

			while (noTrab != null) {
				soma += noTrab.total();
				noTrab = noTrab.next;
			}
		}
		return soma;
	}
}
