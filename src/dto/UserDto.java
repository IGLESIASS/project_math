package dto;

import java.util.Map;
import java.util.UUID;

public class UserDto {

    private UUID id;
    private String firstName;
    private String secondName;
    private String userName;
    private String email;
    private int birthYear;
    private int progress;
    private Map<UUID, Integer> lessonsProgress;
    private Map<UUID, Integer> tasksProgress;

    public UserDto() {

    }

    public UserDto(UUID id, String firstName, String secondName, String userName,
                   String email, int birthYear, int progress, Map<UUID, Integer> lessonsProgress,
                   Map<UUID, Integer> tasksProgress) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.userName = userName;
        this.email = email;
        this.birthYear = birthYear;
        this.progress = progress;
        this.lessonsProgress = lessonsProgress;
        this.tasksProgress = tasksProgress;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public Map<UUID, Integer> getLessonsProgress() {
        return lessonsProgress;
    }

    public void setLessonsProgress(Map<UUID, Integer> lessonsProgress) {
        this.lessonsProgress = lessonsProgress;
    }

    public Map<UUID, Integer> getTasksProgress() {
        return tasksProgress;
    }

    public void setTasksProgress(Map<UUID, Integer> tasksProgress) {
        this.tasksProgress = tasksProgress;
    }
}
