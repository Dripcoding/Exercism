import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    public static int GIGA_SECOND = (int) Math.pow(10, 9);

    private final LocalDateTime moment;
    private final LocalDateTime momentAfterGigaSecond;

    public Gigasecond(LocalDate moment) {
        this.moment = moment.atTime(0, 0, 0);
        this.momentAfterGigaSecond = getMoment().plusSeconds(GIGA_SECOND);
    }

    public Gigasecond(LocalDateTime moment) {
        this.moment = moment;
        this.momentAfterGigaSecond = getMoment().plusSeconds(GIGA_SECOND);
    }

    public LocalDateTime getDateTime() {
        return momentAfterGigaSecond;
    }

    public LocalDateTime getMoment() {
        return moment;
    }
}
