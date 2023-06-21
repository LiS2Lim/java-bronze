package Study;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import static java.util.stream.Collectors.toList;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface ExecuteLevel {
    int level();
}

class GetMethodList {
    public static void getMethodList(Class t) {
        Method[] methods = t.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }

}

public class Annotation {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        GetMethodList.getMethodList(new Annotation().getClass());

        Annotation an = new Annotation();
        Class<Annotation> anClass = Annotation.class;
        Method method01 = anClass.getDeclaredMethod("method01");
        ExecuteLevel level01 = method01.getAnnotation(ExecuteLevel.class);
        if (level01 != null && level01.level() > 1) {
            method01.invoke(an);
        }
        Method method02 = anClass.getDeclaredMethod("method02");
        ExecuteLevel level02 = method02.getAnnotation(ExecuteLevel.class);
        if (level02 != null && level02.level() > 1) {
            method02.invoke(an);
        }
    }


    @ExecuteLevel(level=1)
    public void method01() {
        System.out.println("method01 is run");
    }

    @ExecuteLevel(level=2)
    public void method02() {
        System.out.println("method02 is run");

    }
}
