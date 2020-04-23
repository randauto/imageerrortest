package p073b.p143j;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.C3218m;
import p073b.C3221p;
import p073b.C3226t;
import p073b.p074a.C1406e;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p080a.C1461m;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p084g.C1512a;
import p073b.p084g.C1515c;
import p073b.p084g.C1517d;
import p073b.p142i.C3160h;
import p073b.p142i.C3161i;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a\u001c\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010\u000e\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001f\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\rH\u0002\u001a\u001f\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\rH\u0002\u001a\u0015\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\n\u001a\u001c\u0010\u0014\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010\u0014\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a:\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001aE\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0002\b\u001c\u001a:\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0012\u0010\u001e\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0006\u001a&\u0010 \u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a;\u0010 \u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0002\b\"\u001a&\u0010 \u001a\u00020\u0006*\u00020\u00022\u0006\u0010#\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u0010$\u001a\u00020\u0006*\u00020\u00022\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a,\u0010$\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\r\u0010'\u001a\u00020\r*\u00020\u0002H\b\u001a\r\u0010(\u001a\u00020\r*\u00020\u0002H\b\u001a\r\u0010)\u001a\u00020\r*\u00020\u0002H\b\u001a \u0010*\u001a\u00020\r*\u0004\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a \u0010+\u001a\u00020\r*\u0004\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u0010,\u001a\u00020-*\u00020\u0002H\u0002\u001a&\u0010.\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u0010.\u001a\u00020\u0006*\u00020\u00022\u0006\u0010#\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u0010/\u001a\u00020\u0006*\u00020\u00022\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a,\u0010/\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0010\u00100\u001a\b\u0012\u0004\u0012\u00020\n01*\u00020\u0002\u001a\u0010\u00102\u001a\b\u0012\u0004\u0012\u00020\n03*\u00020\u0002\u001a\u0015\u00104\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\f\u001a\u000f\u00105\u001a\u00020\n*\u0004\u0018\u00010\nH\b\u001a\u001c\u00106\u001a\u00020\u0002*\u00020\u00022\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0011\u001a\u001c\u00106\u001a\u00020\n*\u00020\n2\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0011\u001a\u001c\u00109\u001a\u00020\u0002*\u00020\u00022\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0011\u001a\u001c\u00109\u001a\u00020\n*\u00020\n2\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0011\u001aG\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000101*\u00020\u00022\u000e\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0<2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0006H\u0002¢\u0006\u0004\b>\u0010?\u001a=\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000101*\u00020\u00022\u0006\u0010;\u001a\u00020&2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0006H\u0002¢\u0006\u0002\b>\u001a4\u0010@\u001a\u00020\r*\u00020\u00022\u0006\u0010A\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0012\u0010C\u001a\u00020\u0002*\u00020\u00022\u0006\u0010D\u001a\u00020\u0002\u001a\u0012\u0010C\u001a\u00020\n*\u00020\n2\u0006\u0010D\u001a\u00020\u0002\u001a\u001a\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006\u001a\u0012\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010F\u001a\u00020\u0001\u001a\u001d\u0010E\u001a\u00020\n*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\b\u001a\u0015\u0010E\u001a\u00020\n*\u00020\n2\u0006\u0010F\u001a\u00020\u0001H\b\u001a\u0012\u0010G\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010G\u001a\u00020\n*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010H\u001a\u00020\u0002*\u00020\u00022\u0006\u0010I\u001a\u00020\u0002\u001a\u001a\u0010H\u001a\u00020\u0002*\u00020\u00022\u0006\u0010D\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010H\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u0002\u001a\u001a\u0010H\u001a\u00020\n*\u00020\n2\u0006\u0010D\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a+\u0010J\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0014\b\b\u0010K\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00020LH\b\u001a\u001d\u0010J\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010N\u001a\u00020\nH\b\u001a$\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010Q\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010Q\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010R\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010R\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010S\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010S\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001d\u0010T\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010N\u001a\u00020\nH\b\u001a\"\u0010U\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u0002\u001a\u001a\u0010U\u001a\u00020\u0002*\u00020\u00022\u0006\u0010F\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\u0002\u001a%\u0010U\u001a\u00020\n*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u0002H\b\u001a\u001d\u0010U\u001a\u00020\n*\u00020\n2\u0006\u0010F\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\u0002H\b\u001a=\u0010V\u001a\b\u0012\u0004\u0012\u00020\n03*\u00020\u00022\u0012\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0<\"\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0006¢\u0006\u0002\u0010W\u001a0\u0010V\u001a\b\u0012\u0004\u0012\u00020\n03*\u00020\u00022\n\u0010;\u001a\u00020&\"\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0006\u001a/\u0010V\u001a\b\u0012\u0004\u0012\u00020\n03*\u00020\u00022\u0006\u0010I\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010=\u001a\u00020\u0006H\u0002¢\u0006\u0002\bX\u001a%\u0010V\u001a\b\u0012\u0004\u0012\u00020\n03*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010=\u001a\u00020\u0006H\b\u001a=\u0010Y\u001a\b\u0012\u0004\u0012\u00020\n01*\u00020\u00022\u0012\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0<\"\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0006¢\u0006\u0002\u0010Z\u001a0\u0010Y\u001a\b\u0012\u0004\u0012\u00020\n01*\u00020\u00022\n\u0010;\u001a\u00020&\"\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0006\u001a\u001c\u0010[\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010[\u001a\u00020\r*\u00020\u00022\u0006\u0010D\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a$\u0010[\u001a\u00020\r*\u00020\u00022\u0006\u0010D\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0012\u0010\\\u001a\u00020\u0002*\u00020\u00022\u0006\u0010F\u001a\u00020\u0001\u001a\u001d\u0010\\\u001a\u00020\u0002*\u00020\n2\u0006\u0010]\u001a\u00020\u00062\u0006\u0010^\u001a\u00020\u0006H\b\u001a\u001f\u0010_\u001a\u00020\n*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u0006H\b\u001a\u0012\u0010_\u001a\u00020\n*\u00020\u00022\u0006\u0010F\u001a\u00020\u0001\u001a\u0012\u0010_\u001a\u00020\n*\u00020\n2\u0006\u0010F\u001a\u00020\u0001\u001a\u001c\u0010`\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010`\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010a\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010a\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010b\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010b\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010c\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010c\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a\n\u0010d\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010d\u001a\u00020\u0002*\u00020\u00022\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0LH\b\u001a\u0016\u0010d\u001a\u00020\u0002*\u00020\u00022\n\u0010%\u001a\u00020&\"\u00020\u0011\u001a\r\u0010d\u001a\u00020\n*\u00020\nH\b\u001a!\u0010d\u001a\u00020\n*\u00020\n2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0LH\b\u001a\u0016\u0010d\u001a\u00020\n*\u00020\n2\n\u0010%\u001a\u00020&\"\u00020\u0011\u001a\n\u0010f\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010f\u001a\u00020\u0002*\u00020\u00022\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0LH\b\u001a\u0016\u0010f\u001a\u00020\u0002*\u00020\u00022\n\u0010%\u001a\u00020&\"\u00020\u0011\u001a\r\u0010f\u001a\u00020\n*\u00020\nH\b\u001a!\u0010f\u001a\u00020\n*\u00020\n2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0LH\b\u001a\u0016\u0010f\u001a\u00020\n*\u00020\n2\n\u0010%\u001a\u00020&\"\u00020\u0011\u001a\n\u0010g\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010g\u001a\u00020\u0002*\u00020\u00022\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0LH\b\u001a\u0016\u0010g\u001a\u00020\u0002*\u00020\u00022\n\u0010%\u001a\u00020&\"\u00020\u0011\u001a\r\u0010g\u001a\u00020\n*\u00020\nH\b\u001a!\u0010g\u001a\u00020\n*\u00020\n2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0LH\b\u001a\u0016\u0010g\u001a\u00020\n*\u00020\n2\n\u0010%\u001a\u00020&\"\u00020\u0011\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006h"}, mo10386c = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "", "getLastIndex", "(Ljava/lang/CharSequence;)I", "commonPrefixWith", "", "other", "ignoreCase", "", "commonSuffixWith", "contains", "char", "", "regex", "Lkotlin/text/Regex;", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", "", "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", "index", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", "string", "indexOfAny", "chars", "", "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", "", "matches", "orEmpty", "padEnd", "length", "padChar", "padStart", "rangesDelimitedBy", "delimiters", "", "limit", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", "start", "end", "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"})
/* renamed from: b.j.v */
/* compiled from: Strings.kt */
class C3208v extends C3207u {

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "Lkotlin/Pair;", "", "", "startIndex", "invoke"})
    /* renamed from: b.j.v$a */
    /* compiled from: Strings.kt */
    static final class C3209a extends C1490k implements C1461m<CharSequence, Integer, C3221p<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ char[] f8619a;

        /* renamed from: b */
        final /* synthetic */ boolean f8620b;

        C3209a(char[] cArr, boolean z) {
            this.f8619a = cArr;
            this.f8620b = z;
            super(2);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6920a(Object obj, Object obj2) {
            return mo10380a((CharSequence) obj, ((Number) obj2).intValue());
        }

        /* renamed from: a */
        public final C3221p<Integer, Integer> mo10380a(CharSequence charSequence, int i) {
            C1489j.m6972b(charSequence, "$receiver");
            int a = C3199m.m14772a(charSequence, this.f8619a, i, this.f8620b);
            if (a < 0) {
                return null;
            }
            return C3226t.m14841a(Integer.valueOf(a), Integer.valueOf(1));
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "Lkotlin/Pair;", "", "", "startIndex", "invoke"})
    /* renamed from: b.j.v$b */
    /* compiled from: Strings.kt */
    static final class C3210b extends C1490k implements C1461m<CharSequence, Integer, C3221p<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ List f8621a;

        /* renamed from: b */
        final /* synthetic */ boolean f8622b;

        C3210b(List list, boolean z) {
            this.f8621a = list;
            this.f8622b = z;
            super(2);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6920a(Object obj, Object obj2) {
            return mo10381a((CharSequence) obj, ((Number) obj2).intValue());
        }

        /* renamed from: a */
        public final C3221p<Integer, Integer> mo10381a(CharSequence charSequence, int i) {
            C1489j.m6972b(charSequence, "$receiver");
            C3221p a = C3208v.m14800b(charSequence, (Collection<String>) this.f8621a, i, this.f8622b, false);
            if (a != null) {
                return C3226t.m14841a(a.mo10387a(), Integer.valueOf(((String) a.mo10388b()).length()));
            }
            return null;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo10386c = {"<anonymous>", "", "it", "Lkotlin/ranges/IntRange;", "invoke"})
    /* renamed from: b.j.v$c */
    /* compiled from: Strings.kt */
    static final class C3211c extends C1490k implements C1450b<C1515c, String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f8623a;

        C3211c(CharSequence charSequence) {
            this.f8623a = charSequence;
            super(1);
        }

        /* renamed from: a */
        public final String mo6756a(C1515c cVar) {
            C1489j.m6972b(cVar, "it");
            return C3199m.m14783a(this.f8623a, cVar);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo10386c = {"<anonymous>", "", "it", "Lkotlin/ranges/IntRange;", "invoke"})
    /* renamed from: b.j.v$d */
    /* compiled from: Strings.kt */
    static final class C3212d extends C1490k implements C1450b<C1515c, String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f8624a;

        C3212d(CharSequence charSequence) {
            this.f8624a = charSequence;
            super(1);
        }

        /* renamed from: a */
        public final String mo6756a(C1515c cVar) {
            C1489j.m6972b(cVar, "it");
            return C3199m.m14783a(this.f8624a, cVar);
        }
    }

    /* renamed from: a */
    public static final C1515c m14773a(CharSequence charSequence) {
        C1489j.m6972b(charSequence, "$receiver");
        return new C1515c(0, charSequence.length() - 1);
    }

    /* renamed from: b */
    public static final int m14794b(CharSequence charSequence) {
        C1489j.m6972b(charSequence, "$receiver");
        return charSequence.length() - 1;
    }

    /* renamed from: a */
    public static final String m14783a(CharSequence charSequence, C1515c cVar) {
        C1489j.m6972b(charSequence, "$receiver");
        C1489j.m6972b(cVar, "range");
        return charSequence.subSequence(cVar.mo6984f().intValue(), cVar.mo6985g().intValue() + 1).toString();
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ String m14785a(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return C3199m.m14784a(str, c, str2);
    }

    /* renamed from: a */
    public static final String m14784a(String str, char c, String str2) {
        C1489j.m6972b(str, "$receiver");
        C1489j.m6972b(str2, "missingDelimiterValue");
        int a = C3199m.m14767a((CharSequence) str, c, 0, false, 6, (Object) null);
        if (a == -1) {
            return str2;
        }
        String substring = str.substring(0, a);
        C1489j.m6969a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ String m14788a(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return C3199m.m14787a(str, str2, str3);
    }

    /* renamed from: a */
    public static final String m14787a(String str, String str2, String str3) {
        C1489j.m6972b(str, "$receiver");
        C1489j.m6972b(str2, "delimiter");
        C1489j.m6972b(str3, "missingDelimiterValue");
        int a = C3199m.m14771a((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (a == -1) {
            return str3;
        }
        String substring = str.substring(0, a);
        C1489j.m6969a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ String m14802b(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return C3199m.m14801b(str, c, str2);
    }

    /* renamed from: b */
    public static final String m14801b(String str, char c, String str2) {
        C1489j.m6972b(str, "$receiver");
        C1489j.m6972b(str2, "missingDelimiterValue");
        int a = C3199m.m14767a((CharSequence) str, c, 0, false, 6, (Object) null);
        if (a == -1) {
            return str2;
        }
        String substring = str.substring(a + 1, str.length());
        C1489j.m6969a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ String m14804b(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return C3199m.m14803b(str, str2, str3);
    }

    /* renamed from: b */
    public static final String m14803b(String str, String str2, String str3) {
        C1489j.m6972b(str, "$receiver");
        C1489j.m6972b(str2, "delimiter");
        C1489j.m6972b(str3, "missingDelimiterValue");
        int a = C3199m.m14771a((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (a == -1) {
            return str3;
        }
        String substring = str.substring(a + str2.length(), str.length());
        C1489j.m6969a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c */
    public static final String m14809c(String str, char c, String str2) {
        C1489j.m6972b(str, "$receiver");
        C1489j.m6972b(str2, "missingDelimiterValue");
        int b = C3199m.m14796b((CharSequence) str, c, 0, false, 6, (Object) null);
        if (b == -1) {
            return str2;
        }
        String substring = str.substring(0, b);
        C1489j.m6969a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c */
    public static final String m14811c(String str, String str2, String str3) {
        C1489j.m6972b(str, "$receiver");
        C1489j.m6972b(str2, "delimiter");
        C1489j.m6972b(str3, "missingDelimiterValue");
        int b = C3199m.m14798b((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (b == -1) {
            return str3;
        }
        String substring = str.substring(0, b);
        C1489j.m6969a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c */
    public static /* synthetic */ String m14810c(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return C3199m.m14814d(str, c, str2);
    }

    /* renamed from: d */
    public static final String m14814d(String str, char c, String str2) {
        C1489j.m6972b(str, "$receiver");
        C1489j.m6972b(str2, "missingDelimiterValue");
        int b = C3199m.m14796b((CharSequence) str, c, 0, false, 6, (Object) null);
        if (b == -1) {
            return str2;
        }
        String substring = str.substring(b + 1, str.length());
        C1489j.m6969a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static final String m14786a(String str, CharSequence charSequence) {
        C1489j.m6972b(str, "$receiver");
        C1489j.m6972b(charSequence, "prefix");
        if (!C3199m.m14793a((CharSequence) str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C1489j.m6969a((Object) substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: a */
    public static final boolean m14791a(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C1489j.m6972b(charSequence, "$receiver");
        C1489j.m6972b(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C3178a.m14710a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ boolean m14790a(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return C3199m.m14789a(charSequence, c, z);
    }

    /* renamed from: a */
    public static final boolean m14789a(CharSequence charSequence, char c, boolean z) {
        C1489j.m6972b(charSequence, "$receiver");
        return charSequence.length() > 0 && C3178a.m14710a(charSequence.charAt(0), c, z);
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ boolean m14806b(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return C3199m.m14805b(charSequence, c, z);
    }

    /* renamed from: b */
    public static final boolean m14805b(CharSequence charSequence, char c, boolean z) {
        C1489j.m6972b(charSequence, "$receiver");
        return charSequence.length() > 0 && C3178a.m14710a(charSequence.charAt(C3199m.m14794b(charSequence)), c, z);
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ boolean m14793a(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return C3199m.m14792a(charSequence, charSequence2, z);
    }

    /* renamed from: a */
    public static final boolean m14792a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C1489j.m6972b(charSequence, "$receiver");
        C1489j.m6972b(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C3199m.m14761b((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return C3199m.m14791a(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: a */
    public static final int m14772a(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C1489j.m6972b(charSequence, "$receiver");
        C1489j.m6972b(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int c = C1517d.m7048c(i, 0);
            int b = C3199m.m14794b(charSequence);
            if (c <= b) {
                while (true) {
                    char charAt = charSequence.charAt(c);
                    int length = cArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z2 = false;
                            break;
                        } else if (C3178a.m14710a(cArr[i2], charAt, z)) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z2) {
                        if (c == b) {
                            break;
                        }
                        c++;
                    } else {
                        return c;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C1406e.m6785a(cArr), i);
    }

    /* renamed from: b */
    public static final int m14799b(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C1489j.m6972b(charSequence, "$receiver");
        C1489j.m6972b(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int d = C1517d.m7049d(i, C3199m.m14794b(charSequence)); d >= 0; d--) {
                char charAt = charSequence.charAt(d);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C3178a.m14710a(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return d;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C1406e.m6785a(cArr), i);
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ int m14769a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m14768a(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* renamed from: a */
    private static final int m14768a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C1512a aVar;
        if (!z2) {
            aVar = new C1515c(C1517d.m7048c(i, 0), C1517d.m7049d(i2, charSequence.length()));
        } else {
            aVar = C1517d.m7045a(C1517d.m7049d(i, C3199m.m14794b(charSequence)), C1517d.m7048c(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int a = aVar.mo6973a();
            int b = aVar.mo6974b();
            int c = aVar.mo6975c();
            if (c <= 0 ? a >= b : a <= b) {
                while (true) {
                    if (!C3199m.m14791a(charSequence2, 0, charSequence, a, charSequence2.length(), z)) {
                        if (a == b) {
                            break;
                        }
                        a += c;
                    } else {
                        return a;
                    }
                }
            }
        } else {
            int a2 = aVar.mo6973a();
            int b2 = aVar.mo6974b();
            int c2 = aVar.mo6975c();
            if (c2 <= 0 ? a2 >= b2 : a2 <= b2) {
                while (true) {
                    if (!C3199m.m14757a((String) charSequence2, 0, (String) charSequence, a2, charSequence2.length(), z)) {
                        if (a2 == b2) {
                            break;
                        }
                        a2 += c2;
                    } else {
                        return a2;
                    }
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C3221p<Integer, String> m14800b(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        Object obj;
        Object obj2;
        C3221p<Integer, String> pVar = null;
        if (z || collection.size() != 1) {
            C1512a cVar = !z2 ? new C1515c(C1517d.m7048c(i, 0), charSequence.length()) : C1517d.m7045a(C1517d.m7049d(i, C3199m.m14794b(charSequence)), 0);
            if (charSequence instanceof String) {
                int a = cVar.mo6973a();
                int b = cVar.mo6974b();
                int c = cVar.mo6975c();
                if (c <= 0 ? a >= b : a <= b) {
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (C3199m.m14757a(str, 0, (String) charSequence, a, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (a == b) {
                                break;
                            }
                            a += c;
                        } else {
                            return C3226t.m14841a(Integer.valueOf(a), str2);
                        }
                    }
                }
            } else {
                int a2 = cVar.mo6973a();
                int b2 = cVar.mo6974b();
                int c2 = cVar.mo6975c();
                if (c2 <= 0 ? a2 >= b2 : a2 <= b2) {
                    while (true) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (C3199m.m14791a((CharSequence) str3, 0, charSequence, a2, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (a2 == b2) {
                                break;
                            }
                            a2 += c2;
                        } else {
                            return C3226t.m14841a(Integer.valueOf(a2), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) C1415k.m6882f((Iterable<? extends T>) collection);
        int a3 = !z2 ? C3199m.m14771a(charSequence, str5, i, false, 4, (Object) null) : C3199m.m14798b(charSequence, str5, i, false, 4, (Object) null);
        if (a3 >= 0) {
            pVar = C3226t.m14841a(Integer.valueOf(a3), str5);
        }
        return pVar;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ int m14767a(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return C3199m.m14766a(charSequence, c, i, z);
    }

    /* renamed from: a */
    public static final int m14766a(CharSequence charSequence, char c, int i, boolean z) {
        C1489j.m6972b(charSequence, "$receiver");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return C3199m.m14772a(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ int m14771a(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return C3199m.m14770a(charSequence, str, i, z);
    }

    /* renamed from: a */
    public static final int m14770a(CharSequence charSequence, String str, int i, boolean z) {
        C1489j.m6972b(charSequence, "$receiver");
        C1489j.m6972b(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m14769a(charSequence, str, i, charSequence.length(), z, false, 16, null);
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ int m14796b(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = C3199m.m14794b(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return C3199m.m14795b(charSequence, c, i, z);
    }

    /* renamed from: b */
    public static final int m14795b(CharSequence charSequence, char c, int i, boolean z) {
        C1489j.m6972b(charSequence, "$receiver");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return C3199m.m14799b(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ int m14798b(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = C3199m.m14794b(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return C3199m.m14797b(charSequence, str, i, z);
    }

    /* renamed from: b */
    public static final int m14797b(CharSequence charSequence, String str, int i, boolean z) {
        C1489j.m6972b(charSequence, "$receiver");
        C1489j.m6972b(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i);
        }
        return m14768a(charSequence, (CharSequence) str, i, 0, z, true);
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ boolean m14808b(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return C3199m.m14807b(charSequence, charSequence2, z);
    }

    /* renamed from: b */
    public static final boolean m14807b(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C1489j.m6972b(charSequence, "$receiver");
        C1489j.m6972b(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (C3199m.m14771a(charSequence, (String) charSequence2, 0, z, 2, (Object) null) < 0) {
                return false;
            }
        } else {
            if (m14769a(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) < 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ boolean m14813c(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return C3199m.m14812c(charSequence, c, z);
    }

    /* renamed from: c */
    public static final boolean m14812c(CharSequence charSequence, char c, boolean z) {
        C1489j.m6972b(charSequence, "$receiver");
        return C3199m.m14767a(charSequence, c, 0, z, 2, (Object) null) >= 0;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ C3160h m14775a(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m14774a(charSequence, cArr, i, z, i2);
    }

    /* renamed from: a */
    private static final C3160h<C1515c> m14774a(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new C3181d<>(charSequence, i, i2, new C3209a(cArr, z));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ C3160h m14779a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m14778a(charSequence, strArr, i, z, i2);
    }

    /* renamed from: a */
    private static final C3160h<C1515c> m14778a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new C3181d<>(charSequence, i, i2, new C3210b(C1406e.m6777a((T[]) strArr), z));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C3160h m14781a(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return C3199m.m14780a(charSequence, strArr, z, i);
    }

    /* renamed from: a */
    public static final C3160h<String> m14780a(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C1489j.m6972b(charSequence, "$receiver");
        C1489j.m6972b(strArr, "delimiters");
        return C3161i.m14688e(m14779a(charSequence, strArr, 0, z, i, 2, (Object) null), new C3211c(charSequence));
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C3160h m14777a(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return C3199m.m14776a(charSequence, cArr, z, i);
    }

    /* renamed from: a */
    public static final C3160h<String> m14776a(CharSequence charSequence, char[] cArr, boolean z, int i) {
        C1489j.m6972b(charSequence, "$receiver");
        C1489j.m6972b(cArr, "delimiters");
        return C3161i.m14688e(m14775a(charSequence, cArr, 0, z, i, 2, (Object) null), new C3212d(charSequence));
    }
}
