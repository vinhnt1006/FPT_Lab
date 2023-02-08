package testclass.model;

import testclass.Author;
import testclass.Book2;

public class Ex2 {

	public static void main(String[] args) {
		Author[] authors = new Author[2];
		authors[0] = new Author("Pham Khac Vinh" , "vinhpham2761@gmail",'m');
		authors[1] = new Author("Dao Thi Hien", "phamhien981986@gmail",'f');
		
		Book2 abook = new Book2("Harry Potter" ,authors,19.95,1000);
		System.out.println("The book " + abook);
		System.out.println("The authors is : ");
		abook.getAuthorNames();
	}
		
}
