// Generated code from Butter Knife. Do not modify!
package cn.bmob.imdemo.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class UserInfoActivity$$ViewBinder<T extends cn.bmob.imdemo.ui.UserInfoActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492970, "field 'iv_avator'");
    target.iv_avator = finder.castView(view, 2131492970, "field 'iv_avator'");
    view = finder.findRequiredView(source, 2131492972, "field 'tv_name'");
    target.tv_name = finder.castView(view, 2131492972, "field 'tv_name'");
    view = finder.findRequiredView(source, 2131492973, "field 'btn_add_friend' and method 'onViewClicked'");
    target.btn_add_friend = finder.castView(view, 2131492973, "field 'btn_add_friend'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131492974, "field 'btn_chat' and method 'onViewClicked'");
    target.btn_chat = finder.castView(view, 2131492974, "field 'btn_chat'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.iv_avator = null;
    target.tv_name = null;
    target.btn_add_friend = null;
    target.btn_chat = null;
  }
}
