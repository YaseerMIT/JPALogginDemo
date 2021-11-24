package com.link.core.controller;

import com.link.core.entity.FIS_DTLS;
import com.link.core.service.FisJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FISController {

  @Autowired FisJpaService fisJpaService;

//  default limit of bank should be 10

  @GetMapping(value = "/fis/{bankName}")
  public List<FIS_DTLS> getFIS(@PathVariable("bankName") String name) {
    fisJpaService.saveFIS();
    return fisJpaService.getFISByName(name);
  }

  @GetMapping(value = "/fis/search/{bankName}")
  public List<FIS_DTLS> searchFIS(@PathVariable("bankName") String name) {
    return fisJpaService.searchFISByName(name);
  }
}
