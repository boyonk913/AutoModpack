package pl.skidam.automodpack;

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public class UnZip implements Runnable {
    @Override
    public void run() {
        System.out.println("Unzipowanie!");
        try {
            new ZipFile("./mods/modpack.zip").extractAll("./");
        } catch (ZipException e) {
            e.printStackTrace();
        }
    }
}
