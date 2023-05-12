package tn.csf.market.repository;

import org.springframework.data.repository.CrudRepository;

import tn.csf.market.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
