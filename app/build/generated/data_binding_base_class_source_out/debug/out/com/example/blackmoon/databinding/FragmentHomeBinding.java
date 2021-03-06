// Generated by view binder compiler. Do not edit!
package com.example.blackmoon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.blackmoon.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final MotionLayout rootView;

  @NonNull
  public final TextView alifbo;

  @NonNull
  public final TextView harf;

  @NonNull
  public final RecyclerView hrRv;

  @NonNull
  public final RecyclerView vRv;

  private FragmentHomeBinding(@NonNull MotionLayout rootView, @NonNull TextView alifbo,
      @NonNull TextView harf, @NonNull RecyclerView hrRv, @NonNull RecyclerView vRv) {
    this.rootView = rootView;
    this.alifbo = alifbo;
    this.harf = harf;
    this.hrRv = hrRv;
    this.vRv = vRv;
  }

  @Override
  @NonNull
  public MotionLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.alifbo;
      TextView alifbo = ViewBindings.findChildViewById(rootView, id);
      if (alifbo == null) {
        break missingId;
      }

      id = R.id.harf;
      TextView harf = ViewBindings.findChildViewById(rootView, id);
      if (harf == null) {
        break missingId;
      }

      id = R.id.hr_rv;
      RecyclerView hrRv = ViewBindings.findChildViewById(rootView, id);
      if (hrRv == null) {
        break missingId;
      }

      id = R.id.v_rv;
      RecyclerView vRv = ViewBindings.findChildViewById(rootView, id);
      if (vRv == null) {
        break missingId;
      }

      return new FragmentHomeBinding((MotionLayout) rootView, alifbo, harf, hrRv, vRv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
