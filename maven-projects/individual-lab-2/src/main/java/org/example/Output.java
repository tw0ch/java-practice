package org.example;

import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.io.FileWriter;
import java.io.FileNotFoundException;

public class Output {
    public static void createJsonFile(double averageRate, ArrayList<String> mostRatedBooks, double averagePrice, double[] priceRange, double[] pageRange, ArrayList<String> booksWithoutReviews) {
        JSONObject jsonObj = new JSONObject(Map.of(
                "Cредний рейтинг:", averageRate,
                "Cписок из пяти названий самых рейтинговых книг:", mostRatedBooks,
                "Cреднюю цену:", averagePrice,
                "Диапазон цен:", priceRange[0] + " - " + priceRange[1],
                "Диапазон страниц:", pageRange[0] + " - " + pageRange[1],
                "Список названий книг, для которых нет ни одного отзыва:", booksWithoutReviews
        ));

        String jsonString = jsonObj.toJSONString();

        try {
            var crunchifyFile = new FileWriter("C:\\GitHub\\individual-lab-2\\src\\main\\java\\output.json");
            crunchifyFile.write(jsonString);
            crunchifyFile.flush();
            crunchifyFile.close();

        } catch(FileNotFoundException e) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
