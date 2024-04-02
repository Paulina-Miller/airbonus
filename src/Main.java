public class Main {
    public static void main(String[] args) {
        int ticketPrice = 185_936; // стоимость билета
        int rublesPerMile = 20; // количество рублей для одной бонусной мили
        int bonusMiles = ticketPrice / rublesPerMile; // количество бонусных миль
        System.out.println("Начисленные мили: " + bonusMiles);
    }
}
