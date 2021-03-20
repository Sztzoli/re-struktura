package week07.d04.junior;

import java.time.LocalDateTime;

public class Lab {
    private String title;
    private StatusType completed;
    private LocalDateTime completedAt;

    public Lab(String title) {
        this.title = title;
        this.completed = StatusType.NOT_COMPLETED;
    }

    public Lab(String title, LocalDateTime completedAt) {
        this.title = title;
        this.completed = StatusType.COMPLETED;
        this.completedAt = completedAt;
    }

    public void complete(LocalDateTime time) {
        this.completed = StatusType.COMPLETED;
        this.completedAt = time;
    }

    public void complete() {
        complete(LocalDateTime.now());
    }

    @Override
    public String toString() {
        return "Lab{" +
                "title='" + title + '\'' +
                ", completed=" + completed +
                ", completedAt=" + completedAt +
                '}';
    }
}
