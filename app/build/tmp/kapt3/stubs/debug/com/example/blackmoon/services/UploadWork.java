package com.example.blackmoon.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001d"}, d2 = {"Lcom/example/blackmoon/services/UploadWork;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "workerParameters", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "appDatabase", "Lcom/example/blackmoon/database/AppDatabase;", "getAppDatabase", "()Lcom/example/blackmoon/database/AppDatabase;", "setAppDatabase", "(Lcom/example/blackmoon/database/AppDatabase;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "list", "Ljava/util/ArrayList;", "Lcom/example/blackmoon/database/Term;", "Lkotlin/collections/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "uploadTerms", "", "app_debug"})
public final class UploadWork extends androidx.work.Worker {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    public java.util.ArrayList<com.example.blackmoon.database.Term> list;
    public com.example.blackmoon.database.AppDatabase appDatabase;
    
    public UploadWork(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters workerParameters) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.blackmoon.database.Term> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.blackmoon.database.Term> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blackmoon.database.AppDatabase getAppDatabase() {
        return null;
    }
    
    public final void setAppDatabase(@org.jetbrains.annotations.NotNull()
    com.example.blackmoon.database.AppDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.work.ListenableWorker.Result doWork() {
        return null;
    }
    
    private final void uploadTerms() {
    }
}