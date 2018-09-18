package com.senlang.mod.dao;

import com.senlang.mod.model.t_peoplefeature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import java.util.List;

public interface t_peoplefeatureRepo extends JpaRepository<t_peoplefeature, Long>, QueryDslPredicateExecutor<t_peoplefeature> {
	t_peoplefeature findByName(String name);
	List<t_peoplefeature> findAll();
}