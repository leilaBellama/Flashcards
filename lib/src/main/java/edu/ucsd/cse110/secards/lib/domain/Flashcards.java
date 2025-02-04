package edu.ucsd.cse110.secards.lib.domain;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Flashcards {
    @NonNull
    public static List<Flashcard> rotate(List<Flashcard> cards, int i1) {
        var newCards = new ArrayList<Flashcard>();
        for (int i = 0; i < cards.size(); i++) {
            var thisCard = cards.get(i);
            var thatCard = cards.get(Math.floorMod(i + i1, cards.size()));
            newCards.add(thisCard.withSortOrder(thatCard.sortOrder()));
        }
        return newCards;
    }

    @NonNull
    public static List<Flashcard> shuffle(List<Flashcard> cards) {
        var sortOrders = cards.stream()
                .map(Flashcard::sortOrder)
                .collect(Collectors.toList());

        Collections.shuffle(sortOrders);

        var newCards = cards.stream()
                .map(card -> card.withSortOrder(sortOrders.remove(0)))
                .collect(Collectors.toList());

        return newCards;
    }
}
