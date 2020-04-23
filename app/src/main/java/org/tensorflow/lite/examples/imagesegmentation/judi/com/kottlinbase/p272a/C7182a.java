package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p272a;

import android.support.p064v7.widget.RecyclerView;
import android.support.p064v7.widget.RecyclerView.C1170k;
import android.support.p064v7.widget.RecyclerView.C1187x;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.judi.emojiphoto.R;

/* renamed from: judi.com.kottlinbase.a.a */
/* compiled from: ItemClickSupport */
public class C7182a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f26285a = "a";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final RecyclerView f26286b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C7186a f26287c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C7187b f26288d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int[] f26289e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public OnClickListener f26290f = new OnClickListener() {
        public void onClick(View view) {
            if (C7182a.this.f26287c != null) {
                C1187x d = C7182a.this.f26286b.mo4623d(view);
                if (d != null) {
                    C7182a.this.f26287c.mo23122a(C7182a.this.f26286b, d.mo5031e(), view);
                } else {
                    Log.d(C7182a.f26285a, "onClick: can not find view holder");
                }
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: g */
    public OnLongClickListener f26291g = new OnLongClickListener() {
        public boolean onLongClick(View view) {
            if (C7182a.this.f26288d == null) {
                return false;
            }
            return C7182a.this.f26288d.mo23123a(C7182a.this.f26286b, C7182a.this.f26286b.mo4600b(view).mo5031e(), view);
        }
    };

    /* renamed from: h */
    private C1170k f26292h = new C1170k() {
        /* renamed from: b */
        public void mo4922b(View view) {
        }

        /* renamed from: a */
        public void mo4921a(View view) {
            if (C7182a.this.f26287c != null) {
                if (C7182a.this.f26289e != null) {
                    for (int findViewById : C7182a.this.f26289e) {
                        View findViewById2 = view.findViewById(findViewById);
                        if (findViewById2 != null) {
                            findViewById2.setOnClickListener(C7182a.this.f26290f);
                        }
                    }
                }
                view.setOnClickListener(C7182a.this.f26290f);
            }
            if (C7182a.this.f26288d != null) {
                view.setOnLongClickListener(C7182a.this.f26291g);
            }
        }
    };

    /* renamed from: judi.com.kottlinbase.a.a$a */
    /* compiled from: ItemClickSupport */
    public interface C7186a {
        /* renamed from: a */
        void mo23122a(RecyclerView recyclerView, int i, View view);
    }

    /* renamed from: judi.com.kottlinbase.a.a$b */
    /* compiled from: ItemClickSupport */
    public interface C7187b {
        /* renamed from: a */
        boolean mo23123a(RecyclerView recyclerView, int i, View view);
    }

    private C7182a(RecyclerView recyclerView) {
        this.f26286b = recyclerView;
        this.f26286b.setTag(R.id.item_click_support, this);
        this.f26286b.mo4585a(this.f26292h);
    }

    /* renamed from: a */
    public static C7182a m38386a(RecyclerView recyclerView) {
        C7182a aVar = (C7182a) recyclerView.getTag(R.id.item_click_support);
        return aVar == null ? new C7182a(recyclerView) : aVar;
    }

    /* renamed from: a */
    public C7182a mo23118a(C7186a aVar) {
        return mo23119a(null, aVar);
    }

    /* renamed from: a */
    public C7182a mo23119a(int[] iArr, C7186a aVar) {
        this.f26287c = aVar;
        this.f26289e = iArr;
        return this;
    }
}
