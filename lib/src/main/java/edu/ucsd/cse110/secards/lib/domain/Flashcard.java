package edu.ucsd.cse110.secards.lib.domain;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;

import edu.ucsd.cse110.secards.lib.util.errors.NotImplementedException;

public class Flashcard implements Serializable {
    private final @Nullable Integer id;
    private final @NonNull String front;
    private final @NonNull String back;

    public Flashcard(@Nullable Integer id, @NonNull String front, @NonNull String back, int sortOrder) {
        this.id = id;
        this.front = front;
        this.back = back;
    }

    public @Nullable Integer id() {
        return id;
    }

    public @NonNull String front() {
        return front;
    }

    public @NonNull String back() {
        return back;
    }

    public int sortOrder() {
        throw new NotImplementedException("sortOrder");
    }

    public Flashcard withId(int id) {
        throw new NotImplementedException("withId");
    }

    public Flashcard withSortOrder(int sortOrder) {
        throw new NotImplementedException("withSortOrder");
    }

    @Override
    public boolean equals(Object o) {
        throw new NotImplementedException("equals");
    }

    @Override
    public int hashCode() {
        throw new NotImplementedException("hashCode");
    }
}
