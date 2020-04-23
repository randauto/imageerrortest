package org.tensorflow.lite.examples.imagesegmentation.judi.com.p269b;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: judi.com.b.c */
/* compiled from: ScaleGestureDetector */
public class C7167c {

    /* renamed from: a */
    private boolean f26231a;

    /* renamed from: b */
    private int f26232b;

    /* renamed from: c */
    private int f26233c;

    /* renamed from: d */
    private MotionEvent f26234d;

    /* renamed from: e */
    private float f26235e;

    /* renamed from: f */
    private float f26236f;

    /* renamed from: g */
    private float f26237g;

    /* renamed from: h */
    private float f26238h;

    /* renamed from: i */
    private C7171e f26239i = new C7171e();

    /* renamed from: j */
    private float f26240j;

    /* renamed from: k */
    private float f26241k;

    /* renamed from: l */
    private boolean f26242l;

    /* renamed from: m */
    private boolean f26243m;

    /* renamed from: n */
    private final C7168a f26244n;

    /* renamed from: o */
    private MotionEvent f26245o;

    /* renamed from: p */
    private float f26246p;

    /* renamed from: q */
    private float f26247q;

    /* renamed from: r */
    private float f26248r;

    /* renamed from: s */
    private float f26249s;

    /* renamed from: t */
    private float f26250t;

    /* renamed from: u */
    private long f26251u;

    /* renamed from: judi.com.b.c$a */
    /* compiled from: ScaleGestureDetector */
    public interface C7168a {
        /* renamed from: a */
        boolean mo23078a(View view, C7167c cVar);

        /* renamed from: b */
        boolean mo23079b(View view, C7167c cVar);

        /* renamed from: c */
        void mo23087c(View view, C7167c cVar);
    }

    /* renamed from: judi.com.b.c$b */
    /* compiled from: ScaleGestureDetector */
    public static class C7169b implements C7168a {
        /* renamed from: a */
        public boolean mo23078a(View view, C7167c cVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo23079b(View view, C7167c cVar) {
            return true;
        }

        /* renamed from: c */
        public void mo23087c(View view, C7167c cVar) {
        }
    }

    public C7167c(C7168a aVar) {
        this.f26244n = aVar;
    }

    /* renamed from: a */
    public boolean mo23081a(View view, MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m38312g();
        }
        boolean z = false;
        if (this.f26243m) {
            return false;
        }
        if (this.f26242l) {
            switch (actionMasked) {
                case 1:
                    m38312g();
                    return true;
                case 2:
                    m38311b(view, motionEvent);
                    if (this.f26238h / this.f26249s <= 0.67f || !this.f26244n.mo23078a(view, this)) {
                        return true;
                    }
                    this.f26245o.recycle();
                    this.f26245o = MotionEvent.obtain(motionEvent);
                    return true;
                case 3:
                    this.f26244n.mo23087c(view, this);
                    m38312g();
                    return true;
                case 5:
                    this.f26244n.mo23087c(view, this);
                    int i2 = this.f26232b;
                    int i3 = this.f26233c;
                    m38312g();
                    this.f26245o = MotionEvent.obtain(motionEvent);
                    if (!this.f26231a) {
                        i2 = i3;
                    }
                    this.f26232b = i2;
                    this.f26233c = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f26231a = false;
                    if (motionEvent.findPointerIndex(this.f26232b) < 0 || this.f26232b == this.f26233c) {
                        this.f26232b = motionEvent.getPointerId(m38310a(motionEvent, this.f26233c, -1));
                    }
                    m38311b(view, motionEvent);
                    this.f26242l = this.f26244n.mo23079b(view, this);
                    return true;
                case 6:
                    int pointerCount = motionEvent.getPointerCount();
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    if (pointerCount > 2) {
                        if (pointerId == this.f26232b) {
                            int a = m38310a(motionEvent, this.f26233c, actionIndex);
                            if (a >= 0) {
                                this.f26244n.mo23087c(view, this);
                                this.f26232b = motionEvent.getPointerId(a);
                                this.f26231a = true;
                                this.f26245o = MotionEvent.obtain(motionEvent);
                                m38311b(view, motionEvent);
                                this.f26242l = this.f26244n.mo23079b(view, this);
                                this.f26245o.recycle();
                                this.f26245o = MotionEvent.obtain(motionEvent);
                                m38311b(view, motionEvent);
                            }
                        } else {
                            if (pointerId == this.f26233c) {
                                int a2 = m38310a(motionEvent, this.f26232b, actionIndex);
                                if (a2 >= 0) {
                                    this.f26244n.mo23087c(view, this);
                                    this.f26233c = motionEvent.getPointerId(a2);
                                    this.f26231a = false;
                                    this.f26245o = MotionEvent.obtain(motionEvent);
                                    m38311b(view, motionEvent);
                                    this.f26242l = this.f26244n.mo23079b(view, this);
                                }
                            }
                            this.f26245o.recycle();
                            this.f26245o = MotionEvent.obtain(motionEvent);
                            m38311b(view, motionEvent);
                        }
                        z = true;
                        this.f26245o.recycle();
                        this.f26245o = MotionEvent.obtain(motionEvent);
                        m38311b(view, motionEvent);
                    } else {
                        z = true;
                    }
                    if (!z) {
                        return true;
                    }
                    m38311b(view, motionEvent);
                    if (pointerId == this.f26232b) {
                        i = this.f26233c;
                    } else {
                        i = this.f26232b;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    this.f26240j = motionEvent.getX(findPointerIndex);
                    this.f26241k = motionEvent.getY(findPointerIndex);
                    this.f26244n.mo23087c(view, this);
                    m38312g();
                    this.f26232b = i;
                    this.f26231a = true;
                    return true;
                default:
                    return true;
            }
        } else if (actionMasked != 5) {
            switch (actionMasked) {
                case 0:
                    this.f26232b = motionEvent.getPointerId(0);
                    this.f26231a = true;
                    return true;
                case 1:
                    m38312g();
                    return true;
                default:
                    return true;
            }
        } else {
            if (this.f26245o != null) {
                this.f26245o.recycle();
            }
            this.f26245o = MotionEvent.obtain(motionEvent);
            this.f26251u = 0;
            int actionIndex2 = motionEvent.getActionIndex();
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f26232b);
            this.f26233c = motionEvent.getPointerId(actionIndex2);
            if (findPointerIndex2 < 0 || findPointerIndex2 == actionIndex2) {
                this.f26232b = motionEvent.getPointerId(m38310a(motionEvent, this.f26233c, -1));
            }
            this.f26231a = false;
            m38311b(view, motionEvent);
            this.f26242l = this.f26244n.mo23079b(view, this);
            return true;
        }
    }

