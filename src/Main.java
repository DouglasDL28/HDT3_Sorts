import com.sun.source.doctree.TextTree;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;
import java.io.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.Stream;

public class Main {

    private static int AMOUNT = 3000;

    public static void main(String[] args) {
        GnomeSort myGnomeSort = new GnomeSort();
        MergeSort myMergeSort = new MergeSort();
        QuickSort myQuickSort = new QuickSort();
        RadixSort myRadixSort = new RadixSort();
        BubbleSort myBubbleSort = new BubbleSort();
        String text = "";

        for (int i = 0; i < AMOUNT; i++) {
            int number = new Random().nextInt(AMOUNT);
            text += number + " ";
        } // generador de números aleatorios.

        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("numeros.txt"), StandardCharsets.UTF_8));
            writer.write(text);
        } catch (IOException ex) {
            // Report
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {/*ignore*/}
        } // Escritura del archivo de texto con los números.

        try {
            Comparable[] data = new Comparable[AMOUNT];
            Stream<String> lines = Files.lines(
                    Paths.get("numeros.txt"),
                    StandardCharsets.UTF_8
            );
            lines.forEach(line -> {
                String[] array = line.split(" ");
                for (int i = 0; i < array.length; i++) {
                    data[i] = Integer.parseInt(array[i]);
                }
                MergeSort.mergeSort(data, data.length);
                for (Comparable i : data) {
                    System.out.println(i);
                }
            });
        } catch (IOException exception) {
            System.out.println("Error!");
        } //Lectura del archivo de texto.
    }

}




