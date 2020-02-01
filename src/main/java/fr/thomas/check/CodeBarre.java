/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.thomas.check;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import org.json.simple.parser.ParseException;

/**
 *
 * @author bulleux
 */
public class CodeBarre {

    private String produit;
    private String categorie;
    private String content;
    private String barCode;

    public CodeBarre() throws IOException, ParseException {
        String produit, categorie, content;
//        String barcode = "3268840001008";

        try {
            String result = null;
            Scanner sc = new Scanner(System.in);
            // scan product
            System.out.println("scan article");
            String barcode = sc.next();
            System.err.println(barcode);
            String str = "https://world.openfoodfacts.org/api/v0/product/" + barcode + ".json";
            URL url = new URL(str);
            InputStream is = url.openConnection().getInputStream();
//
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            // create string with JSON
            JsonReader jsonReader = Json.createReader(is);
            JsonObject rootJSON = jsonReader.readObject();

            produit = rootJSON.getJsonObject("product").getString("product_name_fr");
            categorie = rootJSON.getJsonObject("product").getString("categories");
            content = rootJSON.getJsonObject("product").getString("quantity");
//            System.out.println(produit + " - " + categorie);
            result = produit + " - " + categorie;
            this.produit = produit;
            this.categorie = categorie;
            this.content = content;
            this.barCode = rootJSON.getJsonObject("product").getString("code");

        } catch (IOException e) {
            System.out.println("pas d'article correspondant");
        }

    }

    @Override
    public String toString() {
        return "CodeBarre{" + "produit=" + produit + ", categorie=" + categorie + ", content=" + content + ", barCode=" + barCode + '}';
    }
    

}
