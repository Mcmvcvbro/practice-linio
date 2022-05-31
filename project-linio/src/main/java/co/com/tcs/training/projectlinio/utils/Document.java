package co.com.tcs.training.projectlinio.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Document {
    public void Document(String nameProduct, int price, int quantity){
        try{
            String ruta = "//product.txt";
            File file = new File(ruta);
            //validacion de creacion de archivo
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter buffer = new BufferedWriter(fw);
            buffer.write(nameProduct);
            buffer.write(price);
            buffer.write(quantity);
            buffer.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
