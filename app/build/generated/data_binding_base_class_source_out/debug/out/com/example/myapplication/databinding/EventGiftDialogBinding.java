// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class EventGiftDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button giftCancel;

  @NonNull
  public final ImageView giftImage;

  @NonNull
  public final TextView giftInfo;

  @NonNull
  public final Button giftSave;

  private EventGiftDialogBinding(@NonNull LinearLayout rootView, @NonNull Button giftCancel,
      @NonNull ImageView giftImage, @NonNull TextView giftInfo, @NonNull Button giftSave) {
    this.rootView = rootView;
    this.giftCancel = giftCancel;
    this.giftImage = giftImage;
    this.giftInfo = giftInfo;
    this.giftSave = giftSave;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EventGiftDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EventGiftDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.event_gift_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EventGiftDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.gift_cancel;
      Button giftCancel = ViewBindings.findChildViewById(rootView, id);
      if (giftCancel == null) {
        break missingId;
      }

      id = R.id.gift_image;
      ImageView giftImage = ViewBindings.findChildViewById(rootView, id);
      if (giftImage == null) {
        break missingId;
      }

      id = R.id.gift_info;
      TextView giftInfo = ViewBindings.findChildViewById(rootView, id);
      if (giftInfo == null) {
        break missingId;
      }

      id = R.id.gift_save;
      Button giftSave = ViewBindings.findChildViewById(rootView, id);
      if (giftSave == null) {
        break missingId;
      }

      return new EventGiftDialogBinding((LinearLayout) rootView, giftCancel, giftImage, giftInfo,
          giftSave);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
