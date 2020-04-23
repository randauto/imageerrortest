package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.model;

import java.util.ArrayList;
import java.util.List;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, mo10386c = {"Ljudi/com/kottlinbase/model/BokehMarketWrapper;", "", "bokeh", "", "Ljudi/com/kottlinbase/model/BokehMarket;", "(Ljava/util/List;)V", "getBokeh", "()Ljava/util/List;", "setBokeh", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"})
/* compiled from: BokehMarketWrapper.kt */
public final class BokehMarketWrapper {
    private List<BokehMarket> bokeh;

    public BokehMarketWrapper() {
        this(null, 1, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<judi.com.kottlinbase.model.BokehMarket>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ judi.com.kottlinbase.model.BokehMarketWrapper copy$default(judi.com.kottlinbase.model.BokehMarketWrapper r0, List<judi.com.kottlinbase.model.BokehMarket> r1, int r2, Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            java.util.List<judi.com.kottlinbase.model.BokehMarket> r1 = r0.bokeh
        L_0x0006:
            judi.com.kottlinbase.model.BokehMarketWrapper r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: judi.com.kottlinbase.model.BokehMarketWrapper.copy$default(judi.com.kottlinbase.model.BokehMarketWrapper, java.util.List, int, java.lang.Object):judi.com.kottlinbase.model.BokehMarketWrapper");
    }

    public final List<BokehMarket> component1() {
        return this.bokeh;
    }

    public final BokehMarketWrapper copy(List<BokehMarket> list) {
        C1489j.m6972b(list, "bokeh");
        return new BokehMarketWrapper(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p073b.p079e.p081b.C1489j.m6971a((java.lang.Object) r1.bokeh, (java.lang.Object) ((judi.com.kottlinbase.model.BokehMarketWrapper) r2).bokeh) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof judi.com.kottlinbase.model.BokehMarketWrapper
            if (r0 == 0) goto L_0x0013
            judi.com.kottlinbase.model.BokehMarketWrapper r2 = (judi.com.kottlinbase.model.BokehMarketWrapper) r2
            java.util.List<judi.com.kottlinbase.model.BokehMarket> r0 = r1.bokeh
            java.util.List<judi.com.kottlinbase.model.BokehMarket> r2 = r2.bokeh
            boolean r2 = p073b.p079e.p081b.C1489j.m6971a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: judi.com.kottlinbase.model.BokehMarketWrapper.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List<BokehMarket> list = this.bokeh;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BokehMarketWrapper(bokeh=");
        sb.append(this.bokeh);
        sb.append(")");
        return sb.toString();
    }

    public BokehMarketWrapper(List<BokehMarket> list) {
        C1489j.m6972b(list, "bokeh");
        this.bokeh = list;
    }

    public /* synthetic */ BokehMarketWrapper(List list, int i, C1486g gVar) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        this(list);
    }

    public final List<BokehMarket> getBokeh() {
        return this.bokeh;
    }

    public final void setBokeh(List<BokehMarket> list) {
        C1489j.m6972b(list, "<set-?>");
        this.bokeh = list;
    }
}
