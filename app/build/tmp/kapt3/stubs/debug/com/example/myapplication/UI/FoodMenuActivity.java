package com.example.myapplication.UI;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/myapplication/UI/FoodMenuActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/myapplication/Adapter/FoodRecyclerViewInterface;", "()V", "foodList", "Ljava/util/ArrayList;", "Lcom/example/myapplication/Adapter/FoodModel;", "getFoodList", "()Ljava/util/ArrayList;", "setFoodList", "(Ljava/util/ArrayList;)V", "foodListAdapter", "Lcom/example/myapplication/Adapter/FoodListAdapter;", "foodRecyclerViewPosition", "", "Ljava/lang/Integer;", "initializeView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClicked", "position", "Companion", "app_debug"})
public final class FoodMenuActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.myapplication.Adapter.FoodRecyclerViewInterface {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.myapplication.UI.FoodMenuActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "Test log";
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.myapplication.Adapter.FoodModel> foodList;
    private java.lang.Integer foodRecyclerViewPosition;
    private com.example.myapplication.Adapter.FoodListAdapter foodListAdapter;
    
    public FoodMenuActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myapplication.Adapter.FoodModel> getFoodList() {
        return null;
    }
    
    public final void setFoodList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myapplication.Adapter.FoodModel> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initializeView() {
    }
    
    @java.lang.Override()
    public void onItemClicked(int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/myapplication/UI/FoodMenuActivity$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}