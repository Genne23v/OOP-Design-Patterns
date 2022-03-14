package Memento;

public class Originator {

	private String article;
	
	public void set(String newArticle) {
		System.out.println("From originator: Current version of article\n" + newArticle + "\n");
		article = newArticle;
	}
	
	public Memento storeInMemento() {
		System.out.println("From originator: Saving to Memento");
		
		return new Memento(article);
	}
	
	public String restoreFromMemento(Memento memento) {
		article = memento.getSavedArticle();
		System.out.println("From originator: Previous article saved in memento\n" + article + "\n");
		
		return article;
	}
}
