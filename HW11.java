package hw1.pkg1;

public class HW11 {

    public static void main(String[] args) {
        Cat oneCat = new Cat("Барсик", "Сиамский", "Черно-белый",
                "Самка", 3, 9.5, "Вискас");
        Cat twoCat = new Cat("Кейси", "Персидский", "Пепельный",
                "Самец", 5, 15.6, "Всеядный");
        
        System.out.println(oneCat+"\n\n");
        System.out.println(twoCat);
        System.out.println("Погладить Кейси!");
        oneCat.voice();
    }

}
