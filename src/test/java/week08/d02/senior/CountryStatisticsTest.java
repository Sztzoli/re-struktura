package week08.d02.senior;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountryStatisticsTest {

    private CountryStatistics statistics;

    @BeforeEach
    void init() {
        statistics = new CountryStatistics();
        statistics.addFromFile();
    }

    @Test
    void maxPopulation() {
        assertEquals("Kongoi_Demokratikus_Koztarsasag" ,statistics.maxPopulation().getName());
    }
}