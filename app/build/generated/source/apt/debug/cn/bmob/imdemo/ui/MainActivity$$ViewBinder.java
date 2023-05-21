// Generated code from Butter Knife. Do not modify!
package cn.bmob.imdemo.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends cn.bmob.imdemo.ui.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624089, "field 'btn_conversation'");
    target.btn_conversation = finder.castView(view, 2131624089, "field 'btn_conversation'");
    view = finder.findRequiredView(source, 2131624093, "field 'btn_set'");
    target.btn_set = finder.castView(view, 2131624093, "field 'btn_set'");
    view = finder.findRequiredView(source, 2131624091, "field 'btn_contact'");
    target.btn_contact = finder.castView(view, 2131624091, "field 'btn_contact'");
    view = finder.findRequiredView(source, 2131624090, "field 'iv_conversation_tips'");
    target.iv_conversation_tips = finder.castView(view, 2131624090, "field 'iv_conversation_tips'");
    view = finder.findRequiredView(source, 2131624092, "field 'iv_contact_tips'");
    target.iv_contact_tips = finder.castView(view, 2131624092, "field 'iv_contact_tips'");
  }

  @Override public void unbind(T target) {
    target.btn_conversation = null;
    target.btn_set = null;
    target.btn_contact = null;
    target.iv_conversation_tips = null;
    target.iv_contact_tips = null;
  }
}
