package p073b.p085h.p087b.p088a.p090b.p117g;

import java.io.IOException;
import java.io.InputStream;
import p073b.p085h.p087b.p088a.p090b.p117g.C2406q;

/* renamed from: b.h.b.a.b.g.b */
/* compiled from: AbstractParser */
public abstract class C2367b<MessageType extends C2406q> implements C2409s<MessageType> {

    /* renamed from: a */
    private static final C2378g f7247a = C2378g.m11894b();

    /* renamed from: a */
    private C2425w m11718a(MessageType messagetype) {
        if (messagetype instanceof C2364a) {
            return ((C2364a) messagetype).mo9046N();
        }
        return new C2425w(messagetype);
    }

    /* renamed from: b */
    private MessageType m11719b(MessageType messagetype) {
        if (messagetype == null || messagetype.mo8106h()) {
            return messagetype;
        }
        throw m11718a(messagetype).mo9313a().mo9219a(messagetype);
    }

    /* renamed from: a */
    public MessageType mo9052a(C2371d dVar, C2378g gVar) {
        MessageType messagetype;
        try {
            C2374e h = dVar.mo9085h();
            messagetype = (C2406q) mo8114b(h, gVar);
            h.mo9097a(0);
            return messagetype;
        } catch (C2395k e) {
            throw e.mo9219a(messagetype);
        } catch (C2395k e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    public MessageType mo9059c(C2371d dVar, C2378g gVar) {
        return m11719b((MessageType) mo9052a(dVar, gVar));
    }

    /* renamed from: a */
    public MessageType mo9054a(InputStream inputStream, C2378g gVar) {
        C2374e a = C2374e.m11772a(inputStream);
        MessageType messagetype = (C2406q) mo8114b(a, gVar);
        try {
            a.mo9097a(0);
            return messagetype;
        } catch (C2395k e) {
            throw e.mo9219a(messagetype);
        }
    }

    /* renamed from: b */
    public MessageType mo9062f(InputStream inputStream, C2378g gVar) {
        return m11719b((MessageType) mo9054a(inputStream, gVar));
    }

    /* renamed from: a */
    public MessageType mo9057b(InputStream inputStream) {
        return mo9062f(inputStream, f7247a);
    }

    /* renamed from: c */
    public MessageType mo9058c(InputStream inputStream, C2378g gVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return mo9054a((InputStream) new C2366a(inputStream, C2374e.m11769a(read, inputStream)), gVar);
        } catch (IOException e) {
            throw new C2395k(e.getMessage());
        }
    }

    /* renamed from: d */
    public MessageType mo9061e(InputStream inputStream, C2378g gVar) {
        return m11719b((MessageType) mo9058c(inputStream, gVar));
    }
}
