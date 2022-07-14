package com.example.blackmoon.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001b\u001cB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/example/blackmoon/adapters/HorizontalAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/blackmoon/adapters/HorizontalAdapter$Vh;", "list", "", "Lcom/example/blackmoon/models/Symbol;", "onItemClickListener", "Lcom/example/blackmoon/adapters/HorizontalAdapter$OnItemClickListener;", "(Ljava/util/List;Lcom/example/blackmoon/adapters/HorizontalAdapter$OnItemClickListener;)V", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getOnItemClickListener", "()Lcom/example/blackmoon/adapters/HorizontalAdapter$OnItemClickListener;", "setOnItemClickListener", "(Lcom/example/blackmoon/adapters/HorizontalAdapter$OnItemClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClickListener", "Vh", "app_debug"})
public final class HorizontalAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.blackmoon.adapters.HorizontalAdapter.Vh> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.blackmoon.models.Symbol> list;
    @org.jetbrains.annotations.NotNull()
    private com.example.blackmoon.adapters.HorizontalAdapter.OnItemClickListener onItemClickListener;
    
    public HorizontalAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.blackmoon.models.Symbol> list, @org.jetbrains.annotations.NotNull()
    com.example.blackmoon.adapters.HorizontalAdapter.OnItemClickListener onItemClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.blackmoon.models.Symbol> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.blackmoon.models.Symbol> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blackmoon.adapters.HorizontalAdapter.OnItemClickListener getOnItemClickListener() {
        return null;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.example.blackmoon.adapters.HorizontalAdapter.OnItemClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.blackmoon.adapters.HorizontalAdapter.Vh onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.blackmoon.adapters.HorizontalAdapter.Vh holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/example/blackmoon/adapters/HorizontalAdapter$Vh;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "hrItemBinding", "Lcom/example/blackmoon/databinding/HrItemBinding;", "(Lcom/example/blackmoon/adapters/HorizontalAdapter;Lcom/example/blackmoon/databinding/HrItemBinding;)V", "getHrItemBinding", "()Lcom/example/blackmoon/databinding/HrItemBinding;", "setHrItemBinding", "(Lcom/example/blackmoon/databinding/HrItemBinding;)V", "onBind", "", "symbol", "Lcom/example/blackmoon/models/Symbol;", "app_debug"})
    public final class Vh extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.example.blackmoon.databinding.HrItemBinding hrItemBinding;
        
        public Vh(@org.jetbrains.annotations.NotNull()
        com.example.blackmoon.databinding.HrItemBinding hrItemBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.blackmoon.databinding.HrItemBinding getHrItemBinding() {
            return null;
        }
        
        public final void setHrItemBinding(@org.jetbrains.annotations.NotNull()
        com.example.blackmoon.databinding.HrItemBinding p0) {
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull()
        com.example.blackmoon.models.Symbol symbol) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/blackmoon/adapters/HorizontalAdapter$OnItemClickListener;", "", "onItemClick", "", "symbol", "Lcom/example/blackmoon/models/Symbol;", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.example.blackmoon.models.Symbol symbol);
    }
}