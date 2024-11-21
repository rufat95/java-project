public enum Role {
    USER("This is a user"),
    ADMIN("This is a Admin "),
    SUPER_ADMIN("This is a Super_Admin");

    Role(String description) {
        this.description = description;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
