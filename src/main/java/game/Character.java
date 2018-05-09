package game;

public class Character {

    private String name;
    private String lastname;
    private int age;
    private boolean hasJob;
    private String jobname;
    private boolean male;
    private boolean female;

    public Character(String name, String lastname, int age, boolean hasJob, String jobname, boolean male, boolean female){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.hasJob = hasJob;
        this.jobname = jobname;
        this.male = male;
        this.female = female;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHasJob(boolean hasJob) {
        this.hasJob = hasJob;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean isHasJob() {
        return hasJob;
    }

    public String getJobname() {
        return jobname;
    }

    public boolean isMale() {
        return male;
    }

    public boolean isFemale() {
        return female;
    }
}
