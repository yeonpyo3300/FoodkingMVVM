// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnOnboardingLogin;

  @NonNull
  public final TextView homeOnboardingText;

  @NonNull
  public final ImageView icon;

  @NonNull
  public final EditText onboardingEmailForm;

  @NonNull
  public final EditText onboardingPasswordForm;

  @NonNull
  public final TextView onboardingSmallText;

  private ActivityMainBinding(@NonNull RelativeLayout rootView, @NonNull Button btnOnboardingLogin,
      @NonNull TextView homeOnboardingText, @NonNull ImageView icon,
      @NonNull EditText onboardingEmailForm, @NonNull EditText onboardingPasswordForm,
      @NonNull TextView onboardingSmallText) {
    this.rootView = rootView;
    this.btnOnboardingLogin = btnOnboardingLogin;
    this.homeOnboardingText = homeOnboardingText;
    this.icon = icon;
    this.onboardingEmailForm = onboardingEmailForm;
    this.onboardingPasswordForm = onboardingPasswordForm;
    this.onboardingSmallText = onboardingSmallText;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_onboarding_login;
      Button btnOnboardingLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnOnboardingLogin == null) {
        break missingId;
      }

      id = R.id.home_onboarding_text;
      TextView homeOnboardingText = ViewBindings.findChildViewById(rootView, id);
      if (homeOnboardingText == null) {
        break missingId;
      }

      id = R.id.icon;
      ImageView icon = ViewBindings.findChildViewById(rootView, id);
      if (icon == null) {
        break missingId;
      }

      id = R.id.onboarding_Email_Form;
      EditText onboardingEmailForm = ViewBindings.findChildViewById(rootView, id);
      if (onboardingEmailForm == null) {
        break missingId;
      }

      id = R.id.onboarding_Password_Form;
      EditText onboardingPasswordForm = ViewBindings.findChildViewById(rootView, id);
      if (onboardingPasswordForm == null) {
        break missingId;
      }

      id = R.id.onboarding_small_text;
      TextView onboardingSmallText = ViewBindings.findChildViewById(rootView, id);
      if (onboardingSmallText == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, btnOnboardingLogin,
          homeOnboardingText, icon, onboardingEmailForm, onboardingPasswordForm,
          onboardingSmallText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
