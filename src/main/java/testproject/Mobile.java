package testproject;

public class Mobile {
    private String name;
    private String email;
    private String mobile;

    private Mobile(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.mobile = builder.mobile;
    }

    public static class Builder {
        private String name;
        private String email;
        private String mobile;

        public Builder getName(String name) {
            this.name = name;
            return this;
        }

        public Builder getEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder getMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Mobile build() {
            Mobile mm = new Mobile(this);
            return mm;
        }


    }

    public static void main(String[] args) {




    }
}