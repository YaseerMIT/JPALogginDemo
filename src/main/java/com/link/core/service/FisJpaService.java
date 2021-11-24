package com.link.core.service;

import com.link.core.entity.FIS_DTLS;
import com.link.core.repo.FISRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class FisJpaService {
  private static final Logger log = LoggerFactory.getLogger(FisJpaService.class);

  @Autowired FISRepository repository;

  public void saveFIS() {
    /*Save some demo Data in DB */
    log.info("Saving FIS -> name1");
    repository.save(
        new FIS_DTLS(
            1L,
            "name1",
            "url1",
            "icon1",
            true,
            "provider1",
            "logo_url1",
            "status1",
            1,
            getCurrentDatTime(),
            getCurrentDatTime()));

    log.info("Saving FIS -> name2");
    repository.save(
            new FIS_DTLS(
                    2L,
                    "name2",
                    "url2",
                    "icon2",
                    true,
                    "provider2",
                    "logo_url2",
                    "status2",
                    2,
                    getCurrentDatTime(),
                    getCurrentDatTime()));

    log.info("Saving FIS -> name3");
    repository.save(
            new FIS_DTLS(
                    3L,
                    "name3",
                    "url3",
                    "icon3",
                    true,
                    "provider3",
                    "logo_url3",
                    "status3",
                    3,
                    getCurrentDatTime(),
                    getCurrentDatTime()));

    log.info("Saving FIS -> name4");
    repository.save(
            new FIS_DTLS(
                    4L,
                    "name4",
                    "url4",
                    "icon4",
                    true,
                    "provider4",
                    "logo_url4",
                    "status4",
                    4,
                    getCurrentDatTime(),
                    getCurrentDatTime()));

  }

  public List<FIS_DTLS> getFISByName(String name) {
    log.info("retrieving FIS By Name");
    return repository.findByFisName(name);
  }

  private String getCurrentDatTime() {
    return DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDateTime.now());
  }

  public List<FIS_DTLS> searchFISByName(String name) {
    log.info("retrieving FIS like Name");
    return repository.searchByFisName(name);
  }

}
