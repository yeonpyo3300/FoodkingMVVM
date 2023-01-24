package com.example.myapplication.Adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016\u00a8\u0006\u0005"}, d2 = {"Lcom/example/myapplication/Adapter/EventGiftDialogInterface;", "", "onCancelButtonClicked", "", "onSaveButtonClicked", "app_debug"})
public abstract interface EventGiftDialogInterface {
    
    public abstract void onSaveButtonClicked();
    
    public abstract void onCancelButtonClicked();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
        
        public static void onSaveButtonClicked(@org.jetbrains.annotations.NotNull()
        com.example.myapplication.Adapter.EventGiftDialogInterface $this) {
        }
        
        public static void onCancelButtonClicked(@org.jetbrains.annotations.NotNull()
        com.example.myapplication.Adapter.EventGiftDialogInterface $this) {
        }
    }
}