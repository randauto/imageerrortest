package p073b.p085h.p087b.p088a.p090b.p117g;

import java.io.IOException;

/* renamed from: b.h.b.a.b.g.k */
/* compiled from: InvalidProtocolBufferException */
public class C2395k extends IOException {

    /* renamed from: a */
    private C2406q f7313a = null;

    public C2395k(String str) {
        super(str);
    }

    /* renamed from: a */
    public C2395k mo9219a(C2406q qVar) {
        this.f7313a = qVar;
        return this;
    }

    /* renamed from: a */
    public C2406q mo9220a() {
        return this.f7313a;
    }

    /* renamed from: b */
    static C2395k m11983b() {
        return new C2395k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: c */
    static C2395k m11984c() {
        return new C2395k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: d */
    static C2395k m11985d() {
        return new C2395k("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: e */
    static C2395k m11986e() {
        return new C2395k("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: f */
    static C2395k m11987f() {
        return new C2395k("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: g */
    static C2395k m11988g() {
        return new C2395k("Protocol message tag had invalid wire type.");
    }

    /* renamed from: h */
    static C2395k m11989h() {
        return new C2395k("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: i */
    static C2395k m11990i() {
        return new C2395k("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: j */
    static C2395k m11991j() {
        return new C2395k("Protocol message had invalid UTF-8.");
    }
}
