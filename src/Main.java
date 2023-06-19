import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

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
        // System.out.println(sb);

        try (FileWriter writer = new FileWriter("C://Users//danil//Games//temp//temp.txt")) {
            writer.write(String.valueOf(sb));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        GameProgress gp1 = new GameProgress(30, 50, 20, 50.2);
        GameProgress gp2 = new GameProgress(40, 40, 70, 57.4);
        GameProgress gp3 = new GameProgress(90, 70, 80, 87.7);

        saveGame("C://Users//danil//Games//savegames//save1.dat", gp1);
        saveGame("C://Users//danil//Games//savegames//save2.dat", gp2);
        saveGame("C://Users//danil//Games//savegames//save3.dat", gp3);
        File save1 = new File("C://Users//danil//Games//savegames//save1.dat");
        File save2 = new File("C://Users//danil//Games//savegames//save2.dat");
        File save3 = new File("C://Users//danil//Games//savegames//save3.dat");
        ArrayList<String> savegames = new ArrayList<String>();
        savegames.add(save1.getPath());
        savegames.add(save2.getPath());
        savegames.add(save3.getPath());
        zipFiles("C://Users//danil//Games//savegames//zip.zip", savegames);
        if (save1.delete())
            System.out.println("Файл удален");
        if (save2.delete())
            System.out.println("Файл удален");
        if (save3.delete())
            System.out.println("Файл удален");
    }
    
    public static void saveGame(String path, GameProgress gp) {
        try (FileOutputStream fos = new FileOutputStream(path)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(gp);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void zipFiles(String path1, ArrayList<String> savegames) {
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(path1)); FileInputStream fis1 = new FileInputStream(savegames.get(0))) {
            ZipEntry entry = new ZipEntry("save1.dat");
            zout.putNextEntry(entry);
            byte[] buffer = new byte[fis1.available()];
            fis1.read(buffer);
            zout.write(buffer);
            zout.closeEntry();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(path1)); FileInputStream fis2 = new FileInputStream(savegames.get(1))) {
            ZipEntry entry2 = new ZipEntry("save2.dat");
            zout.putNextEntry(entry2);
            byte[] buffer = new byte[fis2.available()];
            fis2.read(buffer);
            zout.write(buffer);
            zout.closeEntry();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(path1)); FileInputStream fis3 = new FileInputStream(savegames.get(2))) {
            ZipEntry entry3 = new ZipEntry("save3.dat");
            zout.putNextEntry(entry3);
            byte[] buffer = new byte[fis3.available()];
            fis3.read(buffer);
            zout.write(buffer);
            zout.closeEntry();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
