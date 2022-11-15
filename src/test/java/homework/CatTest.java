package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CatTest {

    Cat Barsyk = new Cat("Street", "Gray", 4.5);
    Cat Silver = new Cat("Street", "Gray", 4.5);
    Cat Murzik = new Cat("Street", "White", 4.5);

    @Test
    void shouldSleep() {
        assertThat(Barsyk.catSchedule(Weekdays.MON)).isEqualTo("Котик спить...");
    }

    @Test
    void shouldHunt() {
        assertThat(Barsyk.catSchedule(Weekdays.THU)).isEqualTo("Кіт пиймав миш");
    }

    @Test
    void shouldTygydyk() {
        assertThat(Barsyk.catSchedule(Weekdays.SUN)).isEqualTo("Тигидик!");
    }

    @Test
    void shouldLickBalls() {
        assertThat(Barsyk.catSchedule(Weekdays.UNKNOWN_DAY)).isEqualTo("Не дивись! Лизь");
    }

    @Test
    void shouldEquals() {
        assertThat(Barsyk.equals(Silver)).isTrue();
    }

    @Test
    void shouldNotEquals() {
        assertThat(Barsyk.equals(Murzik)).isFalse();
    }
}