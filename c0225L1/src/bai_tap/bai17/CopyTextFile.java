package bai_tap.bai17;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyTextFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đường dẫn file nguồn: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Nhập đường dẫn file đích: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        if (!sourceFile.exists()) {
            System.out.println("File nguồn không tồn tại.");
            return;
        }

        if (targetFile.exists()) {
            System.out.println("File đích đã tồn tại.");
            return;
        }

        int charCount = 0;

        try (
                FileReader reader = new FileReader(sourceFile);
                FileWriter writer = new FileWriter(targetFile);
        ) {
            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
                charCount++;
            }

            System.out.println("Sao chép file CSV thành công!");
            System.out.println("Số ký tự đã sao chép: " + charCount);
        } catch (IOException e) {
            System.out.println("Lỗi khi sao chép file: " + e.getMessage());
        }
    }
}