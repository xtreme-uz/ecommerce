package uz.xtreme.ecommerce.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "application")
public class ApplicationProperties {

    private final Jwt jwt = new Jwt();

    public Jwt getJwt() {
        return jwt;
    }

    public static class Jwt {

        private String secret;

        private Long expiration;

        public String getSecret() {
            return secret;
        }

        public Long getExpiration() {
            return expiration;
        }

        public void setSecret(String secret) {
            this.secret = secret;
        }

        public void setExpiration(Long expiration) {
            this.expiration = expiration;
        }
    }

}
