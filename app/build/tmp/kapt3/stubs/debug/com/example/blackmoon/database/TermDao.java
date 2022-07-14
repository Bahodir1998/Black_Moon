package com.example.blackmoon.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u0006H\'J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\f"}, d2 = {"Lcom/example/blackmoon/database/TermDao;", "", "getTermsBySearch", "", "Lcom/example/blackmoon/database/Term;", "search", "", "getTermsBySymbol", "symbol", "insert", "", "data", "app_debug"})
public abstract interface TermDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.blackmoon.database.Term> data);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from term_entity where name like :symbol || \'%\'")
    public abstract java.util.List<com.example.blackmoon.database.Term> getTermsBySymbol(@org.jetbrains.annotations.NotNull()
    java.lang.String symbol);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from term_entity where name like \'%\' || :search || \'%\'")
    public abstract java.util.List<com.example.blackmoon.database.Term> getTermsBySearch(@org.jetbrains.annotations.NotNull()
    java.lang.String search);
}