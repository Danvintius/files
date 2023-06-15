import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File dir1 = new File("C://Users//danil//Games//src");
        if (dir1.mkdir()) {
            System.out.println("Каталог " + dir1.getName() + " в каталоге " + dir1.getParent() + " создан");
        }

        File dir2 = new File("C://Users//danil//Games//res");
        if (dir2.mkdir()) {
            System.out.println("Каталог " + dir2.getName() + " в каталоге " + dir2.getParent() + " создан");
        }

        File dir3 = new File("C://Users//danil//Games//savegames");
        if (dir3.mkdir()) {
            System.out.println("Каталог " + dir3.getName() + " в каталоге " + dir3.getParent() + " создан");
        }

        File dir4 = new File("C://Users//danil//Games//temp");
        if (dir4.mkdir()) {
            System.out.println("Каталог " + dir4.getName() + " в каталоге " + dir4.getParent() + " создан");
        }

        File dir5 = new File("C://Users//danil//Games//src//main");
        if (dir5.mkdir()) {
            System.out.println("Каталог " + dir5.getName() + " в каталоге " + dir5.getParent() + " создан");
        }

        File dir6 = new File("C://Users//danil//Games//src//test");
        if (dir6.mkdir()) {
            System.out.println("Каталог " + dir6.getName() + " в каталоге " + dir6.getParent() + " создан");
        }

        File file1 = new File("C://Users//danil//Games//main//Main.java");
        try {
            if (file1.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File file2 = new File("C://Users//danil//Games//main//Utils.java");
        try {
            if (file2.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File dir7 = new File("C://Users//danil//Games//res/drawables");
        if (dir7.mkdir()) {
            System.out.println("Каталог " + dir7.getName() + " в каталоге " + dir7.getParent() + " создан");
        }

        File dir8 = new File("C://Users//danil//Games//res//vectors");
        if (dir8.mkdir()) {
            System.out.println("Каталог " + dir8.getName() + " в каталоге " + dir8.getParent() + " создан");
        }

        File dir9 = new File("C://Users//danil//Games//res//icons");
        if (dir9.mkdir()) {
            System.out.println("Каталог " + dir9.getName() + " в каталоге " + dir9.getParent() + " создан");
        }

        File file3 = new File("C://Users//danil//Games//temp//temp.txt");
        try {
            if (file3.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
