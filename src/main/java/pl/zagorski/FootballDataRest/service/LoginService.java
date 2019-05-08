package pl.zagorski.FootballDataRest.service;

import pl.zagorski.FootballDataRest.dto.UserDto;
import pl.zagorski.FootballDataRest.exception.NotAuthorizedException;

public interface LoginService {
    String login(UserDto userDto) throws NotAuthorizedException;

}
