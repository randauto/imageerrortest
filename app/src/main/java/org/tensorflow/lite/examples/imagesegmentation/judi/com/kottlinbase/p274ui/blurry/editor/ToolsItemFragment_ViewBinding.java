package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.blurry.editor;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p144a.C3235a;
import butterknife.p144a.C3237b;
import com.judi.emojiphoto.R;

/* renamed from: judi.com.kottlinbase.ui.blurry.editor.ToolsItemFragment_ViewBinding */
public final class ToolsItemFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    private ToolsItemFragment f26431b;

    /* renamed from: c */
    private View f26432c;

    /* renamed from: d */
    private View f26433d;

    /* renamed from: e */
    private View f26434e;

    /* renamed from: f */
    private View f26435f;

    /* renamed from: g */
    private View f26436g;

    public ToolsItemFragment_ViewBinding(final ToolsItemFragment toolsItemFragment, View view) {
        this.f26431b = toolsItemFragment;
        View a = C3237b.m14849a(view, R.id.containerFocus, "method 'onManualFocusClick'");
        this.f26432c = a;
        a.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                toolsItemFragment.onManualFocusClick();
            }
        });
        View a2 = C3237b.m14849a(view, R.id.containerCreater, "method 'onCreaterClick'");
        this.f26433d = a2;
        a2.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                toolsItemFragment.onCreaterClick();
            }
        });
        View a3 = C3237b.m14849a(view, R.id.containerLevel, "method 'onLevelClick'");
        this.f26434e = a3;
        a3.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                toolsItemFragment.onLevelClick();
            }
        });
        View a4 = C3237b.m14849a(view, R.id.containerBokeh, "method 'onBokehClick'");
        this.f26435f = a4;
        a4.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                toolsItemFragment.onBokehClick();
            }
        });
        View a5 = C3237b.m14849a(view, R.id.containerAlpha, "method 'onAlphaClick'");
        this.f26436g = a5;
        a5.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                toolsItemFragment.onAlphaClick();
            }
        });
    }
}
