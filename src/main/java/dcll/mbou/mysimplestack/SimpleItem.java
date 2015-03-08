package dcll.mbou.mysimplestack;

/**
 * Created by Morgane on 08/03/2015.
 */
public class SimpleItem {

    /**
     * Param object.
     */
    private Object obj;

    /**
     * SimpleItem constructor.
     */
    public SimpleItem() {
    }

    /**
     * SimpleItem with one param.
     * @param obj1 an object.
     */
    public SimpleItem(final Object obj1) {
        this.obj = obj1;
    }

    /**
     * Getter.
     * @return obj an object.
     */
    public final Object getObj() {
        return this.obj;
    }

    /**
     * Setter.
     * @param obj1 an object.
     */
    public final void setObj(final Object obj1) {
        this.obj = obj1;
    }
}
