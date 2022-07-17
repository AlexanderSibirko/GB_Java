package Program;

import Program.Animals.Cat;
import Program.Animals.Dog;
import Program.Animals.Hamster;
import Program.Animals.Pets;
import Program.CupBoards.Cupboard;
import Program.GeoTrees.AnotherGeoTree;
import Program.GeoTrees.GeoTree;
import Program.GeoTrees.IGeoTree;
import Program.GeoTrees.Research;
import Program.Item.Item;
import Program.Person.Person;

/**
 * Start
 */
public class Start {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------------");
        // Дерево потомков
        Person masha = new Person("Masha");
        Person pasha = new Person("Pasha");
        Person yasha = new Person("Yasha");
        Person natasha = new Person("Natasha");
        Person sasha = new Person("Sasha");
        Person egor = new Person("Egor");
        Person irina = new Person("Irina");
        Person misha = new Person("Misha");

        IGeoTree[] geoTrees = {new GeoTree(), new AnotherGeoTree()}; //два варианта геодеревьев
        
        Person[] mashaAndPashaChilds = { yasha, natasha, sasha };
        for (IGeoTree geoTree : geoTrees) { //оба дерева отзываются на команды одинаково
            geoTree.addFamily(masha, pasha, mashaAndPashaChilds);
            geoTree.append(sasha, egor);
            geoTree.append(sasha, irina);
            geoTree.append(natasha, misha);
        }
       
        Research research1 = new Research(geoTrees[0]);
        System.out.println(
                research1.find(Program.GeoTrees.RelationType.CHILDOF, masha) + "- дети Маши (Яша, Наташа, Саша)");
        System.out.println(research1.find(Program.GeoTrees.RelationType.CHILDOF, sasha) + "- дети Саши (Ирина Ягор)");
        System.out
                .println(research1.find(Program.GeoTrees.RelationType.HUSBANDWIFEOF, pasha) + "- супруга Паши (Маша)");
        System.out.println(
                research1.find(Program.GeoTrees.RelationType.PARENTOF, natasha) + " - родители Наташи (Маша и Паша)");
        System.out.println(
                research1.find(Program.GeoTrees.RelationType.PARENTOF, masha) + " - родители Маши(неизвестны)");
        
        //работаем с другой версией дерева тем же классом research
        research1.setGeoTree(geoTrees[1]);
        System.out.println(
                research1.find(Program.GeoTrees.RelationType.CHILDOF, masha) + "- дети Маши (Яша, Наташа, Саша)");
        System.out.println(research1.find(Program.GeoTrees.RelationType.CHILDOF, sasha) + "- дети Саши (Ирина Ягор)");
        System.out
                .println(research1.find(Program.GeoTrees.RelationType.HUSBANDWIFEOF, pasha) + "- супруга Паши (Маша)");
        System.out.println(
                research1.find(Program.GeoTrees.RelationType.PARENTOF, natasha) + " - родители Наташи (Маша и Паша)");
        System.out.println(
                research1.find(Program.GeoTrees.RelationType.PARENTOF, masha) + " - родители Маши(неизвестны)");

        System.out.println("----------------------------------------------------------------");

        // Человек и шкаф
        Item ball = new Item("Мяч"); // Создём предметы
        Item coin = new Item("Монетка");
        Item panckace = new Item("Блин");
        Item yogurt = new Item("Йогурт");
        Item elefant = new Item("Слон - настоящий большой слон");

        Cupboard justCupboard = new Cupboard(); // создаём просто шкаф
        Item[] itemsInFridge = { panckace, yogurt };
        Cupboard fridge = new Cupboard("Холодильник", true, itemsInFridge);
        System.out.println(fridge.printItems()); // смотрим что у нас в холодильнике

        pasha.addItem(coin); // добавляем предметы человеку
        pasha.addItem(ball);
        System.out.println(pasha.getItems()); // смотрим что у паши в карманах

        justCupboard.addItem(elefant); // напрямую добавляем слона в шкаф (потому-что можем)

        pasha.takeItem(fridge, elefant); // пробуем достать слона из холодильника (его там нет)
        pasha.takeItem(fridge, yogurt); // забираем из холодильника йогурт

        pasha.putItem(justCupboard, panckace); // пытаемся положить в шкаф блин (который в холодильнике)
        pasha.putItem(justCupboard, coin); // калдём монетку в шкаф (шкаф закрыт)
        masha.openCupboard(justCupboard);
        pasha.putItem(justCupboard, coin); // калдём монетку в шкаф

        pasha.takeItem(justCupboard, elefant); // забираем слона из шкафа
        irina.closeCupboard(fridge);
        pasha.putItem(fridge, elefant); // кладём слона в холодильник

        System.out.println("----------------------------------------------------------------");
        // Животные и человек и человек
        Pets[] housePets = { new Cat("Барсик"), new Cat("Котилья"), new Dog("Жучка"), new Hamster("Хомя") };
        allPetsCall(housePets, "Барсик ты где ?", masha);
        allPetsCall(housePets, "Жучка пойдём гулять!", masha);
        allPetsCall(housePets, "Хомя хватит есть =)", masha);
        System.out.println("----------------------------------------------------------------");
    }

    private static void allPetsCall(Pets[] pets, String words, Person person) {
        System.out.println("Реакция всех животных на фразу: " + words);
        person.callPet(pets, words);
        System.out.println("");
    }
}
