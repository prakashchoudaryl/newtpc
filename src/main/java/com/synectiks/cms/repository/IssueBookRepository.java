package com.synectiks.cms.repository;
import com.synectiks.cms.model.IssueBook;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "issuebook", path = "issuebook")
public interface IssueBookRepository extends PagingAndSortingRepository<IssueBook, Integer> {
}