import java.io.*;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    private static double amountOfWords = 0;

    public static void main(String[] args) {
        createFile("notes.txt");
    }

    private static Map<String, Integer> readFile(String fileName) {
        BufferedReader reader = null;
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+");
        TreeMap<String, Integer> map = new TreeMap<>();

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    String word = matcher.group().toLowerCase();
                    map.put(word, map.getOrDefault(word, 0) + 1);
                    amountOfWords++;
                }
            }
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
        finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace(System.err);
                }
            }
        }

        return map;
    }

    private static String getName(String fileName) {
        Matcher matcher = Pattern.compile("([a-zA-Z0-9]+)\\..+").matcher(fileName);
        return matcher.find() ? matcher.group(1) + ".csv" : "fileName.csv";
    }

    private static void writeCSV(Map<String, Integer> map, String fileName) {
        FileWriter writer = null;
        try {
            Map<String, Integer> sortedMap = map.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey, Map.Entry::getValue,
                            (e1, e2) -> e1, LinkedHashMap::new));

            writer = new FileWriter(fileName, false);
            for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue() + "," + entry.getValue() / amountOfWords + "\n");
            }
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
        finally {
            if(writer != null){
                try{
                    writer.close();
                }
                catch (IOException e){
                    e.printStackTrace(System.err);
                }
            }
            amountOfWords = 0;
        }
    }

    public static void createFile(String fileName) {
        Map<String, Integer> map = readFile(fileName);
        String newFileName = getName(fileName);
        writeCSV(map, newFileName);
    }
}
