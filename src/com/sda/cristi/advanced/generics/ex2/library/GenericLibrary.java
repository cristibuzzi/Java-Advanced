package com.sda.cristi.advanced.generics.ex2.library;

import com.sda.cristi.advanced.generics.ex2.model.Media;

import javax.crypto.Mac;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GenericLibrary<T extends Media> {
    final List<T> library = new ArrayList<>();

    public void addMedia(T media) {
        library.add(media);
    }

    public List<T> getAllMedia() {
        return library;
    }

    public List<T> getAllMediaWithPriceLowerThan(double price) {
        List<T> found = new ArrayList<>();
        for (T media : library) {
            if (media.getPrice() < price) {
                found.add(media);
            }
        }
        return found;
    }

    public List<T> getAllMediaWithRelaseDateAfter(LocalDate localDate) {
        List<T> found = new ArrayList<>();
        for (T media : library) {
            if (media.getRelaseDate().isAfter(localDate)) {
                found.add(media);
            }
        }
        return found;
    }

    public T getMediaByTitle(String title) {
        for (T media : library) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    }
}
