package ie.atu.bookprojectcicd;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<Book> allBooks(){
        return bookRepository.findAll();
    }
    /*public Book getBookById(String id) {
        return (Book) bookRepository.findById(id).orElse(null);
    }*/
    public Optional<Book> singleBook(String bookId){
        return bookRepository.findBookByBookId(bookId);
    }
}
