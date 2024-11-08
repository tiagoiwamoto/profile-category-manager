package br.com.kamehouse.profilecategorymanager.config;

import br.com.kamehouse.profilecategorymanager.grpc.CategoryServiceProto;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcRuntimeHints implements RuntimeHintsRegistrar {


    @Override
    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
        // Registrar as classes gRPC que usam reflexão
        hints.reflection().registerType(CategoryServiceProto.class, hint -> hint.withMembers());

        // Registrar as classes protobuf usadas pelo gRPC
//        hints.reflection().registerType(MyProto.class, hint -> hint.withMembers());
    }

}
