package pl.zagorski.FootballDataRest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.zagorski.FootballDataRest.dto.UserDto;
import pl.zagorski.FootballDataRest.exception.NotAuthorizedException;
import pl.zagorski.FootballDataRest.service.LoginService;


@RestController
@RequestMapping(value = "/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;
    @PostMapping
    public String login(@RequestBody UserDto userDto) throws NotAuthorizedException {
        return loginService.login(userDto);
    }
}
