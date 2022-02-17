/*Fes un programa que permeti gestionar el fitxer de clients amb les següents
operacions:
a) Alta d’un client (registrar un client que no existia abans al fitxer)
b) Consulta d’un client per posició
c) Consulta d’un client per codi
d) Modificar un client
e) Esborrar un client
f) Llistat de tots els clients*/
package practica2_uf3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ramon
 */
public class Ex1 {

    public static void main(String[] args) throws IOException {
        /*        CrearFile();
        Codi();
        Nom("Paco ");
        Cognom();
        Data_naix();
        Address();
        Email();
        Nom("Pol ");
        ClientPosicio()*/
        CrearFile();
        OmplirFile();

    }

    public static File CrearFile() throws IOException {
        File arxiu = new File("./arxiu.txt");
        arxiu.createNewFile();
        return arxiu;
    }

    public static FileWriter OmplirFile() {
        FileWriter write = null;
        PrintWriter pw = null;
        String nom1, nom2;
        int Codi1, Codi2;
        String Cognom1, Cognom2;
        Date Data1, Data2;
        String Address1, Address2;
        String Email1, Email2;
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
            write = new FileWriter("arxiu.txt");
            pw = new PrintWriter(write);
            nom1 = " Paco ";
            nom2 = " Pol ";
            Codi1 = 123456;
            Codi2 = 234567;
            
                     
            pw.println("1 " + Codi(Codi1) + Nom(nom1) + Cognom(Cognom1) + Data_naix(Data1) + Address(Address1) + Email(Email1));
            pw.println("2 " + Codi(Codi2) + Nom(nom2) + Cognom(Cognom2) + Data_naix(Data2) + Address(Address2) + Email(Email2));

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (null != write) {
                write.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return write;
    }

    public static int Codi(int Codi) throws FileNotFoundException, IOException {
        File arxiu = new File("arxiu.txt");
        String file = "arxiu.txt";
        FileWriter fw = new FileWriter(file, true);
        Codi = 123456;
        if (Codi < 999999) {
            return Codi;
        } else {
            return 0;
        }
    }

    public static String Nom(String nom) {
        try {
            String file = "arxiu.txt";
            FileWriter fw = new FileWriter(file, true);
            fw.write(nom);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return nom;
    }

    public static String Cognom(String Cognom) {       
        try {
            String file = "arxiu.txt";
            FileWriter fw = new FileWriter(file, true);
            Cognom = "Fernandez ";
            fw.write(Cognom);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return Cognom;
    }

    public static String Data_naix(Date data) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
        data = new Date("09/08/1999 ");
        String dateToStr = null;
        try {
            String file = "arxiu.txt";
            FileWriter fw = new FileWriter(file, true);
            dateToStr = dateFormat.format(data);
            fw.write(dateToStr);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return dateToStr;
    }

    public static String Address(String Address) {      
        try {
            String file = "arxiu.txt";
            FileWriter fw = new FileWriter(file, true);
            Address = "Carrer de Manuel Ballbé, 5, Barcelona ";
            fw.write(Address);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return Address;
    }

    public static String Email(String Email) {
        try {
            String file = "arxiu.txt";
            FileWriter fw = new FileWriter(file, true);
            Email = "pacofernandez@gmail.com ";
            fw.write(Email);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return Email;
    }
    /*    public static FileWriter Separacio(){
    FileWriter write = null;
    PrintWriter pw = null;
    try {
    write = new FileWriter("arxiu.txt");
    pw = new PrintWriter(write);
    String file = "arxiu.txt";
    FileWriter fw = new FileWriter(file, true);
    pw.println("");
    fw.close();
    } catch (Exception e) {
    System.out.println(e);
    }
    return write;
    }*/
    

    public static String ClientPosicio() throws IOException {
        int x = 0;
        String linea;
        File arxiu = new File("arxiu.txt");
        FileReader fr = new FileReader("arxiu.txt");
        BufferedReader bf = new BufferedReader(fr);
        long numero_lin = 0;
        while ((linea = bf.readLine()) != null) {
            if (numero_lin == x) {
                System.out.println(linea);
            } else {
                numero_lin++;
            }
        }
        return linea;
    }
}

/*    public static String Lector() throws IOException {
    int x = 1;
    String linea = "paco";
    File arxiu = new File("arxiu.txt");
    FileReader fr = new FileReader("arxiu.txt");
    BufferedReader bf = new BufferedReader(fr);
    FileWriter fw = new FileWriter(arxiu, true);
    
    long numero_lin = 0;
    while ((linea = bf.readLine()) != null) {
    if (numero_lin == x) {
    fw.write(linea);
    fw.close();
    return linea;
    } else {
    numero_lin++;
    }
    }
    
    return linea;
    }*/
