package jp.openstandia.keycloak.forms.login.freemarker;

import com.webauthn4j.data.client.challenge.Challenge;
import com.webauthn4j.data.client.challenge.DefaultChallenge;
import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.keycloak.forms.login.LoginFormsPages;
import org.keycloak.forms.login.freemarker.FreeMarkerLoginFormsProvider;
import org.keycloak.models.KeycloakSession;
import org.keycloak.theme.FreeMarkerUtil;
import org.keycloak.theme.Theme;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;
import java.util.Locale;
import java.util.Properties;

public class FreeMarkerLoginFormsProviderExt extends FreeMarkerLoginFormsProvider {

    public FreeMarkerLoginFormsProviderExt(KeycloakSession session, FreeMarkerUtil freeMarker) {
        super(session, freeMarker);
    }

    @Override
    protected void createCommonAttributes(Theme theme, Locale locale, Properties messagesBundle, UriBuilder baseUriBuilder,
            LoginFormsPages page) {

        Challenge challenge = new DefaultChallenge();
        System.out.println(challenge);

        super.createCommonAttributes(theme, locale, messagesBundle, baseUriBuilder, page);
    }
}


