package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

public class ThreadTest {
    public static void main(String[] args) {
        /*try {
            // Jarayonni ishga tushirish (misol uchun, ping buyrug'i)
            Process process = Runtime.getRuntime().exec("ping www.youtube.com/watch?v=khqvRsemu-k");

            // Jarayonning chiqishini o'qish
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Jarayon tugashini kutish
            int exitCode = process.waitFor();
            System.out.println("Process exited with code: " + exitCode);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        /*try {
            // ProcessBuilder orqali jarayonni ishga tushirish
            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.command("ping", "www.google.com");

            Process process = processBuilder.start();

            // Jarayonning chiqishini o'qish
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Jarayon tugashini kutish
            int exitCode = process.waitFor();
            System.out.println("Process exited with code: " + exitCode);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        try {
            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.command("ping", "www.google.com");

            // Ishchi katalogni o'rnatish
            processBuilder.directory(new java.io.File("src/resources"));

            // Muhit o'zgaruvchilarini o'rnatish
            Map<String, String> env = processBuilder.environment();
            env.put("MY_VAR", "my_value");

            Process process = processBuilder.start();

            // Jarayonning chiqishini o'qish
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Jarayon tugashini kutish
            int exitCode = process.waitFor();
            System.out.println("Process exited with code: " + exitCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
