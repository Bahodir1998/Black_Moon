package com.example.blackmoon.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020.H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006/"}, d2 = {"Lcom/example/blackmoon/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/blackmoon/databinding/FragmentHomeBinding;", "getBinding", "()Lcom/example/blackmoon/databinding/FragmentHomeBinding;", "setBinding", "(Lcom/example/blackmoon/databinding/FragmentHomeBinding;)V", "category", "", "getCategory", "()I", "setCategory", "(I)V", "homeWiewModel", "Lcom/example/blackmoon/ui/home/HomeWiewModel;", "getHomeWiewModel", "()Lcom/example/blackmoon/ui/home/HomeWiewModel;", "setHomeWiewModel", "(Lcom/example/blackmoon/ui/home/HomeWiewModel;)V", "horizontalAdapter", "Lcom/example/blackmoon/adapters/HorizontalAdapter;", "getHorizontalAdapter", "()Lcom/example/blackmoon/adapters/HorizontalAdapter;", "setHorizontalAdapter", "(Lcom/example/blackmoon/adapters/HorizontalAdapter;)V", "jsonSymbols", "", "getJsonSymbols", "()Ljava/lang/String;", "verticalAdapter", "Lcom/example/blackmoon/adapters/VerticalAdapter;", "getVerticalAdapter", "()Lcom/example/blackmoon/adapters/VerticalAdapter;", "setVerticalAdapter", "(Lcom/example/blackmoon/adapters/VerticalAdapter;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    public com.example.blackmoon.databinding.FragmentHomeBinding binding;
    public com.example.blackmoon.adapters.HorizontalAdapter horizontalAdapter;
    public com.example.blackmoon.adapters.VerticalAdapter verticalAdapter;
    public com.example.blackmoon.ui.home.HomeWiewModel homeWiewModel;
    private int category = 9;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String jsonSymbols = "[{\"id\":9,\"name\":\"\u0410\"},{\"id\":10,\"name\":\"\u0411\"},{\"id\":11,\"name\":\"\u0412\"},{\"id\":12,\"name\":\"\u0413\"},{\"id\":13,\"name\":\"\u0414\"},{\"id\":14,\"name\":\"\u0415\"},{\"id\":15,\"name\":\"\u0401\"},{\"id\":16,\"name\":\"\u0416\"},{\"id\":17,\"name\":\"\u0417\"},{\"id\":18,\"name\":\"\u0418\"},{\"id\":19,\"name\":\"\u0419\"},{\"id\":20,\"name\":\"\u041a\"},{\"id\":21,\"name\":\"\u041b\"},{\"id\":22,\"name\":\"\u041c\"},{\"id\":23,\"name\":\"\u041d\"},{\"id\":24,\"name\":\"\u041e\"},{\"id\":25,\"name\":\"\u041f\"},{\"id\":26,\"name\":\"\u0420\"},{\"id\":27,\"name\":\"\u0421\"},{\"id\":28,\"name\":\"\u0422\"},{\"id\":29,\"name\":\"\u0423\"},{\"id\":30,\"name\":\"\u0424\"},{\"id\":31,\"name\":\"\u0425\"},{\"id\":32,\"name\":\"\u0426\"},{\"id\":33,\"name\":\"\u0427\"},{\"id\":34,\"name\":\"\u0428\"},{\"id\":35,\"name\":\"\u042d\"},{\"id\":36,\"name\":\"\u042e\"},{\"id\":37,\"name\":\"\u042f\"},{\"id\":38,\"name\":\"\u040e\"},{\"id\":39,\"name\":\"\u049a\"},{\"id\":40,\"name\":\"\u0492\"},{\"id\":41,\"name\":\"\u04b2\"}]";
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blackmoon.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.blackmoon.databinding.FragmentHomeBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blackmoon.adapters.HorizontalAdapter getHorizontalAdapter() {
        return null;
    }
    
    public final void setHorizontalAdapter(@org.jetbrains.annotations.NotNull()
    com.example.blackmoon.adapters.HorizontalAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blackmoon.adapters.VerticalAdapter getVerticalAdapter() {
        return null;
    }
    
    public final void setVerticalAdapter(@org.jetbrains.annotations.NotNull()
    com.example.blackmoon.adapters.VerticalAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blackmoon.ui.home.HomeWiewModel getHomeWiewModel() {
        return null;
    }
    
    public final void setHomeWiewModel(@org.jetbrains.annotations.NotNull()
    com.example.blackmoon.ui.home.HomeWiewModel p0) {
    }
    
    public final int getCategory() {
        return 0;
    }
    
    public final void setCategory(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJsonSymbols() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}