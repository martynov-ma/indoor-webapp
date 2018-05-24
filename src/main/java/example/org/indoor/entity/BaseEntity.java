package example.org.indoor.entity;

import javax.persistence.MappedSuperclass;
import java.lang.reflect.Field;

@MappedSuperclass
public abstract class BaseEntity<K> {

    public abstract K getId();

    public abstract void setId(K id);

    @Override
    public String toString() {
        String entityClassName = this.getClass().getSimpleName();
        StringBuilder entityStr = new StringBuilder(entityClassName + "(" + getId());
        Field[] entityFields = this.getClass().getDeclaredFields();
        for (Field field : entityFields) {
            try {
                field.setAccessible(true);
                entityStr.append(", ").append(field.get(this));
            } catch (IllegalAccessException ignored) {}
        }
        entityStr.append(")");
        return entityStr.toString();
    }
}
