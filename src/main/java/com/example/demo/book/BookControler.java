package com.example.demo.book;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



@RestController
@RequestMapping(path="book")

public class BookControler {

    List<Book> books = new ArrayList<>();


    @GetMapping()
    public String test(){
        return"Book route is working";
    }

    @GetMapping("/all")
    public List<Book> getBooks(){
        return books;
    }

    @GetMapping("/info/{id}")
    public Book getBookInfo(@PathVariable Long id){
      for(Book book : books){

          if(Objects.equals(book.id(),id)){
              return book;
          }
      }
      return new Book();
    }



    @PostMapping("/add")
    public Book addbook(@RequestBody Book bookdata){
        Book newBook = newBook(bookdata.name,bookdata.author,bookdata.quantity,bookdata.releaseYear);
        books.add(newBook);
        return newBook;
    }

    private Book newBook(String name, String author, Integer quantity, Integer releaseYear) {
        return new Book(name, author, quantity, releaseYear);
    }

    @PutMapping("/update/{id}")
    public Book updateBook(@PathVariable Long id , @RequestBody Book bookData){
        for (int i = 0; i < books.size(); i++) {
            if(Objects.equals(books.get(i).id,id)){
              Book updatedBook = bookData;
              updatedBook.id = id;
              books.set(i,updatedBook);
            }
        }
        return bookData;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id){
        for (int i = 0; i < books.size(); i++){
            if(Objects.equals(books.get(i).id,id)){
                books.remove(i);
                return "Deleted Successfully";
            }
        }
        return "Sorry id is not available";
    }
}
