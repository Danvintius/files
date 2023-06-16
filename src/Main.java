import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File dir1 = new File("C://Users//danil//Games//src");
        if (dir1.mkdir()) {
            System.out.println("Каталог " + dir1.getName() + " создан");
        }

        File dir2 = new File("C://Users//danil//Games//res");
        if (dir2.mkdir()) {
            System.out.println("Каталог " + dir2.getName() + " создан");
        }

        File dir3 = new File("C://Users//danil//Games//savegames");
        if (dir3.mkdir()) {
            System.out.println("Каталог " + dir3.getName() + " создан");
        }

        File dir4 = new File("C://Users//danil//Games//temp");
        if (dir4.mkdir()) {
            System.out.println("Каталог " + dir4.getName() + " создан");
        }

        File dir5 = new File("C://Users//danil//Games//src//main");
        if (dir5.mkdir()) {
            System.out.println("Каталог " + dir5.getName() + " создан");
        }

        File dir6 = new File("C://Users//danil//Games//src//test");
        if (dir6.mkdir()) {
            System.out.println("Каталог " + dir6.getName() + " создан");
        }

        File file1 = new File("C://Users//danil//Games//src//main//Main.java");
        try {
            if (file1.createNewFile())
                System.out.println("Файл " + file1.getName() + " был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File file2 = new File("C://Users//danil//Games//src//main//Utils.java");
        try {
            if (file2.createNewFile())
                System.out.println("Файл " + file2.getName() + " был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File dir7 = new File("C://Users//danil//Games//res/drawables");
        if (dir7.mkdir()) {
            System.out.println("Каталог " + dir7.getName() + " создан");
        }

        File dir8 = new File("C://Users//danil//Games//res//vectors");
        if (dir8.mkdir()) {
            System.out.println("Каталог " + dir8.getName() + " создан");
        }

        File dir9 = new File("C://Users//danil//Games//res//icons");
        if (dir9.mkdir()) {
            System.out.println("Каталог " + dir9.getName() + " создан");
        }

        File file3 = new File("C://Users//danil//Games//temp//temp.txt");
        try {
            if (file3.createNewFile())
                System.out.println("Файл " + file3.getName() + " был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Каталог src создан\n");
        sb.append("Каталог res создан\n");
        sb.append("Каталог savegames создан\n");
        sb.append("Каталог temp создан\n");
        sb.append("Каталог main создан\n");
        sb.append("Каталог test создан\n");
        sb.append("Файл temp.txt был создан\n");
        sb.append("Файл Main.java был создан\n");
        sb.append("Каталог drawables создан\n");
        sb.append("Каталог vectors создан\n");
        sb.append("Каталог icons создан\n");
        sb.append("Файл Utils.java был создан\n");
        System.out.println(sb);

        try (FileWriter writer = new FileWriter("C://Users//danil//Games//temp//temp.txt")) {
            writer.write(String.valueOf(sb));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
