package com.example.blackmoon.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\b2\u0006\u0010\u0014\u001a\u00020\u0015J\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\b2\u0006\u0010\u0017\u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/example/blackmoon/ui/home/HomeWiewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "appDatabase", "Lcom/example/blackmoon/database/AppDatabase;", "getAppDatabase", "()Lcom/example/blackmoon/database/AppDatabase;", "category", "Landroidx/lifecycle/MutableLiveData;", "", "getCategory", "()Landroidx/lifecycle/MutableLiveData;", "setCategory", "(Landroidx/lifecycle/MutableLiveData;)V", "termsList", "", "Lcom/example/blackmoon/database/Term;", "getTermsList", "setTermsList", "getTermsByCategory", "symbol", "", "getTermsBySearch", "word", "app_debug"})
public final class HomeWiewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.blackmoon.database.Term>> termsList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> category;
    @org.jetbrains.annotations.NotNull()
    private final com.example.blackmoon.database.AppDatabase appDatabase = null;
    
    public HomeWiewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.blackmoon.database.Term>> getTermsList() {
        return null;
    }
    
    public final void setTermsList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.blackmoon.database.Term>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blackmoon.database.AppDatabase getAppDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.blackmoon.database.Term>> getTermsByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String symbol) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.blackmoon.database.Term>> getTermsBySearch(@org.jetbrains.annotations.NotNull()
    java.lang.String word) {
        return null;
    }
}