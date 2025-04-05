package org.mrstm.springboot.bookStoreJPALearning;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not available"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        return bookRepository.findById(id).map(existingBook -> {
//            existingBook.setTitle(updatedBook.getTitle());
//            existingBook.setAuthor(updatedBook.getAuthor());
            return ResponseEntity.ok(bookRepository.save(existingBook));
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }


}
