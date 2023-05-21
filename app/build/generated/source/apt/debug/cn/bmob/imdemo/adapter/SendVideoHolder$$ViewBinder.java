// Generated code from Butter Knife. Do not modify!
package cn.bmob.imdemo.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SendVideoHolder$$ViewBinder<T extends cn.bmob.imdemo.adapter.SendVideoHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624243, "field 'iv_avatar'");
    target.iv_avatar = finder.castView(view, 2131624243, "field 'iv_avatar'");
    view = finder.findRequiredView(source, 2131624250, "field 'iv_fail_resend'");
    target.iv_fail_resend = finder.castView(view, 2131624250, "field 'iv_fail_resend'");
    view = finder.findRequiredView(source, 2131624239, "field 'tv_time'");
    target.tv_time = finder.castView(view, 2131624239, "field 'tv_time'");
    view = finder.findRequiredView(source, 2131624240, "field 'tv_message'");
    target.tv_message = finder.castView(view, 2131624240, "field 'tv_message'");
    view = finder.findRequiredView(source, 2131624251, "field 'tv_send_status'");
    target.tv_send_status = finder.castView(view, 2131624251, "field 'tv_send_status'");
    view = finder.findRequiredView(source, 2131624245, "field 'progress_load'");
    target.progress_load = finder.castView(view, 2131624245, "field 'progress_load'");
  }

  @Override public void unbind(T target) {
    target.iv_avatar = null;
    target.iv_fail_resend = null;
    target.tv_time = null;
    target.tv_message = null;
    target.tv_send_status = null;
    target.progress_load = null;
  }
}
