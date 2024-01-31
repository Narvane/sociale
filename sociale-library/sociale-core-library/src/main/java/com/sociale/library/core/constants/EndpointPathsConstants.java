package com.sociale.library.core.constants;

public class EndpointPathsConstants {

    public static final String AUTHENTICATE_PATH = "/authenticate";

    public static final String ATHLETE_ALL_PATH = "/*/private/athlete/**";

    public static final String TEAM_ALL_PATH = "/*/private/team/**";

    public static final String PUBLIC_PATH = "/public/athlete";

    public static final String[] SWAGGER_PATHS = {
            "/**/v2/api-docs",
            "/**/swagger-resources/**",
            "/**/swagger-ui.html",
            "/**/webjars/**",
            "/**/swagger.json"
    };

}
