package first;

import java.util.ArrayList;
import java.util.List;

public class BookService {

	public List<Book> findDuplicateBooks(Book[] books) {
		List<Book> duplicateBooks =new ArrayList<>();
		for(int i=0;i<books.length;i++) {
			for (int j = i+1; j < books.length; j++) {
				if(checkEqual(books[i],books[j])) {
					duplicateBooks.add(books[i]);
					break;
				}
			}
		}
		return duplicateBooks;
	}

	private boolean checkEqual(Book book, Book book2) {
		if(book.getId()==book2.getId() && book.getTitle().equals(book2.getTitle()) && book.getAuthor().equals(book2.getAuthor())) {
			return true;
		}
		return false;
	}

}
