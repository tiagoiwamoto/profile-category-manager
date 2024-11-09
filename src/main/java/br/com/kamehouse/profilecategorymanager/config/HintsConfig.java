package br.com.kamehouse.profilecategorymanager.config;

import org.slf4j.LoggerFactory;
import org.slf4j.helpers.NOPLoggerFactory;
import org.slf4j.helpers.SubstituteLogger;
import org.slf4j.helpers.Util;
import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeHint;
import org.springframework.aot.hint.TypeReference;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Configuration
public class HintsConfig implements RuntimeHintsRegistrar {


    @Override
    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
        populateReflectionHints(hints);
    }

    private void populateReflectionHints(final RuntimeHints hints){
        List<TypeReference> list = new ArrayList<>();
        list.add(TypeReference.of(LoggerFactory.class.getName()));
        list.add(TypeReference.of(NOPLoggerFactory.class.getName()));
        list.add(TypeReference.of(SubstituteLogger.class.getName()));
        list.add(TypeReference.of(Util.class.getName()));
        list.forEach(hint -> addConstructorDefault(hints, hint));
    }

    private void addConstructorDefault(RuntimeHints hints, TypeReference type) {
        try{
            hints.reflection().registerType(type, getMembers());
        }catch (Exception e){
            System.out.println("Erro ao registrar classe: " + type);
        }
    }

    private Consumer<TypeHint.Builder> getMembers(){
        return hint -> hint.withMembers(MemberCategory.PUBLIC_CLASSES,MemberCategory.PUBLIC_FIELDS, MemberCategory.INVOKE_DECLARED_METHODS,
                MemberCategory.INVOKE_DECLARED_CONSTRUCTORS, MemberCategory.INVOKE_PUBLIC_CONSTRUCTORS, MemberCategory.INTROSPECT_PUBLIC_METHODS,
                MemberCategory.DECLARED_CLASSES, MemberCategory.DECLARED_FIELDS, MemberCategory.INTROSPECT_DECLARED_CONSTRUCTORS,
                MemberCategory.INTROSPECT_DECLARED_METHODS, MemberCategory.INTROSPECT_PUBLIC_CONSTRUCTORS, MemberCategory.INTROSPECT_PUBLIC_METHODS);
    }

}
