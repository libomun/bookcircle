// Generated code from Butter Knife. Do not modify!
package cn.bmob.imdemo.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ReceiveVideoHolder$$ViewBinder<T extends cn.bmob.imdemo.adapter.ReceiveVideoHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131493022, "field 'iv_avatar' and method 'onAvatarClick'");
    target.iv_avatar = finder.castView(view, 2131493022, "field 'iv_avatar'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onAvatarClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131493020, "field 'tv_time'");
    target.tv_time = finder.castView(view, 2131493020, "field 'tv_time'");
    view = finder.findRequiredView(source, 2131493021, "field 'tv_message'");
    target.tv_message = finder.castView(view, 2131493021, "field 'tv_message'");
  }

  @Override public void unbind(T target) {
    target.iv_avatar = null;
    target.tv_time = null;
    target.tv_message = null;
  }
}
