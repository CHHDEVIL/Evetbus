package com.bwie.dell.buttonknifer;

import android.app.Activity;
import android.view.View;

import java.io.FileDescriptor;
import java.lang.reflect.Field;

public class ButtonKnfe {
    public static void Bind(Activity activity) {
        Class<Activity> aClass = (Class<Activity>) activity.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(BindView.class)) {
                BindView annotation = field.getAnnotation(BindView.class);
                int value = annotation.value();
                View view = activity.findViewById(value);
                try {
                    field.set(activity, view);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
