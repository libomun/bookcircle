// Generated code from Butter Knife. Do not modify!
package cn.bmob.imdemo.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ConversationHolder$$ViewBinder<T extends cn.bmob.imdemo.adapter.ConversationHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624252, "field 'iv_recent_avatar'");
    target.iv_recent_avatar = finder.castView(view, 2131624252, "field 'iv_recent_avatar'");
    view = finder.findRequiredView(source, 2131624253, "field 'tv_recent_name'");
    target.tv_recent_name = finder.castView(view, 2131624253, "field 'tv_recent_name'");
    view = finder.findRequiredView(source, 2131624254, "field 'tv_recent_msg'");
    target.tv_recent_msg = finder.castView(view, 2131624254, "field 'tv_recent_msg'");
    view = finder.findRequiredView(source, 2131624255, "field 'tv_recent_time'");
    target.tv_recent_time = finder.castView(view, 2131624255, "field 'tv_recent_time'");
    view = finder.findRequiredView(source, 2131624256, "field 'tv_recent_unread'");
    target.tv_recent_unread = finder.castView(view, 2131624256, "field 'tv_recent_unread'");
  }

  @Override public void unbind(T target) {
    target.iv_recent_avatar = null;
    target.tv_recent_name = null;
    target.tv_recent_msg = null;
    target.tv_recent_time = null;
    target.tv_recent_unread = null;
  }
}
