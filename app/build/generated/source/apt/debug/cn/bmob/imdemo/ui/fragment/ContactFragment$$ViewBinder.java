// Generated code from Butter Knife. Do not modify!
package cn.bmob.imdemo.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ContactFragment$$ViewBinder<T extends cn.bmob.imdemo.ui.fragment.ContactFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624072, "field 'rc_view'");
    target.rc_view = finder.castView(view, 2131624072, "field 'rc_view'");
    view = finder.findRequiredView(source, 2131624071, "field 'sw_refresh'");
    target.sw_refresh = finder.castView(view, 2131624071, "field 'sw_refresh'");
  }

  @Override public void unbind(T target) {
    target.rc_view = null;
    target.sw_refresh = null;
  }
}