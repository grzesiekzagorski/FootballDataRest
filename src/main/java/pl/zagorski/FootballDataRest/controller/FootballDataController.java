package pl.zagorski.FootballDataRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.zagorski.FootballDataRest.model.ResponseFootballData;
import pl.zagorski.FootballDataRest.service.FootballDataService;

@RestController
@RequestMapping("/footballData")
public class FootballDataController {

    @Autowired
    private FootballDataService footballDataService;

    @GetMapping
    public ResponseFootballData getAll() {
        return footballDataService.getAllData();
    }
}

