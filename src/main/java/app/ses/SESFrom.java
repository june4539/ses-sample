package app.ses;

public enum SESFrom {

    NO_REPLY("noreply@mosaicsquare.io", "My SES Test"),
    SUPPORT("support@mosaicsquare.io", "My SES Support Support");

    private final String email;
    private final String name;

    private SESFrom(String email, String name) {
        this.email =email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
