package com.synectiks.cms.repository;

import com.synectiks.cms.model.Books;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "books", path = "books")
public interface BooksRepository extends PagingAndSortingRepository<Books, Integer> {
}
