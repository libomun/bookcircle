// Generated code from Butter Knife. Do not modify!
package cn.bmob.imdemo.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ReceiveVoiceHolder$$ViewBinder<T extends cn.bmob.imdemo.adapter.ReceiveVoiceHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624243, "field 'iv_avatar'");
    target.iv_avatar = finder.castView(view, 2131624243, "field 'iv_avatar'");
    view = finder.findRequiredView(source, 2131624239, "field 'tv_time'");
    target.tv_time = finder.castView(view, 2131624239, "field 'tv_time'");
    view = finder.findRequiredView(source, 2131624249, "field 'tv_voice_length'");
    target.tv_voice_length = finder.castView(view, 2131624249, "field 'tv_voice_length'");
    view = finder.findRequiredView(source, 2131624248, "field 'iv_voice'");
    target.iv_voice = finder.castView(view, 2131624248, "field 'iv_voice'");
    view = finder.findRequiredView(source, 2131624245, "field 'progress_load'");
    target.progress_load = finder.castView(view, 2131624245, "field 'progress_load'");
  }

  @Override public void unbind(T target) {
    target.iv_avatar = null;
    target.tv_time = null;
    target.tv_voice_length = null;
    target.iv_voice = null;
    target.progress_load = null;
  }
}