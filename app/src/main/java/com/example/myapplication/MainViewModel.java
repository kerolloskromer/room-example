package com.example.myapplication;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class MainViewModel extends AndroidViewModel {

    private ItemsRepository itemsRepository;
    private LiveData<List<Item>> allItems;

    public MainViewModel(@NonNull Application application) {
        super(application);
        itemsRepository = new ItemsRepository(application);
        allItems = itemsRepository.getAllItems();
    }

    public LiveData<List<Item>> getAllItems() {
        return allItems;
    }

    public void insert(Item item) {
        itemsRepository.insert(item);
    }

    public void delete(Item item) {
        itemsRepository.delete(item);
    }

    public void deleteAllItems() {
        itemsRepository.deleteAllItems();
    }
}
