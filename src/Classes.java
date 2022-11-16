public enum Classes {
    CLASS1("English class"),
    CLASS2("Biology class"),
    CLASS3("Math class"),
    CLASS4("Geography class"),
    CLASS5("German class"),
    CLASS6("Sport class"),
    CLASS7("Physics class"),
    CLASS8("Chemistry class"),

            ;

    private String schoolClass;

    Classes(String schoolClass) {
        this.schoolClass = schoolClass;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }
}
