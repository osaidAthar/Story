package modle;

public class StoryClass {

    private String title;
    private String profile;
    private String time;
    private String comment;


    public StoryClass(String title, String profile, String time, String comment) {
        this.title = title;
        this.profile = profile;
        this.time = time;
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }

    public String getProfile() {
        return profile;
    }

    public String getTime() {
        return time;
    }

    public String getComment() {
        return comment;
    }
}
