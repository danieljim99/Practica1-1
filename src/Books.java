
public class Books extends Product {
	protected enum lan{ sp,en,fr,it,ger};
	private String author;
	private int isbn;
	private lan language;
	
	Books(String name, int productId, int stock, float price, money mny, Category cat, String author,int isbn, lan language){
		super(name, productId, stock, price, mny, cat);
		this.author = author;
		this.isbn = isbn;
		this.language = language;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public lan getLanguage() {
		return language;
	}
	public void setLanguage(lan language) {
		this.language = language;
	}
	
	void printLanguage(){
		switch(language){
		case sp:
			System.out.println("Spanish.");
			break;
		case en: 
			System.out.println("English.");
			break;
		case fr:
			System.out.println("French.");
			break;
		case it:
			System.out.println("Italian.");
			break;
		case ger:
			System.out.println("German.");
			break;
			
		}
	}
}
