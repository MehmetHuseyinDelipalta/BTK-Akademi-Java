import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile(){
        File file=new File("C:\\JavaDemos\\files\\students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Dosya Oluşturuldu!");
            }else {
                System.out.println("Dosya zaten mevcut!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        File file=new File("C:\\JavaDemos\\files\\students.txt");
        if(file.exists()){
            //dosya adı
            System.out.println("Dosya Adı: "+file.getName());
            //dosya yolu
            System.out.println("Dosya yolu: "+file.getAbsolutePath());
            //Dosya yazılabilir mi
            System.out.println("Dosya yazılabilir mi: "+file.canWrite());
            //dosya okunabilir mi
            System.out.println("Dosya okunabilir mi: "+file.canRead());
            //dosya boyutu
            System.out.println("Dosya boyutu: "+file.length());
        }
    }
    public static void readFile(){
        File file=new File("C:\\JavaDemos\\files\\students.txt");
        try {
            Scanner reader=new Scanner(file);
            while(reader.hasNextLine()){
                String line=reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
            //true yazılırsa .txt"den sonra dosyayı ekler default olarak 0lar yazar
            BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\JavaDemos\\files\\students.txt",true));
            writer.newLine();
            writer.write("mhd.");
            System.out.println("Dosyaya yazıldı.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
