// Generated code from Butter Knife. Do not modify!
package cn.bmob.imdemo.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class NewFriendActivity$$ViewBinder<T extends cn.bmob.imdemo.ui.NewFriendActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492983, "field 'll_root'");
    target.ll_root = finder.castView(view, 2131492983, "field 'll_root'");
    view = finder.findRequiredView(source, 2131492946, "field 'rc_view'");
    target.rc_view = finder.castView(view, 2131492946, "field 'rc_view'");
    view = finder.findRequiredView(source, 2131492945, "field 'sw_refresh'");
    target.sw_refresh = finder.castView(view, 2131492945, "field 'sw_refresh'");
  }

  @Override public void unbind(T target) {
    target.ll_root = null;
    target.rc_view = null;
    target.sw_refresh = null;
  }
}
