package pl.zagorski.FootballDataRest.jwt;

public class JwtTokenUserData {


    private final String fullName;
    private final String username;
    private final String email;
    private final String countryCode1;

    public JwtTokenUserData(String fullName, String username, String email,String countryCode1) {
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.countryCode1 = countryCode1;
    }

    public String getCountryCode1() {
        return countryCode1;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
}
