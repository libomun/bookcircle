// Generated code from Butter Knife. Do not modify!
package cn.bmob.imdemo.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AgreeHolder$$ViewBinder<T extends cn.bmob.imdemo.adapter.AgreeHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624239, "field 'tv_time'");
    target.tv_time = finder.castView(view, 2131624239, "field 'tv_time'");
    view = finder.findRequiredView(source, 2131624240, "field 'tv_message'");
    target.tv_message = finder.castView(view, 2131624240, "field 'tv_message'");
  }

  @Override public void unbind(T target) {
    target.tv_time = null;
    target.tv_message = null;
  }
}
