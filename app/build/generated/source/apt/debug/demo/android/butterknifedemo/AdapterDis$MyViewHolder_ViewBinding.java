// Generated code from Butter Knife. Do not modify!
package demo.android.butterknifedemo;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AdapterDis$MyViewHolder_ViewBinding implements Unbinder {
  private AdapterDis.MyViewHolder target;

  @UiThread
  public AdapterDis$MyViewHolder_ViewBinding(AdapterDis.MyViewHolder target, View source) {
    this.target = target;

    target.tv_dis = Utils.findRequiredViewAsType(source, R.id.tv_dis, "field 'tv_dis'", TextView.class);
    target.iv_dis = Utils.findRequiredViewAsType(source, R.id.iv_dis, "field 'iv_dis'", ImageView.class);

    Context context = source.getContext();
    target.iv_img = ContextCompat.getDrawable(context, R.drawable.iv_img);
  }

  @Override
  @CallSuper
  public void unbind() {
    AdapterDis.MyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tv_dis = null;
    target.iv_dis = null;
  }
}
