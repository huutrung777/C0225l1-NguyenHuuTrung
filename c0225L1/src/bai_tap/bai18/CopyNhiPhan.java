package bai_tap.bai18;
import java.io.*;
import java.util.Scanner;

public class CopyNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn tập tin nguồn: ");
        String sourcePath = scanner.nextLine();
        File sourceFile = new File(sourcePath);

        if (!sourceFile.exists() || !sourceFile.isFile()) {
            System.out.println("Tập tin nguồn không tồn tại!");
            return;
        }

        System.out.print("Nhập đường dẫn tập tin đích: ");
        String targetPath = scanner.nextLine();
        File targetFile = new File(targetPath);

        if (targetFile.exists()) {
            System.out.print("Tập tin đích đã tồn tại. Ghi đè? (y/n): ");
            String overwrite = scanner.nextLine();
            if (!overwrite.equalsIgnoreCase("y")) {
                System.out.println("Huỷ sao chép.");
                return;
            }
        }

        try (
                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(targetFile)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            int totalBytes = 0;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }

            System.out.println("Sao chép thành công.");
            System.out.println("Tổng số byte đã sao chép: " + totalBytes);

        } catch (IOException e) {
            System.out.println("Lỗi khi sao chép tệp: " + e.getMessage());
        }
    }
}
