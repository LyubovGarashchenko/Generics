import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.AviaSouls;
import ru.netology.Ticket;
import ru.netology.TicketTimeComparator;

import java.util.Comparator;

public class AviaSoulsTest {
    @Test
    public void shouldTestSortByCots() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("EVN", "MSC", 45_000, 23, 25);
        Ticket ticket2 = new Ticket("BER", "MSC", 63_000, 26, 28);
        Ticket ticket3 = new Ticket("MSC", "MSQ", 9_000, 25, 29);
        Ticket ticket4 = new Ticket("BER", "MSC", 65_000, 23, 29);
        Ticket ticket5 = new Ticket("MSC", "TBS", 25_500, 25, 27);
        Ticket ticket6 = new Ticket("BER", "MSC", 61_000, 28, 30);
        Ticket ticket7 = new Ticket("BER", "MSC", 75_000, 23, 24);
        Ticket ticket8 = new Ticket("MSC", "RIX", 63_000, 22, 25);
        Ticket ticket9 = new Ticket("BAC", "MSC", 25_000, 28, 30);
        Ticket ticket10 = new Ticket("MSC", "BAC", 25_000, 23, 24);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);
        aviaSouls.add(ticket10);

        Ticket[] actual = aviaSouls.search("BER", "MSC");
        Ticket[] expected = {ticket6, ticket2, ticket4, ticket7};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestWithoutValue() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("EVN", "MSC", 45_000, 23, 25);
        Ticket ticket2 = new Ticket("BER", "MSC", 63_000, 26, 28);
        Ticket ticket3 = new Ticket("MSC", "MSQ", 9_000, 25, 29);
        Ticket ticket4 = new Ticket("BER", "MSC", 65_000, 23, 29);
        Ticket ticket5 = new Ticket("MSC", "TBS", 25_500, 25, 27);
        Ticket ticket6 = new Ticket("BER", "MSC", 61_000, 28, 30);
        Ticket ticket7 = new Ticket("BER", "MSC", 75_000, 23, 24);
        Ticket ticket8 = new Ticket("MSC", "RIX", 63_000, 22, 25);
        Ticket ticket9 = new Ticket("BAC", "MSC", 25_000, 28, 30);
        Ticket ticket10 = new Ticket("MSC", "BAC", 25_000, 23, 24);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);
        aviaSouls.add(ticket10);

        Ticket[] actual = aviaSouls.search("DEL", "MSC");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestOneMatch() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("EVN", "MSC", 45_000, 23, 25);
        Ticket ticket2 = new Ticket("BER", "MSC", 63_000, 26, 28);
        Ticket ticket3 = new Ticket("MSC", "MSQ", 9_000, 25, 29);
        Ticket ticket4 = new Ticket("BER", "MSC", 65_000, 23, 29);
        Ticket ticket5 = new Ticket("MSC", "TBS", 25_500, 25, 27);
        Ticket ticket6 = new Ticket("BER", "MSC", 61_000, 28, 30);
        Ticket ticket7 = new Ticket("BER", "MSC", 75_000, 23, 24);
        Ticket ticket8 = new Ticket("MSC", "RIX", 63_000, 22, 25);
        Ticket ticket9 = new Ticket("BAC", "MSC", 25_000, 28, 30);
        Ticket ticket10 = new Ticket("MSC", "BAC", 25_000, 23, 24);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);
        aviaSouls.add(ticket10);

        Ticket[] actual = aviaSouls.search("EVN", "MSC");
        Ticket[] expected = {ticket1};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldTestSortByCotsWithComparator() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("EVN", "MSC", 45_000, 23, 25);
        Ticket ticket2 = new Ticket("BER", "MSC", 63_000, 26, 28);
        Ticket ticket3 = new Ticket("MSC", "MSQ", 9_000, 25, 29);
        Ticket ticket4 = new Ticket("BER", "MSC", 65_000, 23, 29);
        Ticket ticket5 = new Ticket("MSC", "TBS", 25_500, 25, 27);
        Ticket ticket6 = new Ticket("BER", "MSC", 61_000, 28, 31);
        Ticket ticket7 = new Ticket("BER", "MSC", 75_000, 20, 24);
        Ticket ticket8 = new Ticket("MSC", "RIX", 63_000, 22, 25);
        Ticket ticket9 = new Ticket("BAC", "MSC", 25_000, 28, 30);
        Ticket ticket10 = new Ticket("MSC", "BAC", 25_000, 23, 24);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);
        aviaSouls.add(ticket10);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = aviaSouls.search("BER", "MSC", comparator);
        Ticket[] expected = {ticket2, ticket6, ticket7, ticket4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestWithoutValueWithComparator() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("EVN", "MSC", 45_000, 23, 25);
        Ticket ticket2 = new Ticket("BER", "MSC", 63_000, 26, 28);
        Ticket ticket3 = new Ticket("MSC", "MSQ", 9_000, 25, 29);
        Ticket ticket4 = new Ticket("BER", "MSC", 65_000, 23, 29);
        Ticket ticket5 = new Ticket("MSC", "TBS", 25_500, 25, 27);
        Ticket ticket6 = new Ticket("BER", "MSC", 61_000, 28, 30);
        Ticket ticket7 = new Ticket("BER", "MSC", 75_000, 23, 24);
        Ticket ticket8 = new Ticket("MSC", "RIX", 63_000, 22, 25);
        Ticket ticket9 = new Ticket("BAC", "MSC", 25_000, 28, 30);
        Ticket ticket10 = new Ticket("MSC", "BAC", 25_000, 23, 24);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);
        aviaSouls.add(ticket10);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = aviaSouls.search("USA", "MSC", comparator);
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldTestOneMatchWithComparator() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("EVN", "MSC", 45_000, 23, 25);
        Ticket ticket2 = new Ticket("BER", "MSC", 63_000, 26, 28);
        Ticket ticket3 = new Ticket("MSC", "MSQ", 9_000, 25, 29);
        Ticket ticket4 = new Ticket("BER", "MSC", 65_000, 23, 29);
        Ticket ticket5 = new Ticket("MSC", "TBS", 25_500, 25, 27);
        Ticket ticket6 = new Ticket("BER", "MSC", 61_000, 28, 30);
        Ticket ticket7 = new Ticket("BER", "MSC", 75_000, 23, 24);
        Ticket ticket8 = new Ticket("MSC", "RIX", 63_000, 22, 25);
        Ticket ticket9 = new Ticket("BAC", "MSC", 25_000, 28, 30);
        Ticket ticket10 = new Ticket("MSC", "BAC", 25_000, 23, 24);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);
        aviaSouls.add(ticket10);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = aviaSouls.search("MSC", "BAC");
        Ticket[] expected = {ticket10};

        Assertions.assertArrayEquals(expected, actual);
    }
}
