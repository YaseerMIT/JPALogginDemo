package com.link.core.service;

import com.link.core.entity.FIS;
import com.link.core.repo.FISRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FisJpaService {
  private static final Logger log = LoggerFactory.getLogger(FisJpaService.class);

  @Autowired FISRepository repository;

  public void saveFIS() {
    /*Save some demo Data in DB */
    log.info("Saving FIS -> name1");
    repository.save(new FIS(1L, "name1", "url1", "icon1", true));
    log.info("Saving FIS -> name2");
    repository.save(new FIS(2L, "name2", "url2", "icon2", true));
    log.info("Saving FIS -> name3");
    repository.save(new FIS(3L, "name3", "url3", "icon3", true));
    log.info("Saving FIS -> name4");
    repository.save(new FIS(4L, "name4", "url4", "icon4", true));
  }

  public List<FIS> getFISByName(String name) {
    log.info("retrieving FIS By Name");
    return repository.findByName(name);
  }

  public List<FIS> searchFISByName(String name) {
    log.info("retrieving FIS like Name");
    return repository.searchByName(name);
  }

}
