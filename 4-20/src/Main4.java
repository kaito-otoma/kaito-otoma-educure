import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main4 {
    public static void main(String[] args) {
       Path source = Paths.get("source.txt");
        Path backupDir = Paths.get("backup");
        Path archiveDir = Paths.get("archive");

        Path backupTarget = backupDir.resolve(source.getFileName());
        Path archiveTarget = archiveDir.resolve(source.getFileName());

        try {
            if (!Files.exists(source)) {
                Files.createFile(source);
            }

            if (!Files.exists(backupDir)) {
                Files.createDirectory(backupDir);
            }

            if (!Files.exists(archiveDir)) {
                Files.createDirectory(archiveDir);
            }

            Files.copy(source, backupTarget);
            System.out.println("ファイルが 'backup/' にコピーされました。");   
            if (Files.exists(backupTarget)) {
                System.out.println("コピーの確認: 成功");
            } else {
                System.out.println("コピーの確認: 失敗");
            }
            
            Files.move(source, archiveTarget);
            System.out.println("ファイルが 'archive/' に移動されました。");
            if (Files.exists(archiveTarget) && !Files.exists(backupTarget)) {
                System.out.println("移動の確認: 成功");
            } else {
                System.out.println("移動の確認: 失敗");
            }

        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}
