package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface <T>{
    public boolean theSameAs(T element);
    boolean equals(Object obj);
}
