public calss Book extends TangileAsset{
	private String isbn;
	public Book(String name,int price,String color,String isbn){
		super(name,price,color);
		this.isbn = isbn;
	}
	public Strign getIsbn(){
		return this.isbn;
	}
}
