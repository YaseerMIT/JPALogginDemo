package com.link.core.repo;

import com.link.core.entity.FIS_DTLS;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FISRepository extends CrudRepository<FIS_DTLS, Long> {

  List<FIS_DTLS> findByFisName(String name);

  @Query("from FIS_DTLS where FIS_NAME like %:keyword%")
  List<FIS_DTLS> searchByFisName(@Param("keyword") String keyword);
}
