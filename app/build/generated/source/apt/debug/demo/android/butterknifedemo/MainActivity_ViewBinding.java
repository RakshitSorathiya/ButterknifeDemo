// Generated code from Butter Knife. Do not modify!
package demo.android.butterknifedemo;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131427417;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.tv_enter = Utils.findRequiredViewAsType(source, R.id.tv_enter, "field 'tv_enter'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btn_enter, "field 'btn_enter' and method 'setBtn_enter'");
    target.btn_enter = Utils.castView(view, R.id.btn_enter, "field 'btn_enter'", Button.class);
    view2131427417 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setBtn_enter(p0);
      }
    });
    target.rv_dis = Utils.findRequiredViewAsType(source, R.id.rv_display, "field 'rv_dis'", RecyclerView.class);

    Context context = source.getContext();
    Resources res = context.getResources();
    target.items = res.getString(R.string.item1);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tv_enter = null;
    target.btn_enter = null;
    target.rv_dis = null;

    view2131427417.setOnClickListener(null);
    view2131427417 = null;
  }
}
