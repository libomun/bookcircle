// Generated code from Butter Knife. Do not modify!
package cn.bmob.imdemo.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ReceiveImageHolder$$ViewBinder<T extends cn.bmob.imdemo.adapter.ReceiveImageHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131493022, "field 'iv_avatar'");
    target.iv_avatar = finder.castView(view, 2131493022, "field 'iv_avatar'");
    view = finder.findRequiredView(source, 2131493020, "field 'tv_time'");
    target.tv_time = finder.castView(view, 2131493020, "field 'tv_time'");
    view = finder.findRequiredView(source, 2131493023, "field 'iv_picture'");
    target.iv_picture = finder.castView(view, 2131493023, "field 'iv_picture'");
    view = finder.findRequiredView(source, 2131493024, "field 'progress_load'");
    target.progress_load = finder.castView(view, 2131493024, "field 'progress_load'");
  }

  @Override public void unbind(T target) {
    target.iv_avatar = null;
    target.tv_time = null;
    target.iv_picture = null;
    target.progress_load = null;
  }
}
