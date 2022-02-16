/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Untils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class XImage {

    public static Image getAppIcon() {
        URL url = XImage.class.getResource("/Icon/fpt.png");
        return new ImageIcon(url).getImage();
    }

    public static void Save(File src) {
        File dts = new File("Icon", src.getName());
        if (!dts.getParentFile().exists()) {
            dts.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dts.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static ImageIcon read(String fileName){
        File file = new File("Logos",fileName);
        return new ImageIcon(new ImageIcon(file.getAbsolutePath()).getImage().getScaledInstance(172, 216, Image.SCALE_DEFAULT));
    }
}
