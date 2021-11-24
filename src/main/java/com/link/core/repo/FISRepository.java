package com.link.core.repo;

import com.link.core.entity.FIS;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FISRepository extends CrudRepository<FIS, Long> {

  List<FIS> findByName(String name);

  @Query("from FIS where name like %:keyword%")
  List<FIS> searchByName(@Param("keyword") String keyword);
}
