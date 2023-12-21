import kotlin.random.Random
import kotlin.random.nextInt

val random = Random


fun main() {
    println("Witaj, pora poćwiczyć matme! Wybierz rodzaj działań:")
    println("1. dodawanie 2. odejmowanie 3. mnożenie 4. dzielenie")
    val odpowiedz: String? = readLine()
    val numer: Int = odpowiedz?.toIntOrNull() ?: 0

    when (numer) {
        1 -> dodawanie();
        2 -> odejmowanie();
        3 -> mnozenie();
        4 -> dzielenie();

        else -> println("wybierz numer od 1 do 4.")
    }
}


fun dzielenie() {
    val pierwsza_liczba = random.nextInt(1..30);
    val druga_liczba = random.nextInt(1..10);

    val wynik: Int = pierwsza_liczba * druga_liczba;
    val wynik2: Int = wynik / druga_liczba;


    println("$wynik / $druga_liczba = ?")
    println("Podaj wynik:");
    val odpowiedz: String? = readLine()
    val numer: Int = odpowiedz?.toIntOrNull() ?: 0

    if(wynik2 == numer){
        println("gratulacje, odpowiedziałeś dobrze!");
    } else{
        println("niestety, odpowiedź to $wynik2");
    }
}

fun mnozenie() {
    val pierwsza_liczba = random.nextInt(1..20);
    val druga_liczba = random.nextInt(1..20);

    val wynik: Int = pierwsza_liczba * druga_liczba;

    println("$pierwsza_liczba * $druga_liczba = ?");
    println("Podaj wynik:");
    val odpowiedz: String? = readLine()
    val numer: Int = odpowiedz?.toIntOrNull() ?: 0

    if(wynik == numer){
        println("gratulacje, odpowiedziałeś dobrze!");
    } else{
        println("niestety, odpowiedź to $wynik");
    }
}


fun odejmowanie() {
    val pierwsza_liczba = random.nextInt(1..200);
    val druga_liczba = random.nextInt(1..200);

    if (pierwsza_liczba >= druga_liczba) {
        val wynik: Int = pierwsza_liczba - druga_liczba;
        println("$pierwsza_liczba - $druga_liczba = ?");
        println("Podaj wynik:");

        val odpowiedz: String? = readLine()
        val numer: Int = odpowiedz?.toIntOrNull() ?: 0

        if(wynik == numer){
            println("gratulacje, odpowiedziałeś dobrze!");
        } else{
            println("niestety, odpowiedź to $wynik");
        }
    }else {
        val wynik: Int = druga_liczba - pierwsza_liczba;
        println("$druga_liczba - $pierwsza_liczba = ?");
        println("Podaj wynik:");

        val odpowiedz: String? = readLine()
        val numer: Int = odpowiedz?.toIntOrNull() ?: 0

        if(wynik == numer){
            println("gratulacje, odpowiedziałeś dobrze!");
        } else{
            println("niestety, odpowiedź to $wynik");
        }
    }
}

fun dodawanie(){
    val pierwsza_liczba = random.nextInt(1..200);
    val druga_liczba = random.nextInt(1..200);

    val wynik: Int = pierwsza_liczba + druga_liczba;

    println("$pierwsza_liczba + $druga_liczba = ?");
    println("Podaj wynik:");
    val odpowiedz: String? = readLine()
    val numer: Int = odpowiedz?.toIntOrNull() ?: 0

    if(wynik == numer){
        println("gratulacje, odpowiedziałeś dobrze!");
    } else{
        println("niestety, odpowiedź to $wynik");
    }
}