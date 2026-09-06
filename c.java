package z2;

import v2.g;
/* compiled from: r8-map-id-c0d3c884047de8118f2064d4e1d8504d38edaacc94d44b538abe1fcf1e74421f */
/* loaded from: classes.dex */
public final class c extends z2.a {

    /* renamed from: i  reason: collision with root package name */
    public static final a f5636i = new a(null);

    /* renamed from: j  reason: collision with root package name */
    private static final c f5637j = new c(1, 0);

    /* compiled from: r8-map-id-c0d3c884047de8118f2064d4e1d8504d38edaacc94d44b538abe1fcf1e74421f */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        private a() {
        }
    }

    public c(int i4, int i5) {
        super(i4, i5, 1);
    }

    @Override // z2.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (a() == cVar.a() && b() == cVar.b()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // z2.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + b();
    }

    @Override // z2.a
    public boolean isEmpty() {
        if (a() > b()) {
            return true;
        }
        return false;
    }

    @Override // z2.a
    public String toString() {
        return a() + ".." + b();
    }
}
