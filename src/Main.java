public class Main {
    public static void main(String[] args) {

        int ticketPrice = 17_452; //  стоимость билета
        int mRubles = 20; // количество рублей для одной бонусной мили
        int x = ticketPrice / mRubles; // расчет количества бонусных миль

        System.out.println((x) + " бонусные(ых) мили(ь)");

    }
}