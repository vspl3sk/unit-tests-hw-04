//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package seminars.fourth.book;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {
    BookServiceTest() {
    }

    @Test
    public void testFindBookById() {
        BookRepository mockBookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(mockBookRepository);

        when(mockBookRepository.findById("5")).thenReturn(new Book("5", "Tales", "Andersen"));
        Book result = bookService.findBookById("5");

        assertEquals("Tales", result.getTitle());
        assertEquals("Andersen", result.getAuthor());
    }

    @Test
    public void testFindAllBooks() {
        BookRepository mockBookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(mockBookRepository);

        when(mockBookRepository.findAll()).thenReturn(List.of(new Book("5", "Tales", "Andersen")));
        List<Book> result = bookService.findAllBooks();

        assertEquals(1, result.size());
        assertEquals("Tales", result.get(0).getTitle());
        assertEquals("Andersen", result.get(0).getAuthor());
    }
}
