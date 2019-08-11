package com.fanniemae.mcas.service;

import com.fanniemae.mcas.model.Book;

import java.util.List;

public interface BookService {

  long save(Book book);

  Book get(long id);

  List<Book> list();

  void update(long id, Book book);

  void delete(long id);
}