    /* renamed from: a */
    private int m38310a(MotionEvent motionEvent, int i, int i2) {
        int pointerCount = motionEvent.getPointerCount();
        int findPointerIndex = motionEvent.findPointerIndex(i);
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (i3 != i2 && i3 != findPointerIndex) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private void m38311b(View view, MotionEvent motionEvent) {
        if (this.f26234d != null) {
            this.f26234d.recycle();
        }
        this.f26234d = MotionEvent.obtain(motionEvent);
        this.f26237g = -1.0f;
        this.f26248r = -1.0f;
        this.f26250t = -1.0f;
        this.f26239i.set(0.0f, 0.0f);
        MotionEvent motionEvent2 = this.f26245o;
        int findPointerIndex = motionEvent2.findPointerIndex(this.f26232b);
        int findPointerIndex2 = motionEvent2.findPointerIndex(this.f26233c);
        int findPointerIndex3 = motionEvent.findPointerIndex(this.f26232b);
        int findPointerIndex4 = motionEvent.findPointerIndex(this.f26233c);
        if (findPointerIndex < 0 || findPointerIndex2 < 0 || findPointerIndex3 < 0 || findPointerIndex4 < 0) {
            this.f26243m = true;
            Log.e("ScaleGestureDetector", "Invalid MotionEvent stream detected.", new Throwable());
            if (this.f26242l) {
                this.f26244n.mo23087c(view, this);
                return;
            }
            return;
        }
        float x = motionEvent2.getX(findPointerIndex);
        float y = motionEvent2.getY(findPointerIndex);
        float x2 = motionEvent2.getX(findPointerIndex2);
        float y2 = motionEvent2.getY(findPointerIndex2);
        float x3 = motionEvent.getX(findPointerIndex3);
        float y3 = motionEvent.getY(findPointerIndex3);
        float f = x2 - x;
        float f2 = y2 - y;
        float x4 = motionEvent.getX(findPointerIndex4) - x3;
        float y4 = motionEvent.getY(findPointerIndex4) - y3;
        this.f26239i.set(x4, y4);
        this.f26246p = f;
        this.f26247q = f2;
        this.f26235e = x4;
        this.f26236f = y4;
        this.f26240j = (x4 * 0.5f) + x3;
        this.f26241k = (y4 * 0.5f) + y3;
        this.f26251u = motionEvent.getEventTime() - motionEvent2.getEventTime();
        this.f26238h = motionEvent.getPressure(findPointerIndex3) + motionEvent.getPressure(findPointerIndex4);
        this.f26249s = motionEvent2.getPressure(findPointerIndex) + motionEvent2.getPressure(findPointerIndex2);
    }

    /* renamed from: g */
    private void m38312g() {
        if (this.f26245o != null) {
            this.f26245o.recycle();
            this.f26245o = null;
        }
        if (this.f26234d != null) {
            this.f26234d.recycle();
            this.f26234d = null;
        }
        this.f26242l = false;
        this.f26232b = -1;
        this.f26233c = -1;
        this.f26243m = false;
    }

    /* renamed from: a */
    public float mo23080a() {
        return this.f26240j;
    }

    /* renamed from: b */
    public float mo23082b() {
        return this.f26241k;
    }

    /* renamed from: c */
    public float mo23083c() {
        if (this.f26237g == -1.0f) {
            float f = this.f26235e;
            float f2 = this.f26236f;
            this.f26237g = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
        }
        return this.f26237g;
    }

    /* renamed from: d */
    public C7171e mo23084d() {
        return this.f26239i;
    }

    /* renamed from: e */
    public float mo23085e() {
        if (this.f26248r == -1.0f) {
            float f = this.f26246p;
            float f2 = this.f26247q;
            this.f26248r = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
        }
        return this.f26248r;
    }

    /* renamed from: f */
    public float mo23086f() {
        if (this.f26250t == -1.0f) {
            this.f26250t = mo23083c() / mo23085e();
        }
        return this.f26250t;
    }
}
