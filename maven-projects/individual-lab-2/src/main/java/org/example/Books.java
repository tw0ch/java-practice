package org.example;

import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.nio.file.Path;


public class Books {
    public static void main() {
        ArrayList<Book> books = new ArrayList<>();

        ArrayList<Double> raiting = new ArrayList<>();

        ArrayList<Integer> rate = new ArrayList<>();

        ArrayList<Double> countReviews = new ArrayList<>();
        ArrayList<String> nameBook = new ArrayList<>();
        ArrayList<String> shortDescription = new ArrayList<>();
        ArrayList<Integer> countPages = new ArrayList<>();
        ArrayList<String> typeOfBook = new ArrayList<>();
        ArrayList<Double> priceForBook = new ArrayList<>();

        // список из пяти названий самых рейтинговых книг
        ArrayList<String> massNamesBooks = new ArrayList<>();

        List<Integer> countHardcover = new ArrayList<>();
        List<Integer> countPaperback = new ArrayList<>();
        List<Integer> countEbook = new ArrayList<>();
        List<Integer> countKindleEdition = new ArrayList<>();
        double rating, numReviews, price, numReviews1;
        String title, description, format;
        int numPages, k = 0, countHardcover1 = 0, countHardcover2 = 0, countHardcover3 = 0, countHardcover4 = 0, countHardcover5 = 0, countHardcover6 = 0, countHardcover7 = 0, countHardcover8 = 0, countHardcover9 = 0;
        int countPaperback1 = 0, countPaperback2 = 0, countPaperback3 = 0, countPaperback4 = 0, countPaperback5 = 0, countPaperback6 = 0, countPaperback7 = 0, countPaperback8 = 0, countPaperback9 = 0;
        int countEbook1 = 0, countEbook2 = 0, countEbook3 = 0, countEbook4 = 0, countEbook5 = 0, countEbook6 = 0, countEbook7 = 0, countEbook8 = 0, countEbook9 = 0;
        int countKindleEdition1 = 0, countKindleEdition2 = 0, countKindleEdition3 = 0, countKindleEdition4 = 0, countKindleEdition5 = 0, countKindleEdition6 = 0, countKindleEdition7 = 0, countKindleEdition8 = 0, countKindleEdition9 = 0;

        try {
            File file = new File("C:\\Users\\egorm\\GitHub\\java-practice\\src\\IndividualLab2\\data_computer_book.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
//                 Book book = new Book(...);
//                 books.add(book);

                rating = Double.parseDouble(scanner.nextLine());
                raiting.add(rating);

                rate.add(Integer.parseInt(String.valueOf(String.valueOf(rating).charAt(0))));
                numReviews = Double.parseDouble(String.valueOf(scanner.nextLine().replaceAll(",", ".").charAt(0)));
                countReviews.add(numReviews);
                title = scanner.nextLine();
                nameBook.add(title);
                description = scanner.nextLine();
                shortDescription.add(description);
                numPages = Integer.parseInt(scanner.nextLine());
                countPages.add(numPages);
                format = scanner.nextLine();
                typeOfBook.add(format);
                price = Double.parseDouble(scanner.nextLine());
                priceForBook.add(price);

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        for (int i = 0; i < typeOfBook.size(); i++) {
            if ((typeOfBook.get(i).equals("Hardcover")) && (countReviews.get(i) == 1.0)) {
                countHardcover1++;

            }
            if ((typeOfBook.get(i).equals("Hardcover")) && (countReviews.get(i) == 2.0)) {
                countHardcover2++;

            }
            if ((typeOfBook.get(i).equals("Hardcover")) && (countReviews.get(i) == 3.0)) {
                countHardcover3++;

            }
            if ((typeOfBook.get(i).equals("Hardcover")) && (countReviews.get(i) == 4.0)) {
                countHardcover4++;
            }
            if ((typeOfBook.get(i).equals("Hardcover")) && (countReviews.get(i) == 5.0)) {
                countHardcover5++;
            }
            if ((typeOfBook.get(i).equals("Hardcover")) && (countReviews.get(i) == 6.0)) {
                countHardcover6++;
            }
            if ((typeOfBook.get(i).equals("Hardcover")) && (countReviews.get(i) == 7.0)) {
                countHardcover7++;
            }
            if ((typeOfBook.get(i).equals("Hardcover")) && (countReviews.get(i) == 8.0)) {
                countHardcover8++;
            }
            if ((typeOfBook.get(i).equals("Hardcover")) && (countReviews.get(i) == 9.0)) {
                countHardcover9++;
            }
        }
        Collections.addAll(countHardcover, countHardcover1, countHardcover2, countHardcover3, countHardcover4, countHardcover5, countHardcover6, countHardcover7, countHardcover8, countHardcover9);
        System.out.println("Гистограмма по распределению кол-ва отзывов(по тысячам) для вида книги Hardcover: ");
        for (int i = 0; i < (Collections.max(countHardcover)) && i < countHardcover.size(); i++) {
            System.out.printf("%dтыс ", i + 1);
            for (int j = 0; j < countHardcover.get(i); j++) {
                System.out.print("|");
            }
            System.out.println();
        }

        for (int i = 0; i < typeOfBook.size(); i++) {
            if ((typeOfBook.get(i).equals("Paperback")) && (countReviews.get(i) == 1.0)) {
                countPaperback1++;

            }
            if ((typeOfBook.get(i).equals("Paperback")) && (countReviews.get(i) == 2.0)) {
                countPaperback2++;

            }
            if ((typeOfBook.get(i).equals("Paperback")) && (countReviews.get(i) == 3.0)) {
                countPaperback3++;

            }
            if ((typeOfBook.get(i).equals("Paperback")) && (countReviews.get(i) == 4.0)) {
                countPaperback4++;
            }
            if ((typeOfBook.get(i).equals("Paperback")) && (countReviews.get(i) == 5.0)) {
                countPaperback5++;
            }
            if ((typeOfBook.get(i).equals("Paperback")) && (countReviews.get(i) == 6.0)) {
                countPaperback6++;
            }
            if ((typeOfBook.get(i).equals("Paperback")) && (countReviews.get(i) == 7.0)) {
                countPaperback7++;
            }
            if ((typeOfBook.get(i).equals("Paperback")) && (countReviews.get(i) == 8.0)) {
                countPaperback8++;
            }
            if ((typeOfBook.get(i).equals("Paperback")) && (countReviews.get(i) == 9.0)) {
                countPaperback9++;
            }
        }
        Collections.addAll(countPaperback, countPaperback1, countPaperback2, countPaperback3, countPaperback4, countPaperback5, countPaperback6, countPaperback7, countPaperback8, countPaperback9);
        System.out.println("Гистограмма по распределению кол-ва отзывов(по тысячам) для вида книги Paperback: ");
        for (int i = 0; i < (Collections.max(countPaperback)) && i < countPaperback.size(); i++) {
            System.out.printf("%dтыс ", i + 1);
            for (int j = 0; j < countPaperback.get(i); j++) {
                System.out.print("|");
            }
            System.out.println();
        }
        for (int i = 0; i < typeOfBook.size(); i++) {
            if ((typeOfBook.get(i).equals("ebook")) && (countReviews.get(i) == 1.0)) {
                countEbook1++;

            }
            if ((typeOfBook.get(i).equals("ebook")) && (countReviews.get(i) == 2.0)) {
                countEbook2++;

            }
            if ((typeOfBook.get(i).equals("ebook")) && (countReviews.get(i) == 3.0)) {
                countEbook3++;

            }
            if ((typeOfBook.get(i).equals("ebook")) && (countReviews.get(i) == 4.0)) {
                countEbook4++;
            }
            if ((typeOfBook.get(i).equals("ebook")) && (countReviews.get(i) == 5.0)) {
                countEbook5++;
            }
            if ((typeOfBook.get(i).equals("ebook")) && (countReviews.get(i) == 6.0)) {
                countEbook6++;
            }
            if ((typeOfBook.get(i).equals("ebook")) && (countReviews.get(i) == 7.0)) {
                countEbook7++;
            }
            if ((typeOfBook.get(i).equals("ebook")) && (countReviews.get(i) == 8.0)) {
                countEbook8++;
            }
            if ((typeOfBook.get(i).equals("ebook")) && (countReviews.get(i) == 9.0)) {
                countEbook9++;
            }
        }
        Collections.addAll(countEbook, countEbook1, countEbook2, countEbook3, countEbook4, countEbook5, countEbook6, countEbook7, countEbook8, countEbook9);
        System.out.println("Гистограмма по распределению кол-ва отзывов(по тысячам) для вида книги Ebook: ");
        for (int i = 0; i < (Collections.max(countEbook)) && i < countEbook.size(); i++) {
            System.out.printf("%dтыс ", i + 1);
            for (int j = 0; j < countEbook.get(i); j++) {
                System.out.print("|");
            }
            System.out.println();
        }
        for (int i = 0; i < typeOfBook.size(); i++) {
            if ((typeOfBook.get(i).equals("Kindle Edition")) && (countReviews.get(i) == 1.0)) {
                countKindleEdition1++;

            }
            if ((typeOfBook.get(i).equals("Kindle Edition")) && (countReviews.get(i) == 2.0)) {
                countKindleEdition2++;

            }
            if ((typeOfBook.get(i).equals("Kindle Edition")) && (countReviews.get(i) == 3.0)) {
                countKindleEdition3++;

            }
            if ((typeOfBook.get(i).equals("Kindle Edition")) && (countReviews.get(i) == 4.0)) {
                countKindleEdition4++;
            }
            if ((typeOfBook.get(i).equals("Kindle Edition")) && (countReviews.get(i) == 5.0)) {
                countKindleEdition5++;
            }
            if ((typeOfBook.get(i).equals("Kindle Edition")) && (countReviews.get(i) == 6.0)) {
                countKindleEdition6++;
            }
            if ((typeOfBook.get(i).equals("Kindle Edition")) && (countReviews.get(i) == 7.0)) {
                countKindleEdition7++;
            }
            if ((typeOfBook.get(i).equals("Kindle Edition")) && (countReviews.get(i) == 8.0)) {
                countKindleEdition8++;
            }
            if ((typeOfBook.get(i).equals("Kindle Edition")) && (countReviews.get(i) == 9.0)) {
                countKindleEdition9++;
            }
        }
        Collections.addAll(countKindleEdition, countKindleEdition1, countKindleEdition2, countKindleEdition3, countKindleEdition4, countKindleEdition5, countKindleEdition6, countKindleEdition7, countKindleEdition8, countKindleEdition9);
        System.out.println("Гистограмма по распределению кол-ва отзывов(по тысячам) для вида книги Kindle Edition: ");
        for (int i = 0; i < (Collections.max(countKindleEdition)) && i < countKindleEdition.size(); i++) {
            System.out.printf("%dтыс ", i + 1);
            for (int j = 0; j < countKindleEdition.get(i); j++) {
                System.out.print("|");
            }
            System.out.println();
        }

        // средний рейтинг
        double averageRate = raiting.stream().mapToDouble(Double::doubleValue).average().orElse(Double.NaN);

        System.out.println("Средний рейтинг: " + averageRate);


        for (int i = 0; i < raiting.size() && k < 5; i++) {
            if (raiting.get(i) == 5 || raiting.get(i) == 4) {
                System.out.println(nameBook.get(i));
                massNamesBooks.add(nameBook.get(i));
                k++;
            }
        }

        // среднюю цену
        double averagePrice = priceForBook.stream().mapToDouble(Double::doubleValue).average().orElse(Double.NaN);

        // Диапозон цен
        double[] priceRange = {Collections.min(priceForBook), Collections.max(priceForBook)};

        // Диапозон страниц
        double[] pageRange = {Collections.min(countPages), Collections.max(countPages)};

        // Список книг у которых нет отзывов
        ArrayList<String> booksWithoutReviews = new ArrayList<String>();
        for (int i = 0; i < nameBook.size(); i++) {
            if (countReviews.get(i) == 0) {
                booksWithoutReviews.add(nameBook.get(i));
            }
        }

        // Вывод в json
        Output.createJsonFile(averageRate, massNamesBooks, averagePrice, priceRange, pageRange, booksWithoutReviews);

        // Нахождение похожих книг
        Scanner inputScanner = new Scanner(System.in);
        String userBookName = inputScanner.nextLine();
    }
}

