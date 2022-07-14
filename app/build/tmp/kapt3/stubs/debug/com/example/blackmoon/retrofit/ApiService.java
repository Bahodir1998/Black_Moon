package com.example.blackmoon.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/blackmoon/retrofit/ApiService;", "", "getAllTerms", "Lretrofit2/Call;", "", "Lcom/example/blackmoon/database/Term;", "word", "", "getTermsByCategoryId", "category_id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTermsBySearch", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search")
    public abstract retrofit2.Call<java.util.List<com.example.blackmoon.database.Term>> getAllTerms(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "word")
    java.lang.String word);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "page")
    public abstract java.lang.Object getTermsByCategoryId(@retrofit2.http.Query(value = "category_id")
    int category_id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.blackmoon.database.Term>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "search")
    public abstract java.lang.Object getTermsBySearch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "word")
    java.lang.String word, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.blackmoon.database.Term>> continuation);
}