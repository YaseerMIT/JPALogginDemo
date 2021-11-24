package com.link.core.controller;

import com.link.core.entity.FIS;
import com.link.core.service.FisJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FISController {

  @Autowired FisJpaService fisJpaService;

  @GetMapping(value = "/fis/{bankName}")
  public List<FIS> getFIS(@PathVariable("bankName") String name) {
    fisJpaService.saveFIS();
    return fisJpaService.getFISByName(name);
  }

  @GetMapping(value = "/fis/search/{bankName}")
  public List<FIS> searchFIS(@PathVariable("bankName") String name) {
    return fisJpaService.searchFISByName(name);
  }
}
