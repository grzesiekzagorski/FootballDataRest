package pl.zagorski.FootballDataRest.service;

import org.keycloak.authorization.client.AuthzClient;
import org.keycloak.representations.idm.authorization.AuthorizationRequest;
import org.keycloak.representations.idm.authorization.AuthorizationResponse;
import org.springframework.stereotype.Service;
import pl.zagorski.FootballDataRest.dto.UserDto;
import pl.zagorski.FootballDataRest.exception.NotAuthorizedException;

@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public String login(UserDto userDto) throws NotAuthorizedException {

        AuthzClient authzClient = AuthzClient.create();
        AuthorizationRequest request = new AuthorizationRequest();
        AuthorizationResponse response;
        try {
            response = authzClient.authorization(userDto.getUsername(), userDto.getPassword()).authorize(request);
        } catch (Exception e) {
            throw new NotAuthorizedException("Login and / or password is incorrect");
        }
        return response.getToken();
    }
}
