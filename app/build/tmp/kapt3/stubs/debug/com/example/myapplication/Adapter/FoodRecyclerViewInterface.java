package com.example.myapplication.Adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/example/myapplication/Adapter/FoodRecyclerViewInterface;", "", "onItemClicked", "", "position", "", "app_debug"})
public abstract interface FoodRecyclerViewInterface {
    
    public abstract void onItemClicked(int position);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
        
        public static void onItemClicked(@org.jetbrains.annotations.NotNull()
        com.example.myapplication.Adapter.FoodRecyclerViewInterface $this, int position) {
        }
    }
